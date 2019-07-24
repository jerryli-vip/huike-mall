//定义controller
app.controller('goodseditController', function ($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope: $scope
	});

	// 商品基本信息
	$scope.goodsbaseBean = {};

	// 产品的规格信息
	$scope.template = {};
	$scope.templateOption = [];
	/**
	 * 1. 规格1 id
	 * 2. 规格1 名称
	 * 3. 规格1 内容
	 * 
	 * 2. 规格2 id
	 * 2. 规格2 名称
	 * 3. 规格2 内容
	 * 4. 规格2 是否选中
	 * 5. 规格选项的数目
	 * 
	 * 
	 * 这个是用来存笛卡尔集的\
	 * $scope.optionDecareList.push({
					// 这里不能用length
					"specId1" : response.data[0].specId,
					"specName1" : response.data[0].specId,
					"specOptionName1" : response.data[0].specId,
					"isSeleted1" : response.data,
					"specId2" : response.data[0].specId,
					"specName2" : response.data[0].specId,
					"specOptionName2" : response.data[0].specId,
					"isSeleted2" : response.data,
					"sellPrice" : response.data,
					"stock" : response.data
					"specOptionNum": 1	
				});
	 */

	$scope.optionDecareList = [];

	// 产品搜索提交的产品搜索条件对象
	$scope.searchBean = {};
	// 商品图片列表
	$scope.imageList = [];
	// 商品图片顺序，从0开始
	$scope.imgOrder = 0;
	// 添加图片的id数组 用来删除用的
	$scope.selectIds = [];
	// 添加图片的弹出窗
	$scope.image = {};

	// 搜索
	$scope.search = function (page, size) {
		// ！！！！！！！！！！！！！！！等改代码时候，只会查询上线的产品
		$scope.searchBean.status=2;
		// $scope.searchBean.
		// 通过http请求远程数据
		$http.post("/product/query/" + page + "/" + size, $scope.searchBean)
			.success(
			// 成功回调函数
			// response：就是通过http远程请求回来的数据，一般都是json格式
			function (response) {
				// 设置总记录数
				$scope.paginationConf.totalItems = response.total;
				// 设置分页记录
				$scope.productList = response.rows;
			});
	}
	// 查询 规格信息
	$scope.selProduct = function (product) {
		$scope.goodsbaseBean.productId = product.productId;
		$scope.goodsbaseBean.goodsName = product.productName;

		$scope.template = {};
		$scope.templateOption = [];
		console.log(product);
		// 查询规格信息
		$http.get("/template/query/" + product.template).success(
			// 成功回调函数
			// response：就是通过http远程请求回来的数据，一般都是json格式

			function (response) {
				if (response.status == 200) {
					$scope.template = angular.fromJson(response.data.specs);
					//				console.log($scope.template);

					// 查询出规格后 再查询规格选项信息
					// 最多有2个规格
					for (var i = 0; i < $scope.template.length && i < 2; i++) {
						$http.get("/specoption/query/" + $scope.template[i].specId)
							.success(function (response) {

								$scope.templateOption.push({
									// 这里不能用length
									"specId": response.data[0].specId,
									"data": response.data,
								});
								// 做笛卡尔积
								$scope.optionDecare($scope.templateOption, $scope.template);
							})
					}

				} else {
					alert(response.msg);
				}
			});

		// 查询出规格后，再查询详细信息

	}

	$scope.optionDecare = function (templateOption, template) {
		// 模板规格选项没存在
		if (!templateOption.length >= 1) {
			return;
		}
		// 默认先初始化一下
		$scope.optionDecareList = [];
		// 当模板规格选项只有一种时 用这个
		if (templateOption.length == 1) {
			var id = 0;
			var opt1 = templateOption[0];
			for (var i = 0; i < opt1.data.length; i++) {
				$scope.optionDecareList.push({
					// 这里不能用length
					"id": id,
					"specId1": opt1.specId,
					"specName1": template[0].specName,
					"specOptionName1": opt1.data[i].optionName,
					"isSeleted1": false,
					"specId2": null,
					"specName2": null,
					"specOptionName2": null,
					"isSeleted2": false,
					"isDefault": false,
					"sellPrice": null,
					"stock": null,
					"specOptionNum": 1
				});
				id++;

			}
			console.log($scope.optionDecareList);
			return;
		}
		// 当模板选项规格有两种时 
		if (templateOption.length == 2) {
			var opt1 = templateOption[0];
			var opt2 = templateOption[1];
			var id = 0;
			for (var i = 0; i < opt1.data.length; i++) {
				for (var j = 0; j < opt2.data.length; j++) {
					/**
					 * 1. 规格1 id
					 * 2. 规格1 名称
					 * 3. 规格1 内容
					 * 2. 规格2 id
					 * 2. 规格2 名称
					 * 3. 规格2 内容
					 * 4. 规格2 是否选中
					 * 这个是用来存笛卡尔集的
					 */
					$scope.optionDecareList.push({
						// 这里不能用length
						"id": id,
						"specId1": opt1.specId,
						"specName1": template[0].specName,
						"specOptionName1": opt1.data[i].optionName,
						"isSeleted1": false,
						"specId2": opt2.specId,
						"specName2": template[1].specName,
						"specOptionName2": opt2.data[j].optionName,
						"isSeleted2": false,
						"isDefault": false,
						"sellPrice": null,
						"stock": null,
						"specOptionNum": 2,
					});
					id++;
				}
			}
			console.log($scope.optionDecareList);
		}
	}

	// 更改选项时候
	$scope.checkOption = function ($event, optionName) {
		//		alert(optionName);
		for (var i = 0; i < $scope.optionDecareList.length; i++) {
			// 如果optionName跟specOptionName1 就说明被选中了
			if ($event.target.checked) {
				if ($scope.optionDecareList[i].specOptionName1 == optionName) {
					$scope.optionDecareList[i].isSeleted1 = true;
				}
				// 2种规格选项时候，判断第二个
				if ($scope.optionDecareList[0].specOptionNum == 2) {
					if ($scope.optionDecareList[i].specOptionName2 == optionName) {
						$scope.optionDecareList[i].isSeleted2 = true;
					}
				}

			} else {
				// else里面是没有取消选中的时候状况
				if ($scope.optionDecareList[i].specOptionName1 == optionName) {
					$scope.optionDecareList[i].isSeleted1 = false;
				}
				if ($scope.optionDecareList[0].specOptionNum == 2) {
					if ($scope.optionDecareList[i].specOptionName2 == optionName) {
						$scope.optionDecareList[i].isSeleted2 = false;
					}
				}
			}
		}

	}
	$scope.changeIsDefault = function (id) {
		for (var i = 0; i < $scope.optionDecareList.length; i++) {
			if ($scope.optionDecareList[i].id == id) {
				$scope.optionDecareList[i].isDefault = true;
			} else {
				$scope.optionDecareList[i].isDefault = false;
			}
		}
		console.log($scope.optionDecareList);

	}
	// 新建上传
	$scope.uploadFile = function () {
		// file1：file标签的id
		$scope.baseUploadFile(file, "goods").success(function (response) {
			if (response.status == 200) {
				$scope.image.imgPath = response.data;
			} else {
				alert(response.msg);
			}
		})
	}

	// 添加图片按钮
	$scope.addImageList = function () {
		if (!$scope.image.color) {
			alert("请添加颜色");
			return;
		}
		if (!$scope.image.imgPath) {
			alert("请上传图片");
			return;
		}
		if ($scope.imageList.length >= 5) {
			alert("最多传5张图片");
			return;
		}
		$scope.imageList.push({
			// 这里不能用length
			"imgOrder": $scope.imgOrder,
			"imgColor": $scope.image.color,
			// 这里用$scope.text难道没问题么？？？？
			"imgPath": $scope.image.imgPath
		});
		console.log($scope.imageList);
		// 后续信息修改
		$scope.imgOrder++;
		$scope.image.color = null;
		$scope.image.imgPath = null;
	}

	// 全选
	$scope.selAll = function () {
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}
		for (var i = 0; i < $scope.imageList.length; i++) {
			$scope.selectIds.push($scope.imageList[i].imgOrder);
		}
	}

	// 选择单个
	$scope.selid = function (id) {
		$scope.selectIds.push(id);
	}

	// 删除图片
	$scope.deleteImage = function () {
		// console.log($scope.imageList);
		// console.log($scope.selectIds);
		for (var i = 0; i < $scope.selectIds.length; i++) {
			for (var j = 0; j < $scope.imageList.length; j++) {
				if ($scope.imageList[j].imgOrder == $scope.selectIds[i]) {
					// 将图片列表中删除
					$scope.imageList.splice(j, 1);
				}
			}
		}

	}


	// 总体选选择出来
	$scope.save = function () {

		if ($scope.goodsbaseBean.productId == null) {
			alert("未选择产品");
			return;
		}
		if (!$scope.imageList.length > 0) {
			alert("商品图片不能为空,请上传图片");
			return;
		}
		var flag = false;

		if (!$scope.optionDecareList.length >= 1) {
			alert("商品模板不错在，请重新检测");
			return;


		} else if ($scope.optionDecareList[0].specOptionNum == 1) {
			for (var i = 0; i < $scope.optionDecareList.length; i++) {
				if ($scope.optionDecareList[i].isSeleted1 == true &&
					(($scope.optionDecareList[i].sellPrice > 0 && !$scope.optionDecareList[i].stock > 0) ||
						(!$scope.optionDecareList[i].sellPrice > 0 && $scope.optionDecareList[i].stock > 0)
					)) {
					alert("商品的价格或者库存不能只填写一部分");
					return;

				}

				// 如果默认的 则必须有库存和价格
				if ($scope.optionDecareList[i].isSeleted1 == true &&
					$scope.optionDecareList[i].isDefault == true &&
					(!$scope.optionDecareList[i].sellPrice > 0 || !$scope.optionDecareList[i].stock > 0)
				) {
					alert("1默认值必须有价格和库存");
					return;
				}

				// 如果默认的 则必须有库存和价格
				if ($scope.optionDecareList[i].isSeleted1 == true &&
					$scope.optionDecareList[i].isDefault == true &&
					$scope.optionDecareList[i].sellPrice > 0 && $scope.optionDecareList[i].stock > 0
				) {
					flag = true;
				}
			}


		} else {
			for (var i = 0; i < $scope.optionDecareList.length; i++) {
				if ($scope.optionDecareList[i].isSeleted1 == true && $scope.optionDecareList[i].isSeleted2 == true &&
					(($scope.optionDecareList[i].sellPrice > 0 && !$scope.optionDecareList[i].stock > 0) ||
						(!$scope.optionDecareList[i].sellPrice > 0 && $scope.optionDecareList[i].stock > 0)
					)) {
					alert("商品的价格或者库存不能只填写一部分");
					return;

				}

				// 如果默认的 则必须有库存和价格
				if ($scope.optionDecareList[i].isSeleted1 == true && $scope.optionDecareList[i].isSeleted2 == true &&
					$scope.optionDecareList[i].isDefault == true &&
					(!$scope.optionDecareList[i].sellPrice > 0 || !$scope.optionDecareList[i].stock > 0)
				) {
					alert("1默认值必须有价格和库存");
					return;
				}

				// 如果默认的 则必须有库存和价格
				if ($scope.optionDecareList[i].isSeleted1 == true && $scope.optionDecareList[i].isSeleted2 == true &&
					$scope.optionDecareList[i].isDefault == true &&
					$scope.optionDecareList[i].sellPrice > 0 && $scope.optionDecareList[i].stock > 0
				) {
					flag = true;
				}
			}

		}


		if (!flag) {
			alert("产品不能没有价格或者库存或没默认");
			return;
		}

		$scope.goodsVo = {
			// 这里不能用length
			"imgList": $scope.imageList,
			"optionDecareList": $scope.optionDecareList,
			"productId": $scope.goodsbaseBean.productId,
			"goodsName": $scope.goodsbaseBean.goodsName,
			"optionNum": $scope.optionDecareList[0].specOptionNum,
		};
		console.log($scope.goodsVo);
		$http.post("/goods/save", $scope.goodsVo).success(
			// 成功回调函数
			// response：就是通过http远程请求回来的数据，一般都是json格式
			function (response) {
				if (response.status == 200) {
					alert(response.msg);
				} else {
					alert(response.msg);
				}
			});
	}

});