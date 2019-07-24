//定义controller
app.controller('contentController', function ($scope, $http, $controller) {
	//伪继承
	$controller('baseController', { $scope: $scope });

	//定义一个集合存储选中品牌id
	$scope.adIdList = [];
	$scope.addAD={};
	$scope.ADList = {};
	$scope.addADList={};
	
	$scope.editAD ={};
	// 定义一个函数
	$scope.search = function (page, rows) {
		// 通过http请求远程数据
		$http.get("/AD/query/" + page + "/" + rows).success(
			// 成功回调函数
			// response：就是通过http远程请求回来的数据，一般都是json格式
			function (response) {

				// 设置总记录数
				$scope.paginationConf.totalItems = response.total;

				for (var i = 0; i < response.rows.length; i++) {
					var on = dayjs(response.rows[i].ontime).format('YYYY年MM月DD日 HH:mm:ss');
					response.rows[i].ontime  = dayjs(response.rows[i].ontime).format('YYYY-MM-DD HH:mm:ss');
					response.rows[i].ontimeStr = on;
					var off = dayjs(response.rows[i].offtime).format('YYYY年MM月DD日 HH:mm:ss');
					response.rows[i].offtimeStr = off;
				}
				// 设置分页记录
				$scope.ADList = response.rows;
			});
	}


	// 广告全选
	$scope.selAll = function () {
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}
		// 获取分页记录
		var list = $scope.ADList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].adId);
		}
	}
	//删除广告
	$scope.delAD = function () {
		if (confirm("是否批量删除？") == true) {
			// 提交数据到后台
			$http.post("/AD/deleteADs", $scope.selectIds).success(
				function (response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				}

			);
		}
	}

	//广告开启
	$scope.contentON = function () {
		if (confirm("是否批量开启？") == true) {
			//提交数据到后台
			$http.post("/AD/openADs", $scope.selectIds).success(
				function (response) {
					if (response.status == 200) {

						$scope.reloadList();
					} else {
						alert(response.msg);
					}

				}
			);
		}
	}

	//屏蔽广告
	$scope.contentOFF = function () {
		if (confirm("是否批量屏蔽？") == true) {
			//提交数据到后台
			$http.post("/AD/offADs", $scope.selectIds).success(
				function (response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}

				}
			);
		}

	}
	
	
	
	

	//新建按钮
	$scope.addInit = function () {
		//清空addAD
		//		$scope.addADList  = {};
		//查询广告分类
		$http.post("/adCategory/queryAll",{}).success(
				function (response) {
					$scope.addADList =  response.data;
					console.log(response.data);
				}
			);

	}
	
	$scope.save = function () {
		if (!confirm("你确认要保存吗？")) {
			return;
		}
		$http.post("/AD/insert",$scope.addAD).success(
				function (response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
		
	}

	// 新建上传
	$scope.uploadFile = function () {
		// file1：file标签的id
		$scope.baseUploadFile(file1, "ad").success(function (response) {
			if (response.status == 200) {
				$scope.addAD.pic = response.data;
			} else {
				alert(response.msg);
			}
		})
	}
	
	
	
	
	
	//修改上传
	$scope.uploadFile2 = function(){
		$scope.baseUploadFile(file2, "ad").success(function(response) {
			if (response.status == 200) {
				$scope.editAD.pic = response.data;
			} else {
				alert(response.msg);
			}
		})
		
	}
	
	// 广告静态界面生成
	$scope.adPageCreator = function () {
		$http.post("/AD/ADPageCreator").success(
				function (response) {
						
					alert(response.msg);
				}
			);
	}
	
	
	//编辑查询所有广告分类
	$scope.editContent=function(AD){
		$scope.editAD={};
		$scope.editAD = AD;
		//将日期格式设为标准模式
		var on = dayjs(AD.ontime).format('YYYY/MM/DD/');
		$('#timeON').val(on);
		
		$http.post("/adCategory/queryAllCategory").success(
			function(response){
				$scope.ADCategoryList=response;
				  
			   		for(var i = 0;i < response.length ; i++){
						if(response[i].adCategoryId == $scope.editAD.categoryId){	
						
							break;
						}
						
					   }
			   		$scope.ADCategory=response[i]; 		
			}
		);
		
	}
	
	//广告分类改变
	$scope.ADCategoryChange=function(ADCategory){
		$scope.editAD.categoryId=ADCategory.adCategoryId;
	}
	
	//提交修改按钮
	$scope.updateAD=function(editAD){
		$http.post("/AD/updateAD").success(
		function(response){
			if(response.status=200){
				$scope.reloadList;
			}else{
				alert(response.msg);
			}
			
		});
	}

});