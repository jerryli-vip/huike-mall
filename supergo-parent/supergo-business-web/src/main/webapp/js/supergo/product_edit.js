//定义controller
app.controller('productController',function($scope,$http,$controller,$location){
	// 伪继承
	$controller('baseController',{$scope:$scope});
	
	//编辑数据回显
	$scope.editProduct = function(){
		// 从获取的URL截取productId的值
		var productId = $location.absUrl().split('=')[1].split('#')[0];
		console.log("你要编辑的产品ID="+productId)
		$http.post("/product/edit/"+productId).success(function(response){
			$scope.productEcho = response;
			$scope.product = response.product;
			// 模板ID回显
			$scope.templateID = response.product.template;
			// 扩展属性框信息回显
			$scope.extrattribute = JSON.parse(response.productInfoWithBLOBs.extrattribute);
			
			// 将三级分类的下拉框数据集合查询出来
			var classify1Echo = 0;
			$http.post("/product/queryClassify/"+classify1Echo).success(function(response){
				console.log("一级分类的id："+classify1Echo);
				$scope.classify1List = response;
				
				var i = 0; 
				for( ;i < response.length ; i++){
					if($scope.product.classify1==null){
						break;
					}
					if(response[i].categoryId == $scope.product.classify1){
						break;
					}
				}
				$scope.EchoClassify1 = response[i];
			});
			
			var classify2Echo = $scope.product.classify1;
			$http.post("/product/queryClassify/"+classify2Echo).success(function(response){
				console.log("二级分类的id："+classify2Echo);
				$scope.classify2List = response;
				
				var i = 0; 
				for( ;i < response.length ; i++){
					if($scope.product.classify2==null){
						break;
					}
					if(response[i].categoryId == $scope.product.classify2){
						break;
					}
				}
				$scope.EchoClassify2 = response[i];
			});
			
			var classify3Echo = $scope.product.classify2;
			$http.post("/product/queryClassify/"+classify3Echo).success(function(response){
				console.log("三级分类的id："+classify3Echo);
				$scope.classify3List = response;
				
				var i = 0; 
				for( ;i < response.length ; i++){
					if($scope.product.classify3==null){
						break;
					}
					if(response[i].categoryId == $scope.product.classify3){
						break;
					}
				}
				$scope.EchoClassify3 = response[i];
			});
			
			// 将品牌的下拉框数据集合查询出来
			var templateEcho = $scope.product.classify3;
			$http.post("/product/queryTemplate/"+templateEcho).success(function(response){
				$scope.brands = JSON.parse(response.brands);
				
				var i = 0; 
				for( ;i < $scope.brands.length ; i++){
					if($scope.product.brand == null){
						break;
					}
					if($scope.brands[i].brandId == $scope.product.brand){
						break;
					}
				}
				$scope.EchoBrand = $scope.brands[i];
			});
			
			// 富文本编辑器的信息回显
			editor.html(response.productInfoWithBLOBs.introduce);
			
		})
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
		var list = $scope.brandList;
		for(var i=0;i<list.length;i++){
			$scope.selectIds.push(list[i].brandId);
		}
	}
	
	//查询分类
	//参数1：父分类ID
	//参数2：要查询的分类级别
	$scope.queryclassify = function(parentCtgyId,level){
		//当页面下拉框选择【请选择x级分类】的时候，清空后面几级的下拉框列表
		if(parentCtgyId < 0){
			if(level==2){
				$scope.classify2List=[];
				$scope.classify3List=[];
			}else if(level==3){
				$scope.classify3List=[];
			}
			return;
		}
		$http.post("/product/queryClassify/"+parentCtgyId).success(function(response){
			if(level==1){
				$scope.classify1List = response;
				/*$scope.productEcho.product.classify1=response[0];*/
			}else if(level == 2){
				$scope.classify2List = response;
				//重新查询二级数据的时候，要将之前的三级分类清空
				$scope.classify3List=[];
			}else if(level == 3){
				$scope.classify3List = response;
			}else{
				alert("查询分类失败：级别不正确！")
			}
		});
	}
	
	//查询三级分类对应模板
	//参数：三级分类ID
	$scope.queryTemplate = function(categoryId3){
		$http.post("/product/queryTemplate/"+categoryId3).success(function(response){
			$scope.template = response;
			$scope.templateID = response.templateId;
			$scope.brands = JSON.parse(response.brands);
		});
	}
	
	//添加数据提交到后台
	$scope.save = function(){
		var productId = $location.absUrl().split('=')[1].split('#')[0];
		var classify1 = $scope.EchoClassify1.categoryId;
		var classify2 = $scope.EchoClassify2.categoryId;
		var classify3 = $scope.EchoClassify3.categoryId;
		var template = $scope.templateID;
		var brand = $scope.EchoBrand.brandId;
		$scope.productEcho.productInfoWithBLOBs.introduce=editor.html();
		$scope.productEcho.productInfoWithBLOBs.extrattribute=JSON.stringify($scope.extrattribute);
		$http.post("/product/update/"+productId+"/"+classify1+"/"+classify2+"/"+classify3+"/"+template+"/"+brand,$scope.productEcho).success(
				function(response){
					if(response.status==200){
						alert(response.msg+"跳转到产品管理界面");
						window.location.href="product.html";
					}else{
						alert(response.msg);
					}
				});
	}
	
	//返回列表
	$scope.goListPage = function(){
		window.location.href="javascript:history.go(-1)";
	}
	
	// 扩展属性
	// 初始化定义一个集合
	$scope.extrattribute = [];
	// 增加表格行
	$scope.addTableRow = function() {
		$scope.extrattribute.push({});
	}
	// 减少表格行
	$scope.deleTableRow = function(index) {
		$scope.extrattribute.splice(index, 1);
	}
})
