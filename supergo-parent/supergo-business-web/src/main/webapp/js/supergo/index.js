//定义controller
app.controller('indexController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});
	$scope.shopUser = {};

	$scope.info = function() {
		
		$http.post('/index/item').success(function(response){
			console.log(response);
			$scope.itemList = response;
		})
		// 通过http请求远程数据
		$http.get("/info" ).success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					if(response.status==200){
						$scope.shopUser= response.data;
						console.log(dayjs(response.data.lastLoginTime).format('YYYY年MM月DD日 HH:mm:ss' ));
						$scope.shopUser.lastLoginTime=dayjs(response.data.lastLoginTime).format('YYYY年MM月DD日 HH:mm:ss' );
					}else{
						 window.location.href="/shoplogin.html";
					}
				});
	}
});