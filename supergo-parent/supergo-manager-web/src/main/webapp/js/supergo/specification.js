//定义一个控制器
app.controller('specController', function($scope, $controller, $http) {
	
	// 伪继承
	$controller('baseController', {$scope : $scope});
	
	//查询实体 
	$scope.findSpec=function(specId){
		$http.get('/spec/findSpec/'+specId).success(
			function(response){
				$scope.specEdit= response;
			}
		);
	}
	
	$scope.searchBean = {};// 定义搜索对象
	//分页+查询
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/spec/query/" + page + "/" + rows, $scope.searchBean).success(
			// 成功回调函数
			// response就是通过http请求回来的数据，一般都是json格式
			function(response) {
				// 设置总记录数
				$scope.paginationConf.totalItems = response.total;
				// 设置分页记录
				$scope.specList = response.rows;
			});
	}
	/**
	 * 全选
	 */
	$scope.selAll = function() {
		
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}
		// 获取分页记录
		var list = $scope.specList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].specId);
		}
	}
	//删除商品规格
	$scope.batchDelete = function() {
		if(confirm("确认删除吗")==true){
		// 提交数据到后台,将数据封装进selectIds（base_controller.js）集合中，然后进行处理
		$http.post('/spec/delete', $scope.selectIds).success(
			function(response) {
				if (response.status == 200) {
					$scope.reloadList();
				} else {
					alert(response.msg);
				}
			});
		}
	}
	
	//修改+添加
	/*$scope.update = function() {
		var serviceObject;
		if ($scope.spec.specId != null) {
			serviceObject = $http.post('/spec/update', $scope.specEdit);
		} else{
			serviceObject = $http.post('/spec/insertSpec', $scope.specAdd);
		}
		// 提交数据到后台(默认封装成json格式)
		serviceObject.success(
			function(response) {
				if (response.status == 200) {
					$scope.reloadList();
					alert(response.msg);
				} else {
					alert(response.msg);
				}
			});
	}*/
	//修改
	$scope.update = function() {
		$http.post('/spec/update', $scope.specEdit).success(
			function(response) {
				if (response.status == 200) {
					$scope.reloadList();
					alert(response.msg);
				} else {
					alert(response.msg);
				}
			});
	}
	//添加
	$scope.add = function() {
		$http.post('/spec/insertSpec', $scope.specAdd).success(
			function(response) {
				if (response.status == 200) {
					$scope.reloadList();
					alert(response.msg);
				} else {
					alert(response.msg);
				}
			});
	}
	
	// 规格添加--增加表格行
	$scope.addTableRow = function() {
		$scope.specAdd.specOptionList.push({});
	}
	// 规格添加--减少表格行
	$scope.deleTableRow = function(index) {
		$scope.specAdd.specOptionList.splice(index, 1);
	}
	// 规格编辑--增加表格行
	$scope.editAddTableRow = function() {
		$scope.specEdit.specOptionList.push({});
	}
	// 规格编辑--减少表格行
	$scope.editDeleTableRow = function(index) {
		$scope.specEdit.specOptionList.splice(index, 1);
	}


});