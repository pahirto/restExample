angular.module('demo', [])
    .controller('Hello', function($scope, $http) {
        $http.get('rest/endpoint').
        then(function(response) {
            console.log("getting data");
            $scope.jsVariableResult = response.data;
            console.log(response);
            console.log(response.data);
        });
    });