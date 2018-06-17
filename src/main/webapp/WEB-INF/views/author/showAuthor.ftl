<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Author info</h1>
<table>
    <tr>
        <td>Author name</td>
        <td>Last name</td>
        <td>Patronymic</td>
    </tr>
    <tr>
        <td>${author.firstName}</td>
        <td>${author.lastName}</td>
        <td>${author.patronymic}</td>
    </tr>
</table>
<p>=========================================</p>
<table>
    <tr>
        <td>Id</td>
        <td>Book title</td>
        <td>Genre</td>
        <td>Publisher</td>
    <#--<td>Year|</td>-->
        <td>City</td>
    </tr>
<#list books as book>
    <tr>
        <td>${book.id}</td>
        <td>${book.book_title}</td>
        <td><a href="/genre/${book.genre_id}">${book.genre_id}</a></td>
        <td>${book.publisher}</td>
        <td>${book.city}</td>
    </tr>
</#list>
</table>

<br>
<a href="/">Start page</a>
</body>
</html>