// 定义controller,$scope用来进行交互,$http用来发请求
app.controller("homepageController", function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});
	
	$scope.menus = function(){
		$http.post('/homepage/menus').success(function(response){
			console.log(response);
			$scope.itemList = response;
		})
	}
	$scope.logout = function(){
		$http.post("/admin/logout").success(function(response){
			if (response.status == 200) {
				alert(response.msg);
				window.location.href="/login.html";
			} else {
				alert(response.msg);
			}
		})
	}
})