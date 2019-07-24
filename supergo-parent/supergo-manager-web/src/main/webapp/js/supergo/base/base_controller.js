app.controller('baseController', function($scope, $http) {

	// 分页控件配置 currentPage:当前页 totalItems:总记录数
	// itemsPerPage:每页显示记录数 perPageOptions：分页选项 onChange :当你更改页码的时候出发的事件
	$scope.paginationConf = {
		currentPage : 1,
		// totalItems: 10,
		itemsPerPage : 10,
		perPageOptions : [ 10, 20, 30, 40, 50 ],
		onChange : function() {
			$scope.reloadList();
		}
	};

	// 刷新列表
	$scope.reloadList = function() {
		$scope.search($scope.paginationConf.currentPage,
				$scope.paginationConf.itemsPerPage);
	}

	$scope.selectIds = [];// 用户选定复选的ID集合
	
	// 复选框单选操作
	// 参数2：批量操作的值
	$scope.updateSelection = function($event, id) {
		
		if ($event.target.checked) {
			$scope.selectIds.push(id);
		} else {

			var index = $scope.selectIds.indexOf(id);// 在数组中查找指定值的位置
			$scope.selectIds.splice(index, 1);// 从数组中移除元素 参数1：从哪开始移除
			// 参数2：移除元素个数
		}
	}

	// 转换json字符串，提取某key的值为字符串列表
	$scope.jsonToString = function(jsonString, key) {

		var list = JSON.parse(jsonString);
		var str = "";

		for (var i = 0; i < list.length; i++) {
			if (i > 0) {
				str += ",";
			}
			str += list[i][key];
		}
		return str;
	}

	/**
	 * 上传控制器
	 * 参数1：上传文件的input的id值
	 * 参数2：图片分组，比如商品图片：goods，品牌图片：brand
	 */
	$scope.baseUploadFile = function(fileId,imgGroup) {
		// 创建FormData(XMLHttpRequest提供的对象)，该对象可以将数据变为key/value格式数据
		// 通过FormData对象，可以将图片序列化之后传递到后台
		var formData = new FormData();
		// 将上传的文件追加到formData对象中
		formData.append("uploadFile", fileId.files[0]);
		formData.append("imgGroup",imgGroup);

		// 发送post请求
		// headers Content-Type:默认是application/json，设置为undefined，会将Content-Type改变
		// transformRequest：angular.identity   序列化为二进制数据
		return $http({
			url : "/uploadFile",
			method : "post",
			data : formData,
			headers : {
				"Content-Type" : undefined
			},
			transformRequest : angular.identity
		});
	}

});