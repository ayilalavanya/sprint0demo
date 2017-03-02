myApp.controller('BaseController', [ '$scope', '$http', 
function ($scope, $http) {
	$scope.loadPersons = function(){
		$http.get('list')
		.success(function(data, status, headers, config) {
		$scope.persons = data;
		$scope.selectedCustomer = $scope.persons[0].name;
		})
		.error(function(data, status, headers, config) {
		alert('Error loading persons');
		});
	};
	$scope.loadPersons();
}]);