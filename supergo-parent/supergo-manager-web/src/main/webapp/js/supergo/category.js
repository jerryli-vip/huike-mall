
//定义controller
app.controller('categoryController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	
	$scope.searchBean={};
	$scope.searchBean.parentId =0;
	$scope.searchBean.level = 0;
	//定义一个函数
	$scope.search = function(page,rows){
		
		//通过http请求远程数据
		$http.post("/category/getCategorys/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.categoryList = response.rows;
			}
		);
	}

	//刷新页面函数
	$scope.flase=function(){
		$scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
	}
	//定义新增分类函数
	$scope.save=function(){
		$scope.addCategory.level=$scope.searchBean.level;
		$scope.addCategory.parentId=$scope.searchBean.parentId;
		//alert($scope.addCategory.level);
		//提交数据到后台
		$http.post("/category/insterCategory",$scope.addCategory).success(function(response){
			if(response.status==200){
				 $scope.reloadList();
			}else{
				alert(response.msg);
			}
		});
	}
	
	
	//定义查询下级目录函数
	$scope.queryNext=function(category){
		$scope.searchBean.parentId =category.categoryId;
		$scope.searchBean.level =category.level;
		$scope.searchBean.categoryName=category.categoryName;
		$scope.searchBean.Id =  category.parentId;
		 $scope.reloadList();
		
	}
	
	
	//全选
	$scope.selAll=function(){
		//清空之前选中的选项
		$scope.selectIds=[];
		//这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if($scope.all){
			return;
		}
		//获取分页记录
		var list = $scope.categoryList;
		for(var i=0;i<list.length;i++){
			$scope.selectIds.push(list[i].categoryId);
		}
	}
	
	//删除函数
	$scope.batchDelete=function(){
		alert($scope.selectIds);
		//提交数据到后台
		$http.post("/category/deleteCategory",$scope.selectIds).success(function(response){
			
			if (response.status == 200) {
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
			});
	}
	
	
	//顶级分类函数
	$scope.topCategory=function(){
		
		$scope.searchBean.parentId =0;
		$scope.searchBean.level = 1;
		
		 $scope.reloadList();
		
	}
	
	//二级分类函数
	$scope.SecCategory=function(){
		$scope.searchBean.parentId = $scope.searchBean.Id;
		$scope.searchBean.level = 2;
		 $scope.reloadList();
	}
	
	
	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(category) {
		// 清除之前的缓存数据
		$scope.editCategory = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editCategory =category;
	}
	
	
	// 定义编辑分类函数
	$scope.update = function() {
		// 提交数据到后台
		$http.post('/category/updateCategory', $scope.editCategory).success(
				function(response) {
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}
	
});


	



