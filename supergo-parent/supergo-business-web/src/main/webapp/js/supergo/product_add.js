//定义controller
app.controller('productController',function($scope,$http,$controller,$location){
	// 伪继承
	$controller('baseController',{$scope:$scope});
	
	//品牌查询函数
	$scope.search = function(page,rows){
		//通过http请求远程数据
		$http.post("/product/queryBrand/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.brandList = response.rows;
			}
		);
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
	
	//查询三级分类数据
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
	
	//查询第三级分类对应模板
	//参数：三级分类ID
	$scope.queryTemplate = function(categoryId3){
		$http.post("/product/queryTemplate/"+categoryId3).success(function(response){
			$scope.template = response;
			$scope.templateID = response.templateId;
			$scope.brands = JSON.parse(response.brands);
			/*console.log(typeof $scope.brands);*/
		});
	}
	
	//添加数据提交到后台
	$scope.save = function(){
		var templateId = $scope.templateID;
		// 先初始化，再赋值
		$scope.addProduct.productInfoWithBLOBs={};
		$scope.addProduct.productInfoWithBLOBs.introduce=editor.html();
		$scope.addProduct.productInfoWithBLOBs.extrattribute=JSON.stringify($scope.extrattribute);
		// 非空校验所有都是必填项
		if($scope.addProduct.product.classify1==null){
			alert("分类不能为空");
			return;
		}
		if($scope.addProduct.product.classify2==null){
			alert("分类不能为空");
			return;
		}
		if($scope.addProduct.product.classify3==null){
			alert("分类不能为空");
			return;
		}
		if($scope.addProduct.product.productName==null){
			alert("产品名称不能为空");
			return;
		}
		if($scope.addProduct.product.brand==null){
			alert("产品品牌不能为空");
			return;
		}
		if($scope.addProduct.product.subtitle==null){
			alert("产品副标题不能为空");
			return;
		}
		if($scope.addProduct.product.packlist==null){
			alert("产品包装列表不能为空");
			return;
		}
		if($scope.addProduct.product.afterservice==null){
			alert("产品售后服务不能为空");
			return;
		}
		if($scope.addProduct.productInfoWithBLOBs.introduce==null){
			alert("产品介绍不能为空");
			return;
		}
		if($scope.addProduct.productInfoWithBLOBs.extrattribute==null){
			alert("扩展属性不能为空");
			return;
		}
		$http.post("/product/insert/"+templateId,$scope.addProduct).success(
				function(response){
					if(response.status==200){
						alert(response.msg+"跳转到产品管理界面");
						window.location.href="product.html";
					}else{
						alert(response.msg);
					}
				})
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