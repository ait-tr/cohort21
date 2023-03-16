## XML (Extensible Markup Language)
состоит из объявлений в виде информации и определяющих тегов. С его помощью удобно хранить и передавать любые данные

## JSON (JavaScript Object Notation)
текстовый формат обмена данными, основанный на JavaScript. Но при этом формат независим от JS и может использоваться в любом языке программирования

## Postman

Основное предназначение приложения — создание коллекций с запросами к вашему API.
Главные понятия, которыми оперирует Postman это Collection (коллекция) на верхнем уровне, и Request (запрос) на нижнем. Вся работа начинается с коллекции и сводится к описанию вашего API с помощью запросов.

#### Collection

Можно рассматривать коллекцию, как файл проекта. Коллекция объединяет в себе все связанные запросы. Обычно API описывается в одной коллекции, но если вы желаете, то нет никаких ограничений сделать по-другому. Коллекция может иметь свои скрипты и переменные, которые мы рассмотрим позже.

#### Folder

Папка — используется для объединения запросов в одну группу внутри коллекции. К примеру, вы можете создать папку для первой версии своего API — "v1", а внутри сгруппировать запросы по смыслу выполняемых действий — "Order & Checkout", "User profile" и т. п. Папка, как и коллекция может иметь свои скрипты, но не переменные.

#### Request

Запрос — основная составляющая коллекции. Postman умеет выполнять запросы с помощью всех стандартных HTTP методов, все параметры запроса под вашим контролем. У запроса есть свои скрипты. Обратите внимание на вкладки "Pre-request Script" и "Tests" среди параметров запроса. Они позволяют добавить скрипты перед выполнением запроса и после.

#### Переменные

Postman имеет несколько пространств и областей видимости для переменных:

- Переменные окружения

- Локальные переменные

- Переменные уровня данных

Переменные окружения существуют отдельно от коллекций. Локальные переменные создаются из выполняемых скриптов. Также существуют переменные уровня данных, но они доступны только из Runner.

QA21 ilCarro collection https://bit.ly/3z1yycl