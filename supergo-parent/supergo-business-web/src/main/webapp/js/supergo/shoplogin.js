//定义controller
app.controller('shoploginController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});
	$scope.shopUser = {};

	$scope.info = function() {
		// 通过http请求远程数据
		$http.post("/login").success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					if(response.status==200){
						$scope.shopUser= response.data;
						response.data.lastLoginTime = dayjs(response.data.lastLoginTime).format('YYYY年MM月DD日 HH:mm:ss' );
					}else{
						 window.location.href="/shoplogin.html";
					}
				});
	}
	
});