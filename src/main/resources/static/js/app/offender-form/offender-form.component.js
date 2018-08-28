'use strict';

angular.
  module('offenderForm').
  component('offenderForm', {
    templateUrl: 'js/app/offender-form/offender-form.template.html',
    controller: ['$scope',
        '$http',
        'urls',
        '$window',
        'riskLevelMapping',
        'riskLevels',
        '$location',
        function OffenderFormController($scope, $http, urls, $window, riskLevelMapping, riskLevels, $location) {
        $scope.riskLevelMapping = riskLevelMapping;
        $scope.submit = function() {

            // the issue is not actual anymore as it is fixed in 1.7.2 at least
            // if (typeof $scope.offenderMeta === 'undefined') {
            //     // temp workaround for issue in angular 1.5.* with untouched range input
            //     // https://github.com/angular/angular.js/issues/6726
            //     $scope.offender.riskLevel = riskLevels.MEDIUM;
            // } else {
            //     $scope.offender.riskLevel = riskLevelMapping[$scope.offenderMeta.riskLevelNum];
            // }
            $scope.offender.riskLevel = riskLevelMapping[$scope.offenderMeta.riskLevelNum];

            $http.post(urls.OFFENDER_SERVICE_API, $scope.offender)
                .then(
                    function (response) {
                        console.log('added new offender');
                        $window.location.href = '/peacekeeper/#!/offender-list?filterByName=' + $scope.offender.name;
                    },
                    function (errResponse) {
                        console.error('Error while creating offender');
                        $window.alert('Error while creating offender');
                    }
                );
        };

        var self = this;

        $http.get(urls.OFFENDER_SERVICE_API).then(function(response) {
            self.offenders = response.data;
        });
    }]
  });
