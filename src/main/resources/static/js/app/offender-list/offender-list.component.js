'use strict';

angular.
  module('offenderList').
  component('offenderList', {
    templateUrl: 'js/app/offender-list/offender-list.template.html',
    controller: ['$scope', '$http', 'urls', '$routeParams', function OffenderListController($scope, $http, urls, $routeParams) {
      var self = this;

      if (typeof $routeParams.filterByName !== 'undefined') {
          self.query = $routeParams.filterByName;
      } else {
          self.query = '';
      }

      $http.get(urls.OFFENDER_SERVICE_API).then(function(response) {
        self.offenders = response.data;
      });
    }]
  });
