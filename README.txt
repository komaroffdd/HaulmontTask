# HaulmontTask
Путь к скриптам для создание БД и таблиц лежит по пути в \src\main\resources\database
createDB - создание БД
createAuthor - создание таблицы Author
createBook - создание таблицы Book
createGenre - создание таблицы Genre

В папке config в файле SpringConfig в методе getDataSource подставте данные для вашей БД(Url,login,password,driver), если не используете mysql, то также необходимо добавить зависимость для вашей БД

В методах update есть проблема, но я думаю это на уровне контроллера(NullPointerException, не могу разобраться почему)

Так же есть методы для которых я не смог написать фронт часть, а именно для фильтрации данных в Book, на уровне бэкэнда сделано(как мне кажется)
