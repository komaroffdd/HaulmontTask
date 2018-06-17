<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Authors list</h1>
<table>
    <tr>
        <td>Id</td>
        <td>First name</td>
        <td>Last name</td>
        <td>Patronymic</td>
    </tr>
<#list authors as author>
    <tr>
        <td><a href="/author/${author.id}">${author.id}</a></td>
        <td>${author.firstName}</td>
        <td>${author.lastName}</td>
        <td>${author.patronymic}</td>
    <td><a href="/author/delete/${author.id}">Delete</a></td>
    <td><a href="/author/update/${author.id}">Update</a></td>
    </tr>

</#list>
</table>
<a href="/author/add">Create Author</a>
<br/>
<a href="/">Start page</a>
</body>
</html>