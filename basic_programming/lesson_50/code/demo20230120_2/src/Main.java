/*
 * Давайте дополним задачу 1. Допустим, у вас в программе есть TeamLead, который  тоже может быть «доступен» и «не доступен», что определяется текущим значением поля status. Еще у него есть поле List<Programmer> team, которое содержит список. Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу первому доступному программисту ( вызвав у него doWork(String taskMsg) и вернут результат, либо возвращает exceptions.TeamLeadUnavailableNowException либо exceptions.AllProgrammersAreBusyNowException. В зависимости от результата, вызывающий main выводить результат работы или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте».
 */


import exceptions.AllProgrammersAreBusyNowException;
import exceptions.TeamLeadUnavailableNowException;

import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Programmer p1 = new Programmer("Jack");
        Programmer p2 = new Programmer("John");
        p1.setBusy();
        p2.setNotAvailable();


        TeamLead teamLead = new TeamLead("Anna", List.of(p1,p2));
        //teamLead.setNotAvailable();

        try {
            System.out.println(teamLead.doTask("qwertyuio"));
        } catch (AllProgrammersAreBusyNowException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getReasons());
        } catch (TeamLeadUnavailableNowException e){
            System.out.println("Почему TeamLead не на месте!?");
        }


    }

}