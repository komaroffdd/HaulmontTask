<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create author page</title>
</head>
<body>
<form name="author" action="/author/update" method="post">
    <p>First name</p>
    <input title="First name" type="text" name="firstName" value="${author.firstName}">
    <p>Last name</p>
    <input title="Last name" type="text" name="lastName" value="${author.lastName}">
    <p>Patronymic</p>
    <input title="Patronymic" type="text" name="patronymic" value="${author.patronymic}">
    <input style="margin-top: 10px" type="submit" value="OK">
</form>
</body>
</html>