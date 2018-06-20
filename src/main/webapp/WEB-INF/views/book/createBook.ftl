<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="book" name="author" action="/book/add" method="post">
    <p>Book title</p>
    <input title="name_book" type="text" name="name_book">
    <p>Author_id</p>
    <input title="author" type=text name="author">
    <p>Genre_id</p>
    <input title="genre" type="text" name="genre">
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
