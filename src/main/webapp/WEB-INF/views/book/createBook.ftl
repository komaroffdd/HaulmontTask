<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="book" name="author" action="/book/add" method="post">
    <p>Book title</p>
    <input title="bookTitle" type="text" name="book_title">
    <p>Author_id</p>
    <input title="author_id" type=text name="author_id">
    <p>Genre_id</p>
    <input title="genre_id" type="text" name="genre_id">
    <p>Publisher</p>
    <input title="publisher" type="text" name="publisher">
    <#--<p>Year</p>-->
    <#--<input title="year" type="date" name="year">-->
    <p>City</p>
    <input title="city" type="text" name="city">
    <input style="margin-top: 10px" type="submit" value="OK">
</form>
<a style="margin-top: 10px" href="/book/list">Book list</a>
</body>
</html>