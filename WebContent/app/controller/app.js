(function(){
	'use strict';
	var app=angular.module('myApp',['ngRoute', 'ngAnimate','ngMaterial', 'ngMessages']);
	app.config(['$routeProvider','$locationProvider', function($routeProvider,$locationProvider){
		$locationProvider.hashPrefix('');
		$routeProvider
		
			.when('/',{
				templateUrl:'app/views/dashboard.html',
				controller:'dashboardController'
			})
		
		
		
		
	}]);
	
	
})();

