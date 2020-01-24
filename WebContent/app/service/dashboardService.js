var app= angular.module('myApp');
app.service('dashboardService',dashboardService);
	
	function dashboardService ($http){
		this.saveDetail = saveDetail;
		this.getUsers= getUsers;
		
	 function saveDetail() {
		 
	 }
	
	function getUsers(){
		return $http.get('dashboard/getUsers')
			.then(function(response){
				return response;
			}).catch(function(error){
				
			})
	}
	
	
	}

