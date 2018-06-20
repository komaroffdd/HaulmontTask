<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Books list</h1>
<table>
    <tr>
        <td>Id</td>
        <td>Book title</td>
        <td>Author id</td>
        <td>Genre id</td>
        <td>Publisher</td>
        <#--<td>Year|</td>-->
        <td>City</td>
    </tr>
<#list books as book>
    <tr>
        <td>${book.id}</td>
        <td>${book.name_book}</td>
        <td><a href="/author/${book.author}">${book.author}</a></td>
        <td><a href="/genre/${book.genre}">${book.genre}</a></td>
        <td>${book.publisher}</td>
        <#--<td>${book.year}|</td>-->
        <td>${book.city}</td>
        <td><a href="/book/delete/${book.id}">Delete</a></td>
        <td><a href="/book/update/${book.id}">Update</a></td>
    </tr>

</#list>
</table>
<a href="/book/add">Create Book</a>
<br/>
<a href="/">Start page</a></body>
</html>
