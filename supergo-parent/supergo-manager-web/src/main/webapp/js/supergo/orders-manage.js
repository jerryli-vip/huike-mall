//	定义一个控制器
app.controller('manageController',function($scope,$http,$controller){
	
	//	伪继承
	$controller('baseController',{$scope:$scope});
	
	//	分页查询
	$scope.searchBean={};		//定义搜索对象
	$scope.search = function(page,rows){
		// 通过HTTP请求远程数据
		$http.post("/operatorOrders/queryOrder/"+page+"/"+rows,$scope.searchBean).success(
			// 成功回调函数
			// response就是通过HTTP请求回来的数据，一般都是JSON格式
			function(response){
				console.log(response)
				// 设置总记录数
				$scope.paginationConf.totalItems = response.total;
				for (var i = 0; i< response.rows.length; i++) {
					if(response.rows[i].createTime == null){
						response.rows[i].createTime = null;
					}else{
						response.rows[i].createTime = dayjs(response.rows[i].createTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
				// 设置分页记录
				$scope.ManageList = response.rows;
				
			});
	}
	
	//	订单详情
	$scope.queryDetails=function(ordersubId){
		//	订单信息
		$http.get('/operatorOrders/order/'+ordersubId).success(
			function(response){
				$scope.orderList=response.data;
			});
		 //	订单明细
		$http.get('/operatorOrders/queryOrderItem/'+ordersubId).success(
				function(response){
					$scope.orderItemList=response.data;
				});
		//	收货人
		$http.get('/operatorOrders/queryOrderdelivery/'+ordersubId).success(
				function(response){
					$scope.deliveryList=response.data;
				});
		//	订单状态
		$http.get('/operatorOrders/querySubOrderStatus/'+ordersubId).success(
				function(response){
					$scope.subOrderList=response.data;
				});
	}
	
	//	退换货申请弹窗初始化
	$scope.manage={};
	$scope.initApply=function(manage){
		$scope.manage=manage;
		console.log($scope.manage.ordersubId);
		$http.get('/operatorOrders/queryReturnOrderItem/'+$scope.manage.ordersubId).success(
			function(response){
				$scope.returnOrderItemList=response.data;
			});
	}
	//获取被退换货商品的数据
	$scope.Goods={};
	$scope.bangDingReturn=function(REOrderItem){
		$scope.Goods.goodsId=REOrderItem.goodsId;
		$scope.Goods.ordersubId=REOrderItem.ordersubId;
		console.log("goodsId : "+$scope.Goods.goodsId);
		console.log("ordersubId : "+$scope.Goods.ordersubId);
		
	}
	// 退货申请
	$scope.returnItem=function(){
		console.log($scope.Goods);
		$http.post('/operatorOrders/returnGoodsRequest/',$scope.Goods).success(
			function(response){
				if (response.status == 200) {
					alert(response.msg);
				} else {
					alert(response.msg);
				}
			});
		}
	$scope.Goods={};
	$scope.bangDingExchange=function(REOrderItem){
		$scope.Goods.goodsId=REOrderItem.goodsId;
		$scope.Goods.ordersubId=REOrderItem.ordersubId;
		console.log("goodsId : "+$scope.Goods.goodsId);
		console.log("ordersubId : "+$scope.Goods.ordersubId);
		
	}
	// 换货申请
	$scope.exchangeItem=function(REOrderItem){
		console.log($scope.Goods);
		$http.post('/operatorOrders/exchangeGoodsRequest/',$scope.Goods).success(
				function(response){
					if (response.status == 200) {
						alert(response.msg);
					} else {
						alert(response.msg);
					}
				});
	}
});
