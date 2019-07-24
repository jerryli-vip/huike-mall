
//定义一个控制器
app.controller('returnController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	//定义一个函数
	$scope.search = function(page,rows){
		//通过http请求远程数据
		$http.post("/orders/returngoods/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response就是通过http请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				
					for(var i=0;i<response.rows.length;i++){
						if(response.rows[i].returnGoodsTime == null){
							response.rows[i].returnGoodsTime = null;
						}else{
							response.rows[i].returnGoodsTime = dayjs(response.rows[i].returnGoodsTime).format('YYYY:MM:DD HH:mm:ss' );
						}
				}
					$scope.RetuenList = response.rows;
			}
		);
	}
	
	// 修改为退货寄回状态
	$scope.returnReturn = function() {
		$http.post('/orders/return', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						alert(response.msg);
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}
	// 修改为退货成功状态
	$scope.returnSuccess = function() {
		$http.post('/orders/success', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						alert(response.msg);
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}
	// 修改为退货取消状态
	$scope.returnCancel = function() {
		$http.post('/orders/cancel', $scope.selectIds).success(
				function(response) {
					if (response.status == 200) {
						alert(response.msg);
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
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
		var list = $scope.RetuenList;
		console.log($scope.RetuenList);
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].tbOrder);
		}
		console.log($scope.selectIds);
	}


	 //订单信息
	$scope.queryOrder=function(ordersubId){
		//订单详情
		$http.get('/operatorOrders/queryOrderDetails/'+ordersubId).success(
			function(response){
				$scope.orderList=response.data;
			}			
		);

		 //订单明细
		
			$http.get('/operatorOrders/queryOrderlist/'+ordersubId).success(
				function(response){
					$scope.ordersList=response.data;
				}			
			);
		
		//收货人
		$http.get('/operatorOrders/querydelivery/'+ordersubId).success(
				function(response){
					$scope.deliveryList=response.data;
				}			
			);
		

	}
	
	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditStatus = function(retuen) {
		// 清除之前的缓存数据
		$scope.editModal = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editModal = retuen;
	}
	
	
	$scope.edit = function(retuen) {
		$http.post('/orders/edit', retuen).success(
				function(response) {
					if (response.status == 200) {
						alert(response.msg);
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}
	
});

