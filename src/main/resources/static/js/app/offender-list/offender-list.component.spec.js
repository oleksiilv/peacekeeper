'use strict';

describe('offenderList', function() {

  // Load the module that contains the `offenderList` component before each test
  beforeEach(module('offenderList'));

  // Test the controller
  describe('OffenderListController', function() {
    var $httpBackend, ctrl;

    // The injector ignores leading and trailing underscores here (i.e. _$httpBackend_).
    // This allows us to inject a service and assign it to a variable with the same name
    // as the service while avoiding a name conflict.
    beforeEach(inject(function($componentController, _$httpBackend_) {
      $httpBackend = _$httpBackend_;
      $httpBackend.expectGET('offenders/offenders.json')
                  .respond([{name: 'Nexus S'}, {name: 'Motorola DROID'}]);

      ctrl = $componentController('offenderList');
    }));

    it('should create a `offenders` property with 2 offenders fetched with `$http`', function() {
      expect(ctrl.offenders).toBeUndefined();

      $httpBackend.flush();
      expect(ctrl.offenders).toEqual([{name: 'Nexus S'}, {name: 'Motorola DROID'}]);
    });

    it('should set a default value for the `orderProp` property', function() {
      expect(ctrl.orderProp).toBe('age');
    });

  });

});
