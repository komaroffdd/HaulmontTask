<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Genres list</h1>
<table>
    <tr>
        <td>Id|</td>
        <td>Genre</td>
    </tr>
<#list genres as genre>
    <tr>
        <td>${genre.id}</td>
        <td>${genre.genre}</td>
        <td><a href="/genre/delete/${genre.id}">Delete</a></td>
        <td><a href="/genre/update/${genre.id}">Update</a></td>
    </tr>

</#list>
</table>
<a href="/genre/add">Create Genre</a>
<br/>
<a href="/">Start page</a>
</body>
</html>