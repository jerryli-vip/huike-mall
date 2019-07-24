/**
	 * 商家管理分页功能
	 * @author 范江浩
	 */
app.controller('businessManagerController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		
		//alert($scope.searchBean.businessStatus);
		// 通过http请求远程数据
		$http.post("/business/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.businessList = response.rows;
				});
	}
	/**
	 * 传递数据
	 * @author 范江浩
	 */
	$scope.show = function(business){

		//alert(business);
//		$scope.show={};
		$scope.information ={};
		$scope.information = business;
	}
	/**
	 * 商家管理之关闭商家功能
	 * @author 范江浩
	 */
	$scope.close = function(information){
		$http.post('/business/updateCloseBusiness',$scope.information).success(function(response){
			if(response.status == 200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	/**
	 * 商家管理之查看店铺功能
	 * @author 范江浩
	 */
	$scope.see = function(business){
		
		$http.post('/business/queryShop',business).success(function(response){
//			for (var i = 0; i < response.length; i++) {
//				$scope.shopList = response[i];
//				console.log($scope.shopList);
//			}
			$scope.shopList = response;
		});
	}
});