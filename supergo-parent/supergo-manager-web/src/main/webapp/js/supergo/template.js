//定义controller
app.controller('templateController',function($scope,$http,$controller){
	//伪继承
	$controller('baseController',{$scope:$scope});
	//模版对象主要用来存储模版名称进行模糊查询
	$scope.searchBean={};
	//规格对象，主要用来存储规格名称进行模糊查询
	$scope.searchSpec={};

	
	
	
	
	
	//定义一个函数
	$scope.search = function(page,rows){
		$scope.querySpecs();
		$scope.queryBands();
		
		//通过http请求远程数据
		$http.post("/template/getTemplates/"+page+"/"+rows,$scope.searchBean).success(
			//成功回调函数
			//response：就是通过http远程请求回来的数据，一般都是json格式
			function(response){
				
				//循环rows
				for(var i = 0;i<response.rows.length;i++){
					//获取brands字符串
					var string =  response.rows[i].brands;
					//获取specs字符串
					var str = response.rows[i].specs;
					//获取attribute字符串
					var att = response.rows[i].attribute;
					//将字符串转换为json对象
					var Brands = JSON.parse(string);
					var Specs = JSON.parse(str);
					
					//定义一个新的字符串
					var brandsString = "[";
					var specString = "[";
					//var attString = "[";
					//循环Brands取值
					for(var j = 0 ; j<Brands.length;j++){
						if(j>0){
							brandsString += ",";
						}
						brandsString += "{\"id\":"+Brands[j]["brandId"]+","+"\"text\":\""+Brands[j]["brandName"]+"\"}";
						
					}
					brandsString += "]";
					
					response.rows[i].brands=brandsString;
					
					//循环Specs取值
					for(var z = 0 ; z<Specs.length;z++){
						if(z>0){
							specString += ",";
						}
						specString += "{\"id\":"+Specs[z]["specId"]+","+"\"text\":\""+Specs[z]["specName"]+"\"}";
					}
					specString += "]";
				
					response.rows[i].specs=specString;
					
				}
				
				//设置总记录数
				$scope.paginationConf.totalItems = response.total;
				//设置分页记录
				$scope.templateList = response.rows;
			}
		);
	}
	
	//修改点击关闭按钮时重新刷新一下页面
	$scope.flase = function(){
		//刷新当前页
		$scope.search($scope.paginationConf.currentPage,
				$scope.paginationConf.itemsPerPage);
	}
	
	
	//全选模版
	$scope.selTemAll=function(){
		//清空之前选中的选项
		$scope.selectTemIds=[];
		//这个$scope.all的值是上次全选操作的true、false值。第一次是undefined
		if($scope.all){
			return;
		}
		//获取分页记录
		var tList = $scope.templateList;
		for(var i=0;i<tList.length;i++){
			$scope.selectTemIds.push(tList[i].templateId);
		}
	}
	
	// 模版复选框单选操作
	// 参数2：批量操作的值
	$scope.updateTemSelection = function($event, id) {
		
		if ($event.target.checked) {
			$scope.selectTemIds.push(id);
		} else {

			var index = $scope.selectTemIds.indexOf(id);// 在数组中查找指定值的位置
			$scope.selectTemIds.splice(index, 1);// 从数组中移除元素 参数1：从哪开始移除
			// 参数2：移除元素个数
		}
	}
	
	//删除函数
	$scope.batchDelete=function(){
		alert($scope.selectTemIds);
		//提交数据到后台
		$http.post("/template/deleteTemplate",$scope.selectTemIds).success(function(response){
			
			if (response.status == 200) {
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
			});
	}
	
	//点击新建触发事件
	$scope.addNewTemplate=function(){
		//创建新对象
		$scope.addTemplate={};
		$scope.addTemplate.attribute=[];
		//清空分类集合列表
		$scope.classify2List=[];
		$scope.classify3List=[];
		$scope.classify2={};
		$scope.classify3={};
		//查询一级分类
		$scope.queryclassify(0,1);
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
		$http.post("/category/queryCategoryByOnChange/"+parentCtgyId).success(function(response){
			if(level==1){
				$scope.classify1List = response.rows;
			}else if(level == 2){
				$scope.classify2List = response.rows;
				//重新查询二级数据的时候，要将之前的三级分类清空
				$scope.classify3List=[];
			}else if(level == 3){
				$scope.classify3List = response.rows;
			}else{
				alert("查询分类失败：级别不正确！")
			}
		});
	}
	
	
	//分类三级回显函数
	$scope.queryCategory = function(categoryId){
		
		
		//传入分类id返回该分类所属等级的分类集合
		$http.post("/category/queryCategoryByID",categoryId).success(
				function(response){
					if(response.status==200){
						var category3List = response.data;
						//取出分类id对应的category对象
						for(var i = 0;i<category3List.length;i++){
							if(categoryId==category3List[i].categoryId){
								break;
							}
						}
						
						//定义三级默认的分类
						$scope.classify3=category3List[i];
						//绑定三级分类集合
						$scope.classify3List=category3List;
						
						//将该分类的父id传入请求地址中获取二级分类的集合
						$http.post("/category/queryCategoryByID",$scope.classify3.parentId).success(
								function(response){
									if(response.status==200){
										var category2List = response.data;
										//取出分类id对应的category对象
										for(var j = 0;j<category2List.length;j++){
											if($scope.classify3.parentId==category2List[j].categoryId){
												break;
										}
								}
										//定义二级默认的分类
										$scope.classify2=category2List[j];
										//绑定二级分类集合
										$scope.classify2List=category2List;
										
										//将该分类的父id传入请求地址中获取一级分类的集合	
										$http.post("/category/queryCategoryByID",$scope.classify2.parentId).success(function(response){
											if(response.status==200){
												var category1List = response.data;
												//取出分类id对应的category对象
												for(var k = 0;k<category1List.length;k++){
													if($scope.classify2.parentId==category1List[k].categoryId){
														break;
													}
												}
												//定义一级默认的分类
												$scope.classify1=category1List[k];
												//绑定一级分类集合
												$scope.classify1List=category1List;
												
											}else{
												alert(response.msg);
											}
										});
									}else{
										alert(response.msg);
									}
								});
						}else{
							alert(response.msg);
						}
				});
						
			
			
		}
	
	//三级change事件函数
	$scope.categoryChange=function(category){
		if(category.level==1){
			$scope.classify2List=[];
			$scope.classify3List=[];
			
		}
		if(category.level==2){
			$scope.classify3List=[];
		}
		$http.post("/category/queryCategoryByOnChange/"+category.categoryId).success(function(response){
			if(category.level==1){
				$scope.classify2List=response.rows;
			}
			if(category.level==2){
				$scope.classify3List=response.rows;
			}
			
			
		});
	}
												
											
	
	
	
	//查询品牌
	$scope.queryBands=function(){

		// 通过http请求远程数据
		$http.post("/brand/queryAllBrands", $scope.searchBrand)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					var s = "[";
					//循环rows
					for(var i = 0;i<response.rows.length;i++){
						if(i>0){
							s += ",";
						}
						s += "{\"id\":"+response.rows[i]["brandId"]+","+"\"text\":\""+response.rows[i]["brandName"]+"\"}"
					}
					s += "]";
					//将字符串转换为json对象
					var S = JSON.parse(s);
					// 设置分页记录
					$scope.brandList = {data:S}; 
				});
	}
	
	
	
	

	
	//查询规格
	$scope.querySpecs=function(){
		
		// 通过http请求远程数据
		$http.post("/spec/queryAll", $scope.searchSpec)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					var sp = "[";
					for(var j = 0 ;j<response.rows.length;j++){
						if(j>0){
							sp+=",";
						}
						sp+="{\"id\":"+response.rows[j]["specId"]+","+"\"text\":\""+response.rows[j]["specName"]+"\"}";
					}
					sp+="]";
					var SP = JSON.parse(sp);
					
					// 设置分页记录
					$scope.specList = {data:SP};
				});
	}
	
	
	
	// 规格添加--增加表格行
	$scope.addTableRow = function() {
		$scope.addTemplate.attribute.push({});
	}
	// 规格添加--减少表格行
	$scope.deleTableRow = function(index) {
		$scope.addTemplate.attribute.splice(index, 1);
	}
	
	//查询该分类是否已经含有模版
	$scope.queryTemplate=function(categoryId){
		$http.post("/template/queryTemplate",categoryId).success(function(response){
			if(response.status==500){
				alert("该分类已经有模版！");
				$scope.exist = false;
			}else{
				$scope.exist = true;
			}
		});
	}
	
	
	
	//添加模版
	$scope.addTem=function(){
		/*alert($scope.addTemplate.specs);
		
		alert($scope.addTemplate.brandIds);
		
		alert($scope.addTemplate.attribute);*/
		
		if($scope.exist){
			$http.post("/template/insterTemplate",$scope.addTemplate).success(
				
				function(response){
					if (response.status == 200) {
						$scope.search(1,1);
					} else {
						alert(response.msg);
					}
				}
		
		
		);}else{
			alert("新增失败！");
		}
	}
	
	
	/**
	 * 回显
	 * 
	 * */
	
	//修改模版获得回显数据
	$scope.editTemplateById=function(template){
		//$scope.queryclassify(0,1);
		
		$scope.editTemplate=template;
		$scope.editTemplate.brands=JSON.parse(template.brands);
		$scope.editTemplate.specs=JSON.parse(template.specs);
		$scope.editTemplate.attribute=JSON.parse(template.attribute);
		$scope.queryCategory(template.categoryId);
			
	}
		

	
	// 规格添加--增加表格行
	$scope.addEditTableRow = function() {
		$scope.editTemplate.attribute.push({});
	}
	// 规格添加--减少表格行
	$scope.deleEditTableRow = function(index) {
		$scope.editTemplate.attribute.splice(index, 1);
	}
	//修改函数
	$scope.editTem = function(){
		
		$scope.editTemplate.categoryId=$scope.classify3.categoryId;
		
		$http.post("/template/updateTemplate",$scope.editTemplate).success(
				
				function(response){
					
					if (response.status == 200) {
						$scope.search(1,10);
					} else {
						alert(response.msg);
					}
					
				}
		);
		
	}
	
});
