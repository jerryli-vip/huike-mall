//定义一个自定义模块
//引入分页控件:pagination
//var app = angular.module('supergo',['pagination']);

//定义controller
app.controller('refundController',function($scope,$http,$controller){
	
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	$scope.updatestatus={};
	
	//定义一个函数
	$scope.search= function(page,rows){

		//通过http请求远程数据
		$http.post("/refund/query/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				console.log(response.rows);
				for(var i=0;i<response.rows.length;i++){
					if(response.rows[i].returnGoodsTime == null){
						response.rows[i].returnGoodsTime= null
					}else{
						response.rows[i].returnGoodsTime= dayjs(response.rows[i].returnGoodsTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
				for(var i=0;i<response.rows.length;i++){
					if(response.rows[i].applyTime == null){
						response.rows[i].applyTime= null
					}else{
						response.rows[i].applyTime= dayjs(response.rows[i].applyTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
				$scope.refundList = response.rows;
			}
		);
	}
	


    //读取列表数据绑定到表单中  
    //订单信息
	$scope.queryOrder=function(ordersubId){
		//订单详情
		$http.get('http://localhost:8094/detail/queryorder/'+ordersubId).success(
			function(response){
				$scope.orderList=response.data;
			}			
		);

		 //订单明细
		
			$http.get('http://localhost:8094/detail/queryorderlist/'+ordersubId).success(
				function(response){
					$scope.ordersList=response.data;
				}			
			);
		
		//收货人
		$http.get('http://localhost:8094/detail/querydelivery/'+ordersubId).success(
				function(response){
					$scope.deliveryList=response.data;
				}			
			);
		//退款单
     $http.get('http://localhost:8094/detail/querystatus/'+ordersubId).success(
				function(response){
					$scope.refundsList=response.data;
					$scope.refundsList.returnGoodsTime=dayjs(response.data.returnGoodsTime).format('YYYY:MM:DD HH:mm:ss' );
					$scope.refundsList.applyTime=dayjs(response.data.applyTime).format('YYYY:MM:DD HH:mm:ss' );
					
				}	/*$scope.refundsList=response.data;*/
							
			);
    

	}
	
	// 批量退款处理中
		$scope.sendback= function() {

			// 提交数据到后台
			$http.post('/refund/refunding', $scope.selectIds).success(
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
		
		// 批量退款成功
		$scope.success= function() {

			// 提交数据到后台
			$http.post('/refund/refundsuccess', $scope.selectIds).success(
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
		
		
		
		// 批量退款失败
		$scope.fail= function() {

			// 提交数据到后台
			$http.post('/refund/refundfail', $scope.selectIds).success(
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
		

		// 批量取消退款
		$scope.cancel= function() {

			// 提交数据到后台
			$http.post('/refund/refundcancel', $scope.selectIds).success(
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
		
	
		// 定义编辑回显
		// 参数：就是被修改行的记录对象
		$scope.showEditPage = function(echo) {
			// 清除之前的缓存数据
			$scope.editModal = {};
			// 将选中的一行数据，赋值给新的变量
			$scope.editModal =echo;
		  }
		
		$scope.edit = function(echo) {
			$http.post('/refund/edit',echo).success(
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
			var list = $scope.refundList;
			for (var i = 0; i < list.length; i++) {
				$scope.selectIds.push(list[i].refundId);
			}
		}	
	
	
	

});