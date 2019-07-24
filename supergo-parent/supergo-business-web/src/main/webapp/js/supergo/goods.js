//定义controller
app.controller('goodsController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});
	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/goods/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.goodsList = response.rows;
					$scope.all = false;
					$scope.selectIds = [];
				});
	}
	// 批量删除
	$scope.deleteByIds = function() {
//		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/goods/delete', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}

	// 批量上架
	$scope.puton = function() {

		// 提交数据到后台
		$http.post('/goods/puton', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
	// 批量下架
	$scope.putoff = function() {

		// 提交数据到后台
		$http.post('/goods/putoff', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
	// 修改库存
	$scope.changeStock = function() {
		var num = $scope.stocknum;
		if (!num) {
			alert("请输入数值");
			return;

		}
		$http.post('/goods/stock/' + num, $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});

	}

	// 修改价格
	$scope.changePrice = function() {
		var num = $scope.pricenum;
		if (!num) {
			alert("请输入数值");
			return;

		}
		$http.post('/goods/price/' + num, $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});

	}
	
	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(goods) {
		// 清除之前的缓存数据
		$scope.goodsEdit = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.goodsEdit = goods;
	}
	
	
	$scope.edit = function(goods) {
		$http.post('/goods/edit', goods).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.all = false;
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
	
	
	// $scope.initstock = function() {
	// console.log($scope.selectIds);
	// $scope.stockids = "";
	// for (var i = 0; i < $scope.selectIds.length; i++) {
	// $scope.stockids = $scope.selectIds[i] + "," + $scope.stockids;
	// }
	// }

	// 全选
	$scope.selAll = function() {
		// 清空之前选中的选项
		$scope.selectIds = [];
		// 这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if ($scope.all) {
			return;
		}
		// 获取分页记录
		var list = $scope.goodsList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].goodsId);
		}
	}

});