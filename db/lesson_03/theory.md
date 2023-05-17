## Что такое БД (DB)

- структурированный набор данных для автоматизированной обработки

## Что такое СУБД (DBMS)

- прикладное ПО (приложение)

## Что такое CRUD

- Create Read Update Delete

**Задача. Вывести `имена клиентов` и их `страны`, кроме тех, что из `USA`**

```sql
SELECT
	CustomerName,
	Country
FROM Customers
WHERE NOT Country = 'USA'
```

**Задача. Для поставщиков из `Japan` и `Spain` установить произвольными значениями `телефон` и `контактное имя`**

```sql
UPDATE Suppliers
SET
	ContactName = 'supplier 1',
	Phone = '000000000'
WHERE
	Country IN ('Japan', 'Spain')
```

### SQL `JOIN`: горизонтальное объединение таблиц

**Внешний ключ** - поле для связи между таблицами

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e4a9ee79-b02f-4080-aec6-c205c7aad76d/Untitled.png)

```sql
-- Синтаксис JOIN
SELECT <проекция>
FROM <таблица_1>
JOIN <таблица_2> ON <таблица_1.внешний_ключ>=<таблица_2.первичный_ключ>
```

**Пример. Вывести `номера заказов` и `имена` и `страны` покупателей, а также `имя менеджера`**

```sql
SELECT
	Orders.OrderID,
	Customers.CustomerName,
	Customers.Country,
	Employees.FirstName

FROM Orders

**JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID**
```

**Задача. Вывести информацию о товарах:**

- название_товара
- стоимость_товара_в_долларах
- название_категории

```sql
SELECT
		Products.ProductName,
    Products.Price * 1.1 AS Price_usd,
    Categories.CategoryName

FROM Products

**JOIN Categories ON Products.CategoryID=Categories.CategoryID**
```

**Задача. Вывести все заказы, которые повезет `Speedy Express`**

```sql
SELECT * 
FROM Orders

**JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID**

WHERE
	Shippers.ShipperName='Speedy Express'
```

**Задача. Вывести самый дорогой товар из категории `Beverages`**

```sql
SELECT * 
FROM Products

JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	CategoryName='Beverages'

ORDER BY Price DESC
LIMIT 1
```

**Задача. Вывести самый дорогой товар из категории `Beverages` из `USA`**

```sql
SELECT *
FROM Products 

JOIN Categories On Products.CategoryId = Categories.CategoryId
JOIN Suppliers On Products.SupplierId = Suppliers.SupplierID

WHERE
	Categories.CategoryName = 'Beverages'
	AND
	Suppliers.Country = 'USA' 

ORDER BY Price Desc
LIMIT 1
```

**Задача. Вывести заказы клиентов из `USA`, `Germany`, `UK`**

- номер_заказа
- полное_имя_клиента
- страна_клиента
- имя_и_фамилия_менеджера

```sql
SELECT
	Orders.OrderID,
	Customers.CustomerName,
	Customers.Country,
	Employees.FirstName,
	Employees.LastName 

FROM Orders

**JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID**

WHERE Customers.Country IN ('Germany', 'UK', 'USA');
```

**Задача. Вывести информацию о товарах с ценой от `10` до `150` EUR, которые были поставлены из `Japan`:**

- название_товара
- цена_товара
- цена_со_скидкой_15_процентов
- название_поставщика

```sql
SELECT
		Products.ProductName,
    Products.Price AS Price_full,
    Products.Price * .85 AS Price_discount_15_perc,
    Suppliers.SupplierName

FROM Products

**JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID**

WHERE
	Suppliers.Country ='Japan'
	AND
	Products.Price BETWEEN 10 AND 150
```

## Структура SQL

- `**DQL` (Data Query Language)**
    - `SELECT` - чтение
- `**DDL` (Data Definition Language)**
    - `CREATE` - создать объект (напр., БД, таблица и т.д.)
    - `DROP` - удалить
    - `ALTER` - изменить
    - `RENAME` - переименовать
- `**DML` (Data Manipulation Language)**
    - `INSERT INTO` - добавить записи
    - `UPDATE` - изменить записи
    - `DELETE` - удалить записи
- **`DCL` (Data Control Language)**
- **`TCL` (Transaction Control Language)**

## Создание БД

```sql
CREATE DATABASE db_name;
CREATE DATABASE IF NOT EXISTS db_name;
```

## Создание таблиц

```sql
CREATE TABLE <название_таблицы> (<структура>);

CREATE TABLE users (
	// название_поля тип_данных доп_хар-ки
	user_id int доп_хар-ки
);
```

## Основные типы данных в MySQL

- каждый столбец (поле) таблицы должен иметь указание на тип данных

### Числовые

- `int` / `integer`
- `decimal(x, y)`
    - `x` - ко-во цифр до запятой
    - `y` - ко-во цифр после запятой

### Строковые

- `varchar(x)`
    - `x` - макс. ко-во символов
- `text(x)`
    - `x` - макс. ко-во символов

### Логические

- `bool`

### Дата / время

- `datetime`
- `timestamp`
- `date`
- `time`

### Создание таблицы `users`

```sql
CREATE TABLE users (
		user_id int,
    created_at timestamp,
    username varchar(64),
		is_blocked bool
);
```

## Удаление таблиц

```sql
DROP TABLE table_name;
DROP TABLE IF EXISTS table_name;
```

### Создание таблицы `videos`

```sql
CREATE TABLE videos (
		video_id int,
    created_at timestamp,
    title varchar(64),
		author_id int,
    is_approved bool,
    duration_secs int
);
```

### Создание таблицы `comments`

```sql
CREATE TABLE comments (
		comment_id int,
    created_at timestamp,
		author_id int,
    content varchar(512),
		video_id int,
    related_id int
);
```

### Создание таблицы `reactions`

```sql
CREATE TABLE reactions (
		reaction_id int,
    created_at timestamp,
		author_id int,
		video_id int,
    value int
);
```

### Создание таблицы `donations`

```sql
CREATE TABLE donations (
	donation_id int,
	created_at timestamp,
	donator_id int,
	recipient_id int,
	amount decimal(6,2),
	comment varchar(256)
);
```

**Задача. Создать пользователя и два видео**

```sql
-- пользователя
INSERT INTO users (user_id, created_at, username, is_blocked)
VALUES
	(1, CURRENT_TIMESTAMP, 'super_user', false)
;

-- видео
INSERT INTO videos (video_id, created_at, title, author_id, is_approved, duration_secs)
VALUES
		(1, CURRENT_TIMESTAMP, 'About USA', 1, true, 3600),
    (2, CURRENT_TIMESTAMP, 'About Germany', 1, true, 7200)
;
```

## Спровочная документация

- [инструмент проектирования БД](https://dbdiagram.io/d/)
- [MySQL: типы данных](https://dev.mysql.com/doc/refman/8.0/en/data-types.html)
- [Онлайн БД](https://sqliteonline.com/)