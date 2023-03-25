#Переменные и константы

В JS существует три кллючевых слова для объявления переменных:*let*, *const*, *var*
- let - объявление переменной
- const - объявление констант
- var - устаревший и не рекоммендованный способ объяления переменной

~~~javascript
//объявление переменной
let a=100;
//объявление константы
let b="строка";
~~~


#DOM
*DOM (от англ. Document Object Model — «объектная модель документа»)* — это независящий от платформы и языка программный интерфейс, позволяющий программам получить доступ к содержимому HTML-, XHTML- и XML-документов, а также изменять содержимое, структуру и оформление таких документов.



#Некоорые методы DOM

- **Получить элемент по ID**
~~~javascript
let element = document.getElementById("idh1");
~~~

- **Получить элементы по имени класса**
~~~javascript
let elements = document.getElementsByClassName("normal-text");
~~~

- **Получить элементы c заданным тегом**
~~~javascript
let elements = document.getElementsByTagName("div");
~~~

- **Получить элементы по CSS селекторы**
~~~javascript
let elements = document.querySelectorAll(".normal-text");
~~~
