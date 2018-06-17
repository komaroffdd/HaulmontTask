<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Genre info</h1>
<table>
    <tr>
        <td>Genre</td>
    </tr>
    <tr>
        <td>${genre.genre}</td>
    </tr>
</table>
<p>=========================================</p>
<table>
    <tr>
        <td>Id</td>
        <td>Book title</td>
        <td>Author</td>
        <td>Publisher</td>
    <#--<td>Year|</td>-->
        <td>City</td>
    </tr>
<#list books as book>
    <tr>
        <td>${book.id}</td>
        <td>${book.book_title}</td>
        <td><a href="/author/${book.author_id}">${book.author_id}</a></td>
        <td>${book.publisher}</td>
        <td>${book.city}</td>
    </tr>
</#list>
</table>

</body>
</html>