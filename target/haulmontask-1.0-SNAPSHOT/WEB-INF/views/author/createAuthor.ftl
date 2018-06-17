<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="author" action="/author/add" method="post">
    <p>First name</p>
    <input title="firstName" type="text" name="firstName">
    <p>Last name</p>
    <input title="lastName" type="text" name="lastName">
    <p>Patronymic</p>
    <input title="patronymic" type="text" name="patronymic">
    <input type="submit" value="OK">
</form>
<a style="margin-top: 10px" href="/author/list">Author List</a>
</body>
</html>