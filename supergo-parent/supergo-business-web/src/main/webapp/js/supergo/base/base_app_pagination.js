//定义品优购模块
var app=angular.module('supergo',['pagination']);
app.config(function($httpProvider) {
	//AngularJS默认的X-Request-With头
	$httpProvider.defaults.headers.post['X-Requested-With'] = 'XMLHttpRequest';
});