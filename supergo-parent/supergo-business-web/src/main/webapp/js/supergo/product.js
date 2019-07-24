//定义controller
app.controller('productController',function($scope,$http,$controller){
	// 伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	// 定义一个函数
	$scope.search = function(page,size){
		//通过http请求远程数据
		$http.post("/product/query/"+page+"/"+size,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.productList = response.rows;
			}
		);
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
		var list = $scope.productList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].productId);
		}
	}
	
	// 批量删除
	$scope.deleteByIds = function() {
		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/product/delete', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
	
	// 批量提审
	$scope.auditingByIds = function() {
		console.log($scope.selectIds);
		// 提交数据到后台
		$http.post('/product/auditing', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
						// 重置selectIds
						$scope.selectIds = [];
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
	
	// 跳转到新增界面
	$scope.add = function(){
		window.location.href = "product_add.html"
	}
	// 跳转到编辑界面，同时传递一个id
	$scope.edit = function(productId){
		window.location.href = "product_edit.html?productId=" + productId;
		/*$state.go('product_edit.html', {productId: productId});*/
	}
	
})