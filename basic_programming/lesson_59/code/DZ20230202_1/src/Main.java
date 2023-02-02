import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//Есть лист из BankAccountWithOwner {String IBANN;     Person owner;}
//нужно написать функцию, которая возвращает мапу,
// где ключом является Person, а значением - список его банковских счетов.
public class Main {
    public static void main(String[] args) {

        List<BankAccountWithOwner> list = List.of(
                new BankAccountWithOwner("DE01", new Person("Adam")),
                new BankAccountWithOwner("DE02", new Person("Eve")),
                new BankAccountWithOwner("DE03", new Person("Mark")),
                new BankAccountWithOwner("DE04", new Person("Adam")),
                new BankAccountWithOwner("DE05", new Person("Shilen")),
                new BankAccountWithOwner("DE06", new Person("Adam")),
                new BankAccountWithOwner("DE07", new Person("Shilen")));

        System.out.println(listOfAccounts(list));

    }

    public static Map<Person, HashSet<String>> listOfAccounts(List<BankAccountWithOwner> list){
        Map<Person, HashSet<String>> result = new HashMap<>();
        for(BankAccountWithOwner b : list){

            if(b==null ||b.getIban() == null || b.getOwner() == null){
                System.out.println("Не корректные данные"); // addToLog()
                continue;
            }
            HashSet<String> ibans;
            if(!result.containsKey(b.getOwner())){
                ibans = new HashSet<>();
                ibans.add(b.getIban());
                result.put(b.getOwner(), ibans);
            }
            else{
                ibans = result.get(b.getOwner());
                ibans.add(b.getIban());
            }
        }
        return result;
    }
}