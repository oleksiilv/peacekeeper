'use strict';

angular.
  module('peacekeeperApp').
  config(['$locationProvider' ,'$routeProvider',
    function config($locationProvider, $routeProvider) {
      $locationProvider.hashPrefix('!');

      $routeProvider.
        when('/offender-list', {
          template: '<offender-list></offender-list>'
        }).
        when('/offender-form', {
          template: '<offender-form></offender-form>'
        }).
        otherwise('/offender-xxx');
    }
  ]);