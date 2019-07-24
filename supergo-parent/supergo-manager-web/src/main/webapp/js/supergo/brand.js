//定义controller
app.controller('brandController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/brand/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.brandList = response.rows;
				});
	}

	// 定义新增品牌函数
	$scope.save = function() {
		// 提交数据到后台
		$http.post('/brand/insert', $scope.addBrand).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}

	// 定义删除品牌函数
	$scope.batchDelete = function() {
		if (confirm("是否批量删除？")==true) {
			// 提交数据到后台
			$http.post('/brand/delete', $scope.selectIds).success(
					function(response) {
						if (response.status == 200) {
							$scope.reloadList();
						} else {
							alert(response.msg);
						}
					});
		}

	}

	// 新建上传
	$scope.uploadFile = function() {
		// file1：file标签的id
		$scope.baseUploadFile(file1, "brand").success(function(response) {
			if (response.status == 200) {
				$scope.addBrand.brandLogo = response.data;
			} else {
				alert(response.msg);
			}
		})
	}
	// 修改上传
	$scope.uploadFile2 = function() {
		// file1：file标签的id
		$scope.baseUploadFile(file2, "brand").success(function(response) {
			if (response.status == 200) {
				$scope.editBrand.brandLogo = response.data;
				$scope.editBrand.brandLogoPreview = response.data;
			} else {
				alert(response.msg);
			}
		})
	}

	// 全选
	$scope.selAll = function() {
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}
		// 获取分页记录
		var list = $scope.brandList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].brandId);
		}
	}

	// 定义编辑品牌函数
	$scope.update = function() {
		// 提交数据到后台
		$http.post('/brand/update', $scope.editBrand).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}
	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(brand) {
		// 清除之前的缓存数据
		$scope.editBrand = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editBrand = brand;
	}
});
