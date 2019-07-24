app.controller('businessController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
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
	$scope.info = function(business){
//		$http.post('/business/info',$scope.business).success(function(response){
//			$scope.
//		});
		//alert(business);
		$scope.information={};
		$scope.information = business;
	}
	/**
	 * 商家审核成功功能
	 * @author 范江浩
	 */
	$scope.auditingSuccess = function(information){
		//alert(information.businessId);
		$http.post('/business/updateAuditingSuccess',$scope.information).success(function(response){
			if(response.status == 200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	/**
	 * 商家审核失败功能
	 * @author 范江浩
	 */
	$scope.auditingFail = function(information){
		$http.post('/business/updateAuditingFail',$scope.information).success(function(response){
			if(response.status == 200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	
	
});
