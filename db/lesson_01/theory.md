### Базовый состав типового проекта

- `**DB` - хранилища**
- `FE` - интерфейс
    - Веб-сайты - человеко-чит.
    - Приложения - человеко-чит.
    - `API` - машино-чит.
- `BE` - бизнес-логика
- `Deployment` - развертывание



### Основная задача любого разработчика

Автоматизация бизнес-процессов

### Базы данных (Data Bases, DB)

**БД (DB)** - структурированный набор данных, предназначенный для автоматизированной оброботки

- фактически, представляет собой **данные**
- цифровой копией сущностей (объектов) реального мира

**СУБД (DBMS, Data Base Management Software)** - прикладное ПО (приложение)

- Система Управления Базой Данных

### Схема работы с БД

`BE → DBMS → DB`

### Типы СУБД

- Первичная (primary) - напр., `MySQL`
- Вторичная (secondary) - напр., `Redis`

### Модели данных (БД)

Это способ описания (хранения, структурирования) данных

1. Реляционная (табличная) - напр., `MySQL`
2. Документная (документ - ассоц/массив) - напр., `MongoDB`
3. Графовая (теория графов) - напр., `OrientDB`
4. Плоская - напр., `Redis`

### Типы операций в СУБД

- Чтение
- Запись

### Категории операций в СУБД

1. `CRUD` (Create, Read, Update, Delete)
2. Aggregation (аналитики, итоги, стастистика) - вычисленных данных

### Способы подключения к СУБД

1. Из программного кода (`BE`) - целевой способ
2. Из `GUI/CLI`-клиентов - вспомогательный способ

**Самая распространенная архитектура (подход) хранения данных**

**ОДНА СУЩНОСТЬ (ОБЪЕКТ) == ОДНА ЗАПИСЬ**

### SQL: CRUD

`SQL` - язык структурированных запросов

**Проекция** - инструмент оптимизации запросов. Применяется для:

- уменьшение времени запроса
- снижение нагрузки на выч/ресурс

**Read**

`SELECT`

`SELECT DISTINCT` (только уникальные значения)

```sql
SELECT Country, City
FROM Customers
```

```sql
SELECT **DISTINCT** Country
FROM Customers
```

**Вывести пользователей из Германии**

```sql
SELECT *
FROM Customers
**WHERE Country='Germany'** -- фильтрация по стране
```

### Логические операторы в SQL

`AND`

`OR`

`NOT`

```sql
SELECT *
FROM Customers
WHERE Country='Germany' AND PostalCode='12209'
```

```sql
SELECT *
FROM Customers
WHERE Country='Germany' OR Country='France'
```

```sql
SELECT *
FROM Customers
WHERE NOT Country='Germany'
-- WHERE Country!='Germany'
-- WHERE Country<>'Germany'
```

### Оператор `IN`

Проверка принадлежности к списку значений

```sql
SELECT *
FROM Customers
WHERE Country IN ('Germany', 'France', 'USA')
```

### Операторы сравнения

`=` равно

`!=` `<>` не равно

`>`больше

`<`меньше

`>=` больше или равно

`<=` меньше или равно

```sql
SELECT *
FROM Products
WHERE Price>=100
```

**Вывести товары в диапазоне цены: от 50 до 100 (EUR)**

```sql
SELECT *
FROM Products
WHERE Price>=50 AND Price<=100
```

**Вывести название и стоимость товаров из категорий `1` и `3` со стоимостью до `50` (EUR)**

```sql
SELECT
		ProductName,
    Price
FROM Products
WHERE
	Price<=50
	AND
  CategoryID IN (1, 3)
```

### Сортировка

`ORDER BY`

```sql
SELECT *
FROM Products
**ORDER BY Price DESC**
-- **ASC** по возврастанию (по умолчанию)
-- **DESC** по убыванию
```

### Лимитирование вывода

`LIMIT`

```sql
SELECT *
FROM Products
ORDER BY Price DESC
**LIMIT 10**
```

### Псевдонимы в SQL

Оператор `AS`

```sql
SELECT 
		Price **AS** Price_eur,
    Price * 1.1 **AS** Price_usd
FROM Products
```

**Вывести названия товаров, а также их стоимость:**

- полную
- со скидкой 25%
- с наценкой 15%

```sql
SELECT
		ProductName,
		Price AS Price_full,
		Price * .75 AS Price_down,
    Price * 1.15 AS Price_up
FROM Products
```

**Вывести название и стоимость самого дорогого товара из `5` категории**

```sql
SELECT ProductName, Price
FROM Products
WHERE CategoryID=5
ORDER BY Price DESC
LIMIT 1
```

**Выборка по диапазону значений**

`BETWEEN`

```sql
SELECT ProductName, Price
FROM Products
WHERE Price **BETWEEN** 50 AND 100
-- WHERE Price>= 50 AND Price<=100
```

**Пагинация**

`LIMIT` + `OFFSET`

```sql
SELECT ProductName, Price
FROM Products
ORDER BY Price DESC
**LIMIT 10 OFFSET 0** -- первая страница
```


### Справочная информация

[SQL](https://ru.wikipedia.org/wiki/SQL)

[Песочница](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all)

Установка MySQL

[Windows](https://timeweb.cloud/tutorials/mysql/kak-ustanovit-mysql-na-windows)

[Mac](https://vladster.net/ru/%D0%BA%D0%B0%D0%BA-%D1%83%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%B8%D1%82%D1%8C-mysql-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80-%D0%BD%D0%B0-mac-os-x/)

[Конспект в Notion](https://western-appeal-39b.notion.site/DB-Apr-19-2023-6e3fed8f2c6341d184425ba76c370f4e)