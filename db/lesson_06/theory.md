## MongoDB: документо-ориентированная СУБД

**Принципиальные отличия MongoDB от RDBMS**

1. Другой язык для выполнения запросов (NoSQL - `Query API`)
2. Модель данных - **ДОКУМЕНТНАЯ** (документ - ассоц/массив)
3. Динимическая схема данных (без схемы, schemaless) - каждый документ может иметь свой набор полей
4. Для хранения использует `JSON` и `Binary JSON` (`BSON`)
5. Позволяет хранить вложенные структуры данных

## Базовые структуры данных

1. Скаляр (скалярное значение)
2. Массив (список значений)
3. Ассоц/массив (пары ключ/значение)
4. Множество (список **уникальных** значений)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ae6be29-c275-4579-813c-f56d2321686b/Untitled.png)

## **MongoDB GUI Client**

[Download Studio 3T for MongoDB | Windows, macOS & Linux](https://studio3t.com/download/)

## Масштабирование

1. Горизонтальное (количество)
2. Вертикальное (качество)

## MongoDB: CRUD

**Create**

- `insertOne()` добавить один документ
    - один аргумент
        - ассоц/массив (объект)
- `insertMany()` добавить несколько документов
    - один аргумент
        - массив ассоц/массивов

**Read**

- `findOne()`  найти (выбрать) один документ
- `find()` найти (выбрать) несколько документов
    - аргументы
        - `filter`
        - `projection`
- `countDocuments()` ко-во совпадений
    - аргументы
        - `filter`

**Update**

- `updateOne()` изменить один документ
- `updateMany()` изменить несколько документов
    - аргументы
        - `filter`
        - `action`

**Delete**

- `deleteOne()` удалить один документ
- `deleteMany()` удалить несколько документов
    - аргументы
        - `filter`

![Screenshot from 2023-06-07 12-11-11.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e6f2340-c822-434f-8993-f779763fb45a/Screenshot_from_2023-06-07_12-11-11.png)

**Пример. Добавление клиента**

```jsx
db.clients.insertOne({
    id: 'x888',
    name: 'Ivan Ivanov',
    country: 'USA'
})
```

**Пример. Вывести всех клиентов**

```jsx
db.clients.find()
```

**Пример. Вывести клиентов из `USA`**

```jsx
db.clients.find(
    {country: 'USA'} // filter
)

// с проекцией
db.clients.find(
    {country: 'USA'}, // filter
    {name: 1, _id: 0} // projection
)
```

**Пример. Вывести указанного клиента**

```jsx
db.clients.findOne(
    {id: 'x888'} // filter
)
```

**Пример. Вычислить ко-во клиентов из `USA`**

```jsx
db.clients.countDocuments(
    {country: 'USA'} // filter
)
```

**Пример. Авторизация клиентов**

```jsx
db.clients.countDocuments({
    email: 'user@example.org',
    password: 'kjt83j84593',
    is_blocked: {'$ne': true}
})
```

**Пример. Удалить пользователей из `China`**

```jsx
db.clients.deleteMany(
	{country: 'China'}
)
```

## Базовые операторы модификации (`updateOne` / `updateMany()`)

`$set` установить поля

`$unset` удалить (снять) поля

`$inc` инкремент полей (увеличить/уменьшить)

`$mul` умножение

**Пример. Заблокировать клиентов из `USA`**

```jsx
db.clients.updateMany(
    {country: 'USA'}, // filter
    { 
        $set: {
            is_blocked: true
        }
    } // action
)
```

**Пример. Вывести заблокированных клиентов**

```jsx
db.clients.find(
    {is_blocked: true}
)
```

**Задача. Вывести имена заблокированных клиентов**

```jsx
db.clients.find(
    {is_blocked: true},
    {name: 1, _id: 0}
)
```

**Пример. Добавить транзакцию**

```jsx
db.txs.insertOne({
    id: 't9585',
    created_at: new Date(),
    sender_id: 'x888',
    recipient_id: 'o001',
    amount: 100.5,
    currency: 'eur',
    comment: 'just for fun'
})
```

**Задача. Вывести информацию о транзакциях: `сумма` и `валюта`**

```jsx
db.txs.find(
    {}, // filter
    {amount: 1, currency: 1, _id: 0} // projection
)
```

## Операторы сравнения

`$eq` равно (equal)

`$ne` не равно (not equal)

`$gt` больше (greater than)

`$gte` больше или равно (greater than or equal)

`$lt` меньше (less than)

`$lte` меньше или равно (less than or equal)

**Пример. Вывести транзакции от `100` EUR (проекция: `сумма`)**

```jsx
db.txs.find(
    {
        currency: 'eur',
        amount: {$gte: 100}
    }, // filter
    {amount: 1, _id: 0} // projection
)
```

**Задача. Вывести `USD`-транзакции до `1000` (проекция: `сумма` и `комментарий`)**

```jsx
db.txs.find(
    {
        currency: 'usd',
        amount: {$lte: 1000}
    }, // filter
    {amount: 1, comment: 1, _id: 0} // projection
)
```

**Задача. Вывести `USD`-транзакции от `10` до `200` (проекция: `сумма` и `комментарий`)**

```jsx
db.txs.find(
    {
        currency: 'usd',
        amount: {
					$gte: 10,
					$lte: 200
				}
    }, // filter
    {amount: 1, comment: 1, _id: 0} // projection
)
```

**Задача. Разблокировать клиентов из `USA`**

```jsx
db.clients.updateMany(
    {country: 'USA'}, // filter
    { // action
        $unset: {
            is_blocked: null
        }
    }
)
```

**Задача. Разблокировать клиентов не из `USA`**

```jsx
db.clients.updateMany(
	{country: {$ne: 'USA'}}, // filter
	{
		$unset: {
			is_blocked: null
		}
	} // action
)
```

**Пример. Добавить товар в коллекцию `goods`**

```jsx
db.goods.insertOne({
    id: 'g09855',
    created_at: new Date(),
    title: 'Good 1',
    price: 200,
    quantity: 10
})
```

**Пример. Увеличить ко-во одного товара на складе на `5`**

```jsx
db.goods.updateOne(
    { id: 'g09855' }, // filter
    { // action
        $inc: { quantity: 5 }
    }
)
```

**Задача. Уменьшить ко-во одного товара на складе на `2`**

```jsx
db.goods.updateOne(
	{id: 'g0855'}, // filter
	{
		$inc: {quantity: -2}
	} // action
)
```

**Задача. Вывести `название` и `ко-во товаров`, остаток по которым - от `10`**

```jsx
db.goods.find(
  { quantity: { $gte: 10 } },
  { title: 1, quantity: 1, _id: 0 }
)
```

**Задача. Применить скидку в `12.5%` (уменьшить стоимость) ко всем товарам от `100` EUR**

```jsx
db.goods.updateMany(
	{price: {$gte: 100}},
	{
		$mul: {
			price: .875
		}
	}
)
```

**Задача. Применить наценку в `9%` (увеличить стоимость) ко всем товарам**

```jsx
db.goods.updateMany(
	{},
	{
		$mul: {
			price: 1.09
		}
	}
)
```

**Задача. Вывести товары с ценой от `10` до `5000` EUR (проекция: `название`, `цена`)**

```jsx
db.goods.find(
    {
        price: {
            $gte: 10,
            $lte: 5000
        }
    },
    { title: 1, price: 1, _id: 0 }
)
```

## Справочная информация

- как установить MongoDB
    - [Windows](https://timeweb.cloud/tutorials/mongodb/ustanovka-mongodb-na-raznye-os-windows-ubuntu-centos)
    - [Mac](https://www.imymac.com/ru/mac-tips/install-mongodb-mac.html)