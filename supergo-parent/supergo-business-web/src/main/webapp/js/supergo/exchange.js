

//定义controller
app.controller('exchangeController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	$scope.updatestatus={};
	//定义一个函数
	$scope.search = function(page,rows,ordersubId){
		
		//获取当前页
		//var page = $scope.paginationConf.currentPage;
		//var rows = $scope.paginationConf.itemsPerPage;
		
		//通过http请求远程数据
		$http.post("/exchange/query/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				console.log(response.rows);
				$scope.exchangeList = response.rows;
				for(var i=0;i<response.rows.length;i++){
					if(response.rows[i].exchangeGoodsTime == null){
						response.rows[i].exchangeGoodsTime= null
					}else{
						response.rows[i].exchangeGoodsTime= dayjs(response.rows[i].exchangeGoodsTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
				for(var i=0;i<response.rows.length;i++){
					if(response.rows[i].applyTime == null){
						response.rows[i].applyTime= null
					}else{
						response.rows[i].applyTime= dayjs(response.rows[i].applyTime).format('YYYY:MM:DD HH:mm:ss' );
					}
				}
	
             
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
	
	    //换货单
	             $http.get('http://localhost:8094/detail/queryexstatus/'+ordersubId).success(
					function(response){
						$scope.exchangesList=response.data;
						$scope.exchangesList.exchangeGoodsTime=dayjs(response.data.exchangeGoodsTime).format('YYYY:MM:DD HH:mm:ss' );
						$scope.exchangesList.applyTime=dayjs(response.data.applyTime).format('YYYY:MM:DD HH:mm:ss' );
					}			
				);
	
		}
		
	// 批量换货寄回
		$scope.sendback= function() {

			// 提交数据到后台
			$http.post('/exchange/send', $scope.selectIds).success(
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
		
		// 批量换货成功
		$scope.success= function() {

			// 提交数据到后台
			$http.post('/exchange/exchangesuccess', $scope.selectIds).success(
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
		
		
		
		// 批量换货取消
		$scope.cancel= function() {

			// 提交数据到后台
			$http.post('/exchange/exchangecancel', $scope.selectIds).success(
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
			$scope.editModal.reciveName = echo.reciveName;
			$scope.editModal.reciveMobile = echo.reciveMobile;
			$scope.editModal.ordersubId = echo.ordersubId;
		  }
		
		$scope.edit = function() {
			console.log($scope.editModal);
//			console.log(moment(echo.applyTime, 'YYYY:MM:DD HH:mm:ss').format('X'));
//			echo.applyTime = moment(echo.applyTime, 'YYYY:MM:DD HH:mm:ss').format('X');
			$http.post('/exchange/edit',$scope.editModal).success(
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
			var list = $scope.exchangeList;
			for (var i = 0; i < list.length; i++) {
				$scope.selectIds.push(list[i].exchangeGoodsId);
			}
		}	
		
		
});


