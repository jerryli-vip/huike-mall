//定义controller
app.controller('contentCategoryController', function ($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope: $scope
	});
	$scope.searchBean = {};
	$scope.addCategory = {};
	$scope.editCategory = {};
	// 定义一个函数
	$scope.search = function (page, rows) {
		// 通过http请求远程数据
		$http.post("/adCategory/query/" + page + "/" + rows, $scope.searchBean)
			.success(
			// 成功回调函数
			// response：就是通过http远程请求回来的数据，一般都是json格式
			function (response) {
				// 设置总记录数
				$scope.paginationConf.totalItems = response.total;
				// 设置分页记录
				$scope.categoryList = response.rows;
				console.log($scope.categoryList);
			});
	}
	// 新增
	$scope.add = function () {
		console.log($scope.addCategory);
		$http.post('/adCategory/add', $scope.addCategory).success(
			function (response) {
				alert(response.msg);
				if (response.status == 200) {
					$scope.reloadList();
					// 添加成功后，重置变量
					$scope.addCategory = {};
				}
			});
	}
	// 编辑初始化
	$scope.editInit = function (category) {
		$scope.editCategory = {};
		$scope.editCategory = category;
	}
	// 编辑 
	$scope.edit = function () {
		if (!confirm("你确认要保存吗？")) {
			return;
		}
		$http.post('/adCategory/edit', $scope.editCategory).success(
			function (response) {
				if (response.status == 200) {
					$scope.selectIds = [];
					$scope.all = false;
					// 重置selectIds 
					$scope.reloadList();
				}
				alert(response.msg);
			});
	}
	//删除
	$scope.dele = function () {
		if (!confirm("你确认要删除吗？")) {
			return;
		}
		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/adCategory/delete', $scope.selectIds).success(
			function (response) {
				if (response.status == 200) {
					$scope.selectIds = [];
					$scope.all = false;
					// 重置selectIds 
					$scope.reloadList();
				}
				alert(response.msg);
			});

	}
	//开启
	$scope.puton = function () {
		if (!confirm("你确认要开启吗？")) {
			return;
		}
		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/adCategory/puton', $scope.selectIds).success(
			function (response) {
				if (response.status == 200) {
					$scope.selectIds = [];
					$scope.all = false;
					// 重置selectIds 
					$scope.reloadList();
				}
				alert(response.msg);
			});
	}
	// 屏蔽
	$scope.putoff = function () {
		if (!confirm("你确认要屏蔽吗？")) {
			return;
		}
		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/adCategory/putoff', $scope.selectIds).success(
			function (response) {
				if (response.status == 200) {
					$scope.selectIds = [];
					$scope.all = false;
					// 重置selectIds 
					$scope.reloadList();
				}
				alert(response.msg);
			});
	}


	// 全选
	$scope.selAll = function () {
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}

		// 获取分页记录
		var list = $scope.categoryList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].adCategoryId);
		}
	}
});