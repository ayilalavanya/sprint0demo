<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html ng-app="myApp">
<head>
<meta charset="utf-8"/>
<title>DashBoard</title>
<script data-require="angular.js@*" data-semver="1.3.7" src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.7/angular.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular-resource.js"></script>
<script src="<c:url value="/resources/js/app.js" />"></script>
</head>

<body ng-controller="MainController">
<div>
<div ng-view></div>
<h1>Persons List</h1>
<table border="1">
<thead>
<tr>
<th>Name</th>
<th>Age</th>
<th>Email</th>
</tr>
</thead>
<tbody>
<tr ng-repeat="person in persons">
<td>{{person.name}}</td>
<td>{{person.age}}</td>
<td>{{person.email}}</td>
</tr>
</tbody>
</table>
<br/>
</div>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular-resource.js"></script> -->
</body>
</html>