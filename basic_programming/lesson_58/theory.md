# Анонимные классы
*Анонимный класс (anonymous class)* – локальный класс без имени,  описываемый на основе другого класса или интерфейса непосредственно при создание объекта.   

*Анонимный класс* всегда либо наследует (extends) от другого класса либо реализует  (implements) какой либо интерфейс. Объявление такого класса выполняется одновременно с созданием его объекта посредством оператора new в месте использования *inline* Использование *анонимных классов* позволяет совместить определение класса, создание объекта  и использование этого объекта.

Анонимные классы эффективно используются, как правило, для реализации простых интерфесов.
Нпример:
~~~java
Сomparator<Person> comparatorByAge =new Comparator<Person>() {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()- o2.getAge();
    }
};
~~~

В примере выше переменная comparatorByAge содержит объект *анонимного класса*, который реализует (implements) интерфейс Comparator<Person>
~~~java
Person extraPerson = new Person("Jack",35){ 
    @Override
    public String getName() {
        return "работае метод getName() " + super.getName();
    }
};
~~~
В этом примере переменная extraPerson содержит объект *анонимного класса*, который расширяет (extends) класс Person

Так как у анонимного класса нет имени, в анонимном классе нельзя определить или переопределить конструктор. Т.к. у анонимного класса нет имени, унаследовать от анонимного класса нельзя 


# Немного про регулярные выражения (дополнительно)  
[Регулярные выражения. Всё проще, чем кажется](https://habr.com/ru/post/567106/) 