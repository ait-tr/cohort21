## Группировка в SQL

- **Группировка** - объединение записей на основе общего признака с целью получения обобщенных данных для конкретной группы
- Выполняется с помощью оператора `GROUP BY`

**Пример. Вывести количественное распределение клиентов по странам**

```sql
SELECT
	Country,
	COUNT(*) AS total_customers

FROM Customers

GROUP BY Country

ORDER BY total_customers DESC
```

**Пример. Вывести сред/стоимость товара для каждой категории**

```sql
SELECT
		CategoryID,
    AVG(Price) AS avg_price

FROM Products

GROUP BY CategoryID

ORDER BY avg_price DESC
```

**Задача. Вывести в порядке убывания сред/стоимость товара для каждого поставщика**

проекция: `id_поставщика`, `ср/цена`

```sql
SELECT
		SupplierID,
    AVG(Price) AS avg_price

FROM Products

GROUP BY SupplierID

ORDER BY avg_price DESC
```

**Задача. Вывести ТОП-2 поставщиков, которые привезли больше всего товаров**

проекция: `название_поставщика`, `ко-во_поставленных_товаров`

```sql
SELECT
	Suppliers.SupplierName,
	COUNT(*) AS total_products

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

GROUP BY Products.SupplierID

ORDER BY total_products DESC
LIMIT 2
```

**Задача. Вывести стоимость каждого заказа в упорядоченном виде**

проекция: `номер_заказа`, `сумма_заказа`

```sql
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.OrderID

ORDER BY order_cost DESC
```

**Задача. Вывести стоимость заказов от `5000` EUR в упорядоченном виде**

проекция: `номер_заказа`, `сумма_заказа`

```sql
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.OrderID

HAVING order_cost >= 5000

ORDER BY order_cost DESC
```

## Оператор `HAVING`

- аналог `WHERE`, который позволяет отфильтровать агрегированные данные

**Задача. Вывести страны, в которые было отправлено `3` и более заказов**

проекция: `страна`, `ко-во заказов`

```sql
SELECT
		Customers.Country,
    COUNT(*) AS total_orders
FROM Orders

JOIN Customers ON Orders.CustomerID=Customers.CustomerID

GROUP BY Customers.Country
HAVING total_orders>=3

ORDER BY total_orders DESC
```

**Задача. Вывести информацию о компаниях-доставщиках**

проекция: `название_компании`, `ко-во_доставленных_заказов`

```sql
SELECT
	Shippers.ShipperName,
	COUNT(*) AS orders_shipped

FROM Shippers

JOIN Orders ON Orders.ShipperID=Shippers.ShipperID

GROUP BY Shippers.ShipperID

ORDER BY orders_shipped DESC
```

## Проектирование БД

1. На одном сервере могут находиться **СУБД (DBMS)**
- **сетевой порт** - сетевой идентификатор процесса (программы)
1. В одной **СУБД** может находиться несколько **БД**
2. В одной **БД** может храниться несколько типов сущностей (объектов)
3. Стандартный подход: **ОДНА БД == ОДИН ПРОЕКТ**
4. Стандартный подход: **ОДНА СУЩНОСТЬ == ОДНА ЗАПИСЬ**

## Общие этапы проектирования БД

1. Анализ предметной обасти (бизнес-процессов)
2. Выделение сущностей и их свойств (характеристик)
3. Связывание сущностей между собой (установление связей)
    1. с помощью ключевых полей (`первичный` и `внешний` ключи)
4. Проверка решения (гипотезы)

## Первичный ключ (PRIMARY KEY)

- Является идентификатором каждой сущности

**Свойства**

- уникальный
- неизменяемый
- ненулевой

**Стандартные подходы к определению значения**

1. Авто-инкремент
2. Случайные значения (`UUID`, `GUID`, `ULID`)

## Унификация хранимых данных

Приведение к единому виду

- например, **номер телефона**

## Базовые виды связей между сущностями

- `1:1` (один к одному)
- `1:M` (один ко многим)
- `M:M` (многие ко многим)

**Задача. Описать типы связей в БД “песочница: онлайн-магазин”**

```sql
OrderDetails.OrderID (M:1) Orders.OrderID
OrderDetails.ProductID (M:1) Products.ProductID

Orders.CustomerID (M:1) Customers.CustomerID
Orders.EmployeeID (M:1) Employees.EmployeeID
Orders.ShipperID (M:1) Shippers.ShipperID

Products.SupplierID (M:1) Suppliers.SupplierID
Products.CategoryID (M:1) Categories.CategoryID
```

## Справочная информация

- [инструмент проектирования БД](https://dbdiagram.io/d/)
- [схема online-курсы](https://dbdiagram.io/d/6467c575dca9fb07c46a1047)