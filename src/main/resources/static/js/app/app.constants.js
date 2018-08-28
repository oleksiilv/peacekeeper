'use strict';

angular
    .module('peacekeeperApp')
    .constant('urls', {
        OFFENDER_SERVICE_API: 'http://localhost:8080/peacekeeper/api/offender/'
    })
    .constant('riskLevelMapping', {
        1: 'LOW',
        2: 'MEDIUM',
        3: 'HIGH'
    })
    .constant('riskLevels', {
        LOW: 'LOW',
        MEDIUM: 'MEDIUM',
        HIGH: 'HIGH'
    });