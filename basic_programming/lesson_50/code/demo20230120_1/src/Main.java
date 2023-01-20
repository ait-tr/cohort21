/*
Допустим, у вас в программе есть класс Programmer. Кроме имени у нег есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».  Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата, либо возвращает stringMsg большими буквами, либо ProgrammerBusyException, либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.

 */


public class Main {
    public static void main(String[] args)  {

        Programmer p = new Programmer("Jack");
        p.setBusy();

        try {
            System.out.println(p.doWork("asdfghjkl"));
        } catch (ProgrammerBusyException e){
            System.out.println("Программер занят!");
        } catch (ProgrammerUnavailableNowException e){
            System.out.println("Программер не доступен");
        }

        //p.doWork("qwertyuio"); // if unchecked exception - ok


    }

}