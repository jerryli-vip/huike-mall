//定义controller
app.controller('indexImportController', function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.index = "";

	$scope.importFullIndex = function() {
		if (!confirm("你确认要导入全量索引数据吗？")) {
			return;
		}

		$http.post("/index/importFullIndex/" + $scope.index).success(
				function(response) {
					alert(response);
				});
	}

});