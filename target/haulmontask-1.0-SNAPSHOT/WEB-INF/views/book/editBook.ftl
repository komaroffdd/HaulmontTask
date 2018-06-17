<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="Book" action="/book/add" method="post">
    <p>Book title|</p>
    <input title="bookTitle" type="text" name="bookTitle" value="${book.book_title}">
    <p>Author_id|</p>
    <input title="author_id" type=text name="author_id" value="${book.author_id}">
    <p>Genre_id|</p>
    <input title="genre_id" type="text" name="genre_id" value="${book.genre_id}">
    <p>Publisher|</p>
    <input title="publisher" type="text" name="publisher" value="${book.publisher}">
    <#--<p>Year|</p>-->
    <#--<input title="year" type="date" name="year" value="${book.year}">-->
    <p>City</p>
    <input title="city" type="text" name="city" value="${book.city}">
    <input style="margin-top: 10px" type="submit" value="OK">
</form>
</body>
</html>