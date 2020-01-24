var app= angular.module('myApp');
app.controller('dashboardController', dashboardController );

	function dashboardController ($scope, $mdDialog){
		
		$scope.openDashboardPopup = function (){
			 $mdDialog.show({
				 templateUrl: 'app/views/dashboardPopup.html',
				 controller: function($scope,dashboardService) {
					 $scope.form= {};
					 $scope.submitForm=function(){
						 console.log($scope.form);
					 }
					 // another function					 
					 $scope.cancel= function(){
						 dashboardService.getUsers()
						 .then(function(response){
							 console.log(response);				 
					
						 }).catch(function(error){
							 
						 })
							
							
						}
						

                 }
				
			 });
		}
		
		 
			};