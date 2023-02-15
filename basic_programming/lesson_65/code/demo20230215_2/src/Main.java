/*
Дан список банковских транзакций (Account debit, Account credit, amount),
класс Account(IBAN, Person) - банковский счет.
Необходимо реализовать метод который сортирует транзакции по сумме (по возрастанию, по убыванию),
по номеру счета дебита, по номеру счета кредита,
по имени персона в счете по дебету, по имени персона в счете по кредиту
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Transaction tr1 = new Transaction(new Account("DE01", new Person("Bob")), new Account("DE02", new Person("Mike")), 145);
        Transaction tr2 = new Transaction(new Account("DE02", new Person("Mike")), new Account("DE03", new Person("Jack")), 310);
        Transaction tr3 = new Transaction(new Account("DE04", new Person("John")), new Account("DE01", new Person("Bob")), 586);
        List<Transaction> list = List.of(tr1, tr2, tr3);

        Comparator<Transaction> compareTransactionByDebitPerson =(t1, t2) -> t1.getDebit().getPerson().getName().compareTo(t2.getDebit().getPerson().getName());
        Comparator<Transaction> compareTransactionByCreditPerson =(t1, t2) -> t1.getCredit().getPerson().getName().compareTo(t2.getCredit().getPerson().getName());
        System.out.println("------- amount -------");
        System.out.println(sortTransaction(list, (t1, t2) -> Double.compare(t1.getAmount(), t2.getAmount()))); // по сумме
        System.out.println("------- amount desc -------");
        System.out.println(sortTransaction(list, (t1, t2) -> Double.compare(t2.getAmount(), t1.getAmount()))); // по сумме в обратном порядке
        System.out.println("------- iban debit -------");
        System.out.println(sortTransaction(list, (t1, t2) -> t1.getDebit().getIban().compareTo(t2.getDebit().getIban()))); // по номеру дебета
        System.out.println("------- iban credit -------");
        System.out.println(sortTransaction(list, (t1, t2) -> t1.getCredit().getIban().compareTo(t2.getCredit().getIban()))); // по номеру кредита
        System.out.println("------- person debit -------");
        System.out.println(sortTransaction(list,compareTransactionByDebitPerson )); // по имени персона в счете по дебету
        System.out.println("------- person credit -------");
        System.out.println(sortTransaction(list, (t1, t2) -> t1.getCredit().getPerson().getName().compareTo(t2.getCredit().getPerson().getName()))); // по имени персона в счете по кредиту
        System.out.println("--------------");

        List<Transaction> transactions = sortTransaction(list, compareTransactionByCreditPerson);// по имени персона в счете по кредиту
        transactions.forEach((Transaction t)-> System.out.println(t) ); // implementation interface Consumer<Transaction>
/*  interface Consumer{
        void accept(Object o)
        }
 */

        Set.of(1,3,4,5,1,3,4,5).forEach(s-> System.out.println(s));

    }

    public static List<Transaction> sortTransaction(List<Transaction> transactions, Comparator<Transaction> comparator) {
        List<Transaction> result = new ArrayList<>(transactions);
        result.sort(comparator);
        return result;
    }
}