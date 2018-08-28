<!doctype html>
<html lang="en" ng-app="peacekeeperApp">
<head>
    <meta charset="utf-8">
    <title>peacekeeper application</title>
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css/app.css"/>
    <script src="js/libs/angular.min.js"></script>
    <script src="js/libs/angular-route.min.js"></script>
    <script src="js/app/app.module.js"></script>
    <script src="js/app/app.config.js"></script>
    <script src="js/app/app.constants.js"></script>
    <script src="js/app/offender-list/offender-list.module.js"></script>
    <script src="js/app/offender-list/offender-list.component.js"></script>
    <script src="js/app/offender-form/offender-form.module.js"></script>
    <script src="js/app/offender-form/offender-form.component.js"></script>
</head>
<body>

<div class="jumbotron">
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                <h1>Peacekeeper</h1>
            </div>
            <div class="col-md-4">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for..." ng-model="searchOffenderName">
                    <span class="input-group-btn">
                        <a ng-href="/peacekeeper/#!/offender-list?filterByName={{searchOffenderName}}" class="btn btn-primary">Go!</a>
                    </span>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <ul class="menu">
                <li><a href="#!/offender-form">Add new offender</a></li>
                <li><a href="#!/offender-list">List of offenders</a></li>
            </ul>
        </div>
        <div class="col-md-10">
            <div ng-view></div>
        </div>
    </div>
</div>

</body>
</html>