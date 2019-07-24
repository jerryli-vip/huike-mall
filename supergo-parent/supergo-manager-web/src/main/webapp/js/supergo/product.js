//定义controller
app.controller('productController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	//定义一个函数
	$scope.search = function(page,rows){
		//通过http请求远程数据
		$http.post("/product/query/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
//				alert(response.rows);
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.productList = response.rows;
			}
		);
	}
	/**
	 * 详情回显
	 */
	$scope.showProduct = function(product){
//		alert(product);
		$scope.show={};
		product.createTime = moment(product.createTime).format('YYYY年 MM月 DD日 , h:mm:ss');
		product.updateTime = moment(product.updateTime).format('YYYY年 MM月 DD日 , h:mm:ss');
		$scope.echoProduct = product;
		
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
		var list = $scope.productList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].productId);
		}
	}
	/**
	 * 审核通过
	 */
	$scope.auditingSuccess = function(){
		$http.post('/product/updateAuditingSuccess',$scope.selectIds).success(function(response){
			
			if(response.status == 200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	/**
	 * 传值
	 */
	$scope.transmit = function(product){
		$scope.auditing = product;
	}
	/**
	 * 审核未通过
	 */
	$scope.auditingFail = function() {
//		var data = {
//			'ids' : $scope.selectIds,
//			'reason' : $scope.auditing
//		};
		//alert($scope.auditing.productId);
		//alert($scope.auditing);
//		$http({
//			method : "POST",
//			url : "/product/updateAuditingFail",
//			data : {
//				ids : $scope.selectIds,
//				reason : $scope.auditing
//			}
//		}).success(function(response) {
//			if (response.status == 200) {
//				$scope.reloadList();
//			} else {
//				alert(response.msg);
//			}
//		});  
		
//		for (var i = 0; i < array.length; i++) {
//			var any = $scope.selectIds[i];
		// var any2 = any+"-";
		// alert(any2);

//		var ids = "";
//		for (var i = 0; i < $scope.selectIds.length; i++) {
//
//			ids = $scope.selectIds[i] + '-' + ids;
//		}
//		$http.post("/product/updateAuditingFail/" + ids,
//						$scope.auditing.reason).success(function(response) {
//					// $http.post("/product/updateAuditingFail",{"ids":$scope.selectIds,"reason":$scope.auditing.reason}).success(function(response){
//
//					if (response.status == 200) {
//						$scope.reloadList();
//					} else {
//						alert(response.msg);
//					}
//				});
		$http.post("/product/updateAuditingFail",
				$scope.auditing).success(function(response) {
			// $http.post("/product/updateAuditingFail",{"ids":$scope.selectIds,"reason":$scope.auditing.reason}).success(function(response){

			if (response.status == 200) {
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
		});
	};
	/**
	 * 批量删除
	 */
	// 定义删除品牌函数
	$scope.batchDelete = function() {
		if (confirm("是否批量删除？")==true) {
			alert($scope.selectIds);
			// 提交数据到后台
			$http.post('/product/delete', $scope.selectIds).success(
					function(response) {
						if (response.status == 200) {
							$scope.reloadList();
						} else {
							alert(response.msg);
						}
					});
		}

	}
	/**
	 * 全局导入索引库
	 */
	$scope.updateSolr = function(){
		$http.post('//api.search.supergo.com/itemsearch/importData').success(function(response){
			alert("全局导入中……请稍等……");
			alert("全局导入成功");
		});
	}
	
});