## Изученные тематические блоки (SQL):

- **CRUD**
- **DDL (Data Definition Language)**
- **Горизонтальное объединение таблиц (`JOIN`)**
- **Визуальное проектирование БД**

## Типы данных

- ограничение типа хранимых данных (например, только целое)

## Особенности реляционной модели (способ структурирования данных)

- хранение в виде таблиц (строк и т.д.) и связей между ними
- позволяет хранить только скалярные значения (скаляры) - есть исключения (напр., `PostgreSQL`)
- строгая схема описания данных (сперва необх. создать БД, таблицы и т.д.), включая типы данных

## Агрегация данных в SQL

**Базовые категории запросов**

1. **CRUD** - более простые запросы
2. **Aggregation** - получение вычисленных данных (итоги, статистика, аналитика)

**Базовые операторы агрегации**

- `COUNT()` - считает ко-во строк
- `MIN()`
- `MAX()`
- `SUM()`
- `AVG()`

**Примеры**

```sql
SELECT
		COUNT(*) AS total_products,
    MAX(Price) AS max_price,
    MIN(Price) AS min_price,
    SUM(Price) AS total_cost,
    AVG(Price) AS total_price
FROM Products
```

**Задача. Вывести `ко-во товаров` из категории `1`**

```sql
SELECT
		COUNT(*) AS total_products
FROM Products
WHERE
		CategoryID=1
```

**Задача. Вывести ко-во клиентов из `Germany` и `France`**

```sql
SELECT
	COUNT(*) AS total_customers
FROM Customers
WHERE
	Country IN ('Germany', 'France')

-- Country='Germany'
-- OR
-- Country='France'
```

**Задача. Вывести `ко-во поставщиков` не из `USA` и `UK`**

```sql
SELECT
	COUNT(*) AS total_suppliers
FROM Suppliers
WHERE
	Country NOT IN ('USA', 'UK')
```

**Задача. Посчитать стоимость заказа `10248`**

```sql
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE
	OrderDetails.OrderID=10248
```

**Задача. Вывести среднюю стоимость товаров от поставщика `3` (`название компании`, `сред/стоимость`)**

```sql
SELECT
	Suppliers.SupplierName,
	AVG(Products.Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

WHERE
	Suppliers.SupplierID=3
```

**Задача. Вывести среднюю стоимость напитка из `USA`**

```sql
SELECT 
	AVG(Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Beverages'
	AND
	Suppliers.Country='USA'
```

**Задача. Вывести список стран, которые поставляют морепродукты**

```sql
SELECT DISTINCT
	Suppliers.Country

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Seafood'
```

**Задача. На какую сумму было отправлено товаров клиентам в `USA`**