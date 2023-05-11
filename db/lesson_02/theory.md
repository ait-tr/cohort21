### Категории операций в СУБД

1. `CRUD` (Create, Read, Update, Delete)
2. Aggregation (аналитики, итоги, стастистика) - вычисленных данных

**Задача. Вывести самый дорогой товар из категорий `5` и `8`**

```sql
SELECT *  
FROM [Products] 
WHERE CategoryID IN (5,8) 
ORDER BY Price DESC 
LIMIT 1
```

**Задача. Вывести `название` и `стоимость` самого дешевого товара в `USD`**

```sql
SELECT
	ProductName,
	Price * 1.1 AS Price_usd
FROM [Products]
ORDER BY Price
LIMIT 1
```

**Задача. Вывести имена клиентов, кроме тех, что из `UK` и `USA`**

```sql
SELECT
		CustomerName,
    Country
FROM Customers
WHERE
	NOT Country IN ('UK', 'USA')
```

## Приоритеты логических операторов (сверху вниз)

1. `NOT`
2. `AND`
3. `OR`

**Проекция** - инструмент оптимизации запросов. Применяется для:

- уменьшение времени запроса
- снижение нагрузки на выч/ресурс

```sql
SELECT
	ProductName -- проекция (ограничение) по полям
FROM Products
```

### SQL: CRUD

**Create**

`INSERT INTO`

**Read**

`SELECT`

`SELECT DISTINCT`

**Update**

`UPDATE`

**Delete**

`DELETE FROM`

**Задача. Вывести товары с ценой от `10` до `50` EUR из категории `5`**

- название
- цена

```sql
SELECT
	ProductName,
	Price
FROM Products
WHERE
	CategoryID=5
	AND
	Price BETWEEN 10 AND 50
```

**Задача. Вывести названия городов поставщиков из `USA`**

```sql
SELECT DISTINCT -- только уникальные
	City          -- города
FROM Suppliers
WHERE Country='USA'
```

## SQL: `DELETE FROM`

```sql
-- Удалить все товары
DELETE FROM Products

-- Удалить товары от 200 EUR
DELETE FROM Products
WHERE
	Price >= 200
```

**Задача. Удалить сотрудников `1` и `3`**

```sql
DELETE FROM Employees
WHERE EmployeeID IN (1, 3)
```

### Первичный ключ в БД

Это поле, которое однозначно идентифицирует каждую запись

- в качестве значения используют
    - авто-инкремент
    - случайные значения (стандарт `UUID` и т.д.)

**Свойства:**

- уникальность
- непустой
- неизменяемость

## SQL: `INSERT INTO`

**Пример. Добавление нового клиента**

```sql
INSERT INTO Customers(CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
	('Ivan Ivanov', NULL, NULL, NULL, NULL, NULL),
	('Petr Petrov', NULL, NULL, NULL, NULL, NULL);
```

**Задача. Добавить нового поставщика из `China`**

```sql
INSERT INTO Suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
VALUES 
	(NULL, NULL, NULL, NULL, NULL, 'China', NULL);
```

### Операторы `IS NULL` и `IS NOT NULL`

Проверка на **неопределенное значение**

Пример

```sql
SELECT *
FROM Suppliers
WHERE Phone **IS NOT NULL**
```

## SQL: `UPDATE`

```sql
UPDATE Customers
SET
	ContactName='Polina'
WHERE 
	CustomerID=1
```

**Задача. Для поставщиков из `Japan` и `Spain` изменить `телефон` и `контактное_имя` на произвольные значения**

```sql
UPDATE Suppliers
SET
	ContactName='Ivan Ivanov',
	Phone='0000000000'
WHERE
	Country IN ('Japan', 'Spain')
```

**Задача. У всех товаров от `50` до `60` (EUR) очистить `название` и установить `категорию 2`**

```sql
UPDATE Products
SET
		ProductName=NULL,
	  CategoryID=2
WHERE Price BETWEEN 50 AND 60
```

**Задача. Применить ко всем товарам до `50` EUR постоянную скидку в `15.5%`**

```sql
UPDATE Products
SET Price=Price * (1-.155)
WHERE Price <= 50
```

**Задача. У товаров из категории `1` очистить поле `Unit`**

```sql
UPDATE Products
SET
	Unit=NULL
WHERE CategoryID=1
```

**Задача. Вывести самый дорогой товар у которого поле `Unit` неопределено**

```sql
SELECT *
FROM Products
WHERE
	Unit IS NULL
ORDER BY Price DESC
LIMIT 1
```

## Хеширование паролей

Напр., по алгоритму `SHA1`


**Справочная документация**

- [хеширование паролей](https://www.kaspersky.ru/blog/the-wonders-of-hashing/3633/)