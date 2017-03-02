<div>
<h1>Persons List</h1>
<table>
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