angular.module('myApp', ['ngResource'])
    .service('UsersService', function ($resource) {
        return {
            getAll: function () {
                var userResource = $resource('list', {}, {
                    query: {method: 'GET', params: {}, isArray: true}
                });
                return userResource.query();
            }
        }
    })
    .controller('MainController', function ($scope, UsersService) {
        $scope.persons = UsersService.getAll();
    });