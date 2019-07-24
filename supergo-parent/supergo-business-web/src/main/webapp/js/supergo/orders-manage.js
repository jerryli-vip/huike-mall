/*//定义一个自定义模块
//引入分页控件:pagination
var app = angular.module('supergo',['pagination']);

//定义controller
app.controller('manageController',function($scope,$http){
	//定义一个函数
	$scope.queryManageList = function(){
		
		//获取当前页
		var page = $scope.paginationConf.currentPage;
		var rows = $scope.paginationConf.itemsPerPage;
		
		//通过http请求远程数据
		$http.get("/orders/querymanage/"+page+"/"+rows).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.ManageList = response.rows;
			}
		);
	}
	
	//angularjs的分页对象
	$scope.paginationConf = {
			 currentPage: 1,
			 totalItems: 10,
			 itemsPerPage: 10,
			 perPageOptions: [10, 20, 30, 40, 50],
			 onChange: function(){
				 $scope.queryManageList();   	
			 }
	}; 

});*/

//定义一个控制器
app.controller('manageController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	$scope.updatestatus={};
	//定义一个函数
	$scope.search = function(page,rows){
		console.log($scope.searchBean);
		//通过http请求远程数据
		$http.post("/orders/querymanage/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response就是通过http请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				console.log(response.rows);
				for(var i=0;i<response.rows.length;i++){
					if(response.rows[i].createTime == null){
						response.rows[i].createTime = null
					}else{
						response.rows[i].createTime = dayjs(response.rows[i].createTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
				$scope.ManageList = response.rows;
			}
		);
	}
	
	//定义修改订单函数
	/*$scope.editExchange=function(){

		//提交数据到后台
		$http.post('/orders/update',$scope.updateExchange).success(function(response){
			if(response.status==200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	
	
	
	//定义修改订单函数
	$scope.initedit=function(ordersubId){
		$scope.updateExchange={};
		$scope.updateExchange.ordersubId = ordersubId;
		
	}
	//定义修改订单函数
	$scope.editRetuen=function(){

		//提交数据到后台
		$http.post('/orders/updateE',$scope.updateRetuen).success(function(response){
			if(response.status==200){
				$scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	//定义修改订单函数
	$scope.initedit2=function(ordersubId){
		$scope.updateRetuen={};
		$scope.updateRetuen.ordersubId = ordersubId;
		
	}*/
	
	
	
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
		

	}
});

