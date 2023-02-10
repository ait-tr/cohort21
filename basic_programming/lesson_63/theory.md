# Enum
*Перечисления (Enum)* - особый тип класса c заранее предопределенным набором объектов. 

В простейшей форме перечисление представляет собой список именованных констант
~~~java.
public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;
}
~~~
Перечисления создаются с помощью ключевого слова *enum*. Идентификаторы *WINTER,
SPRING, SUMMER, AUTUMN* определяет набор констант *перечисляемого типа* Seasons т.е. фактически определяет набор значений, которые может принимать переменная или параметр типа Seasons. Например, если в программе следующий есть метод:
~~~java
public static void printSeason(Seasons season){
    switch (season){
        case AUTUMN:
            System.out.println("осень"); break;
        case SPRING:
            System.out.println("весна"); break;
        case SUMMER:
            System.out.println("лето"); break;
        case WINTER:
            System.out.println("зима"); break;
    }
    
}
~~~

В качестве параметра в этот метод мы сможем передать только одно из четырех значений перечисления *Season.WINTER, Season.SPRING, Season.SUMMER* или *Season.AUTUMN*. Таким образом, компилятор исключает возможность ошибится и передать что то отличное от перечисленных констант.

## values()
Получить все возможные значения перечисления можно с помощью метода: 
~~~java
Seasons.values()
~~~
Который вернет массив из всех возможных объектов класса Seasons т.е. 
~~~
[WINTER, SPRING, SUMMER, AUTUMN]
~~~   
Как было сказано выше, enum в Java это особый тип класса, соответственно объекты перечисляемого типа обладают всеми возможностями объектов Java: могут иметь поля, методы, конструкторы и т.д. Так пример описанный выше можно описать так:
~~~java
public enum Seasons {
    WINTER(1,"зима"),
    SPRING(2, "весна"),
    SUMMER(3, "лето"),
    AUTUMN(4, "осень");

    private String title;
    private int number;

    Seasons(int number, String title) {
        this.title = title;
        this.number = number;
    }

    @Override
    public String toString() {
        return number+". "+title;
    }
}
public static void printSeason(Seasons season){
    System.out.println(season);
}
~~~

и тогда вызов
~~~java
printSeason(Seasons.SPRING);
~~~

вернет 
~~~java
2. весна
~~~

Т..е. система как бы с ассоциировала с константным значением SPRING все его параметры (title и number). 