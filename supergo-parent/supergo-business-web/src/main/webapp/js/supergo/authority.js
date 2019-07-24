// 定义controller,$scope用来进行交互,$http用来发请求
app.controller("authorityController", function($scope, $http, $controller) {
	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});
	
	$scope.searchBean = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/authority/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.authorityList = response.rows;
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
		var list = $scope.authorityList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].authorityId);
		}
	}
	
	// 定义批量删除函数
	$scope.batchDelete = function() {
		if (confirm("是否批量删除？") == true) {
			// 提交数据到后台
			$http.post('/authority/delete', $scope.selectIds).success(
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
	// 定义新增
	$scope.datas = function() {
		var name = $(".name").val();
		var code = $(".code").val();
		var nameId = $(".idd").html() / 1;
		var url = $(".url").val();
		var textareas = $(".textareas").val();

		var option = {
			authorityName : name,
			code : code,
			parentId : nameId,
			url : url,
			authorityDescription : textareas
		}
		return option;
	}

	// 新建角色数据提交后台
	$scope.save = function() {
		// 提交数据到后台
		$http.post('/authority/insert', $scope.datas()).success(
				function(response) {
					console.log(response);
					if (response.status == 200) {
						$scope.reloadList();
					} else {
						alert(response.msg);
					}
				});
	}

	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(authority) {
		// 清除之前的缓存数据
		$scope.editAuthority = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editAuthority = authority;
	}

	// 定义修改
	$scope.datas2 = function() {
		var id = $(".id2").val();
		var name = $(".name2").val();
		var code = $(".code2").val();
		var nameId = $(".idd2").html() / 1;
		var url = $(".url2").val();
		var textareas = $(".textareas2").val();

		var option = {
			authorityId : id,
			authorityName : name,
			code : code,
			parentId : nameId,
			url : url,
			authorityDescription : textareas
		}
		return option;
	}
	// 修改角色数据提交后台
	$scope.edit = function() {
		var a = $scope.datas2;
		$http.post("/authority/update", $scope.datas2()).success(
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

//上级角色
var setting = {
	view : {
		dblClickExpand : false
	},
	data : {

		simpleData : {
			enable : true,
			idKey : "id",
			pIdKey : "pId",
			// nameKey:"roleName",
			rootPId : 0
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

function treeAjax() {
	$.ajax({
		url : "/authority/parent",
		type : "post",
		success : function(data) {
			console.log(data);
			var a = stringJson(data);
			var zNodes = null;
			if (data) {
				zNodes = a;
				$(document).ready(function() {
					$.fn.zTree.init($("#treeDemo"), setting, zNodes);
					$.fn.zTree.init($("#treeDemo2"), setting2, zNodes);
				});
			}
		}
	})
}
function stringJson(ele) {
	var optionArray = [];

	for (var i = 0; i < ele.length; i++) {
		var option = {};

		option.id = ele[i].authorityId;
		option.pId = ele[i].parentId;
		option.name = ele[i].authorityName;
		optionArray.push(option);
	}
	return optionArray;
}

// 添加上级角色下拉框
function showAddMenu(ele) {
	console.log(ele);
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

// 修改2
var setting2 = {
	view : {
		dblClickExpand : false
	},
	data : {

		simpleData : {
			enable : true,
			idKey : "id",
			pIdKey : "pId",
			rootPId : 0
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
// 修改按钮点击事件赋值上级角色id
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