// 定义controller,$scope用来进行交互,$http用来发请求
app.controller("systemUserController", function($scope, $http, $controller) {

	// 伪继承
	$controller('baseController', {
		$scope : $scope
	});

	$scope.searchBean = {};
	$scope.roleList = {};
	// 定义一个函数
	$scope.search = function(page, rows) {
		// 通过http请求远程数据
		$http.post("/user/query/" + page + "/" + rows, $scope.searchBean)
				.success(
				// 成功回调函数
				// response：就是通过http远程请求回来的数据，一般都是json格式
				function(response) {
					// 设置总记录数
					$scope.paginationConf.totalItems = response.total;
					// 设置分页记录
					$scope.systemUserList = response.rows;
				});
	}

	// 重置密码
	$scope.resetPassword = function() {
		if (confirm("是否批量重置密码？") == true) {
			// 提交数据到后台
			$http.post('/user/resetPassword', $scope.selectIds).success(
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
	// 定义新增用户函数
	$scope.save = function() {
		// 提交数据到后台
		$http.post('/user/insert', $scope.addUser).success(function(response) {
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
		var list = $scope.systemUserList;
		for (var i = 0; i < list.length; i++) {
			$scope.selectIds.push(list[i].sysuserId);
		}
	}

	// 定义批量删除函数
	$scope.batchDelete = function() {
		if (confirm("是否批量删除？") == true) {
			// 提交数据到后台
			$http.post('/user/delete', $scope.selectIds).success(
					function(response) {
						if (response.status == 200) {
							alert(response.msg);
							$scope.reloadList();
						} else {
							alert(response.msg);
						}
						;
					});
		}
	}

	// 定义编辑用户
	$scope.edit = function() {
		console.log($scope.editUser);
		// 提交数据到后台
		$http.post('/user/update', $scope.editUser).success(function(response) {
			if (response.status == 200) {
				$scope.reloadList();
			} else {
				alert(response.msg);
			}
		});
	}

	// 定义编辑回显
	// 参数：就是被修改行的记录对象
	$scope.showEditPage = function(systemUser) {
		// 清除之前的缓存数据
		$scope.editUser = {};
		// 将选中的一行数据，赋值给新的变量
		$scope.editUser = systemUser;
	}

	$scope.addUser = {};
	// 新建上传
	$scope.uploadFile = function() {
		// file1：file标签的id
		$scope.baseUploadFile(file1, "systemUser").success(function(response) {
			if (response.status == 200) {
				$scope.addUser.headPortrait = response.data;
			} else {
				alert(response.msg);
			}
		})
	}

	$scope.addUser = {};
	// 修改上传
	$scope.uploadFile1 = function() {
		// file1：file标签的id
		$scope.baseUploadFile(file2, "systemUser").success(function(response) {
			if (response.status == 200) {
				$scope.editUser.headPortrait = response.data;
			} else {
				alert(response.msg);
			}
		})
	}
	
	$scope.manageUserId = {};
	$scope.userAuthority = function(manageUserId) {
		var id = $scope.selectIds;
		alert(id);
		alert($scope.selectIds);
		console.log($scope.selectIds);
		$http.post('/user/userRole').success(function(response) {
			$scope.manageUserId =manageUserId;
			$scope.roleList = response;
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

	$scope.accredit = function(userId) {
		var userId = $scope.manageUserId;
		$http.post('/user/accredit/' + userId, $scope.selectRoleIds).success(
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

	$scope.showRole = function(userId) {
		console.log(userId);
		$http.post('/user/show/' + userId).success(function(response) {
			console.log(response);
			$scope.showRoleList = response;
		})
	}

	$scope.isSelected = function(id) {
		console.log("daozhele" + id);
	}
	// var qx = angular.module('qxApp', []);
	// qx.controller('qxCtrl', function($scope) {
	// $scope.List = [ {
	// id : 123,
	// name : "adasd"
	// }, {
	// id : 1,
	// name : "ad"
	// }, {
	// id : 12,
	// name : "ssd"
	// }, {
	// id : 10,
	// name : "agsd"
	// }, {
	// id : 3523,
	// name : "adasd"
	// }, {
	// id : 4563,
	// name : "偶的金佛啊d"
	// }, {
	// id : 12567,
	// name : "a阿房宫d"
	// }, ];
	//
	// $scope.cssTrue = true;
	// $scope.postId = [];
	// $scope.postarr = [];
	// $scope.getId = function(ind) {
	// var el = $scope.List[ind];
	// // $scope.postId.push(el.id);
	// $scope.List[ind].cssTrue = !$scope.List[ind].cssTrue;
	// $scope.postarr = arr(el, $scope.postId);
	// }
	// $scope.newList = function(arr) {
	// for (var i = 0; i < arr.length; i++) {
	// arr[i].cssTrue = $scope.cssTrue;
	// }
	// ;
	// return arr;
	// }
	// $scope.newList($scope.List);
	// $scope.sub = function() {
	// console.log($scope.postarr);
	// }
	// })
	//
	// function arr(el, ar) {
	// var istrue = true;
	// for (var i = 0; i < ar.length; i++) {
	// var j = ar[i].id
	// if (el.id == j) {
	// if (i == 0) {
	// ar.splice(i, i + 1);
	// } else {
	// ar.splice(i, i);
	// }
	//
	// istrue = false;
	// break;
	// }
	// }
	// if (istrue) {
	// ar.push(el);
	// }
	// return ar;
	// }
});