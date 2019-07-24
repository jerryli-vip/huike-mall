// 定义controller,$scope用来进行交互,$http用来发请求
app.controller("roleController", function($scope, $http, $controller) {

	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/role/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					console.log(response);
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.roleList = response.rows;
				});
	}
	
	// 定义新增
	$scope.datas = function(){
		 var name = $(".name").val();
		  var nameId = $(".idd").html()/1;
		  var textareas = $(".textareas").val();
		 
		  var option ={
				  roleName :name ,
				  parentId:nameId,
				  roleDescription:textareas
		  }
		  return option;
	}
	
	//新建角色数据提交后台
	$scope.save = function() {
		// 提交数据到后台
		$http.post('/role/insert', $scope.datas()).success(function(response) {
			if (response.status == 200) {
				alert(response.msg);
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
		});
	}
	
	// 定义修改
	$scope.datas2 = function(){
		var id = $(".id2").val();
		 var name = $(".name2").val();
		  var nameId = $(".idd2").html()/1;
		  var textareas = $(".textareas2").val();
		 
		  var option ={
				  roleId:id,
				  roleName :name ,
				  parentId:nameId,
				  roleDescription:textareas
		  }
		  return option;
	}
	//修改角色数据提交后台
	$scope.edit = function() {
		$http.post("/role/update", $scope.datas2()).success(function(response) {
			if (response.status == 200) {
				alert(response.msg);
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
		});
	}
	
	
	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(role) {
		// 清除之前的缓存数据
		$scope.editRole = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editRole = role;
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
		var list = $scope.roleList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].roleId);
		}
	}

	$scope.batchDelete = function() {
		if (confirm("是否批量删除？") == true) {
			// 提交数据到后台
			$http.post('/role/delete', $scope.selectIds).success(
					function(response) {
						if (response.status == 200) {
							alert(response.msg);
							$scope.reloadList();
						} else {
							alert(response.msg);
						}
					});
		}
	}
	
	$scope.manageRoleId = {};
	$scope.roleAuthority = function(manageRoleId) {
		$http.post('/role/roleAuthority').success(function(response) {
			$scope.manageRoleId = manageRoleId;
			$scope.authorityList = response;
		})
	}

	$scope.selectRoleIds = [];// 角色授权选定复选的ID集合

	// 复选框单选操作
	// 参数2：批量操作的值
	$scope.updateRoleSelection = function($event, id) {
		if ($event.target.checked) {
			$scope.selectRoleIds.push(id);
		} else {
			var index = $scope.selectRoleIds.indexOf(id);// 在数组中查找指定值的位置
			$scope.selectRoleIds.splice(index, 1);// 从数组中移除元素 参数1：从哪开始移除
			// 参数2：移除元素个数
		}
	}
	$scope.accredit = function() {
		var roleId = $scope.manageRoleId;
		var authorityIds = $scope.selectRoleIds;
		$http.post('/role/accredit/' + roleId, $scope.selectRoleIds).success(
				function(response) {
					if (response.status == 200) {
						alert(response.msg);
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
		$scope.selectIds = [];
		$scope.selectRoleIds = [];
	}

	$scope.showAuthority = function(roleId) {
		$http.post('/role/show/' + roleId).success(function(response) {
			console.log(response);
			$scope.showAuthorityList = response;
		})
	}

	$scope.isSelected = function(id) {
		return $scope.selectRoleIds.indexOf(id) >= 0;
	}
});

//上级角色
var setting = {
		view : {
			dblClickExpand : false
		},
		data : {
			
		       simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pId",
//					nameKey:"roleName",
					rootPId: 0
				}
		
		},
		callback : {
			onClick : onClick
		}
	};

	function onClick(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo"), nodes = zTree
				.getSelectedNodes(), v = "";
		nodes.sort(function compare(a, b) {
			return a.id - b.id;
		});
		for (var i = 0, l = nodes.length; i < l; i++) {
			v += nodes[i].name + ",";
		}
		$(".idd").html(treeNode.id);
		if (v.length > 0)
			v = v.substring(0, v.length - 1);
			cityObj = $("#citySel");
			cityObj.attr("value", v);
		console.log(e);
	}
	
	function treeAjax(){
		$.ajax({
			url:"/role/parent",
			type:"post",
			success:function(data){
				console.log(data);
				var a =stringJson(data);
				//console.log(a);
				var zNodes = null;
				if(data){
					zNodes =a;
					$(document).ready(function() {
						//console.log(setting);
						$.fn.zTree.init($("#treeDemo"), setting, zNodes);
						$.fn.zTree.init($("#treeDemo2"), setting2, zNodes);
					});
				}
			}
		})
	}
	function stringJson(ele){
		var optionArray =[];
		for(var i=0;i<ele.length;i++){
			var option = {};
			option.id = ele[i].roleId;
			option.pId = ele[i].parentId;
			option.name = ele[i].roleName;
			optionArray.push(option);
		}
		return  optionArray;
	}
	
	//添加上级角色下拉框
	function showAddMenu() {
		//console.log(ele);
		var cityObj = $("#citySel");
		var cityOffset = $("#citySel").offset();
		$("#menuAddContent").css({
			left : cityOffset.left + "px",
			top : cityOffset.top + cityObj.outerHeight() + "px"
		}).slideDown("fast");
		$("body").bind("mousedown", onBodyDown);
		treeAjax();
	}
	function hideAddMenu() {
		$("#menuAddContent").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown);
	}
	function onBodyDown(event) {
		if (!(event.target.id == "menuBtn" || event.target.id == "menuAddContent" || $(
				event.target).parents("#menuAddContent").length > 0)) {
			hideAddMenu();
		}
	}
	
	//修改2
	var setting2 = {
			view : {
				dblClickExpand : false
			},
			data : {
				
			       simpleData: {
						enable: true,
						idKey: "id",
						pIdKey: "pId",
						rootPId: 0
					}
			},
			callback : {
				onClick : onClick2
			}
		};
	
	function showAddMenu2() {
		var cityObj = $("#citySel2");
		var cityOffset = $("#citySel2").offset();
		$("#menuAddContent2").css({
			left : cityOffset.left + "px",
			top : cityOffset.top + cityObj.outerHeight() + "px"
		}).slideDown("fast");
		$("body").bind("mousedown", onBodyDown2);
		treeAjax();
	}
	function hideAddMenu2() {
		$("#menuAddContent2").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown2);
	}
	function onBodyDown2(event) {
		if (!(event.target.id == "menuBtn2" || event.target.id == "menuAddContent2" || $(
				event.target).parents("#menuAddContent2").length > 0)) {
			hideAddMenu2();
		}
	}
	//修改按钮点击事件赋值上级角色id
	function onClick2(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo2"), nodes = zTree
				.getSelectedNodes(), v = "";
		nodes.sort(function compare(a, b) {
			return a.id - b.id;
		});
		for (var i = 0, l = nodes.length; i < l; i++) {
			v += nodes[i].name + ",";
		}
		$(".idd2").html(treeNode.id);
		if (v.length > 0)
			v = v.substring(0, v.length - 1);
			cityObj = $("#citySel2");
			cityObj.attr("value", v);
	}
	
	$(document).ready(function() {
	});

