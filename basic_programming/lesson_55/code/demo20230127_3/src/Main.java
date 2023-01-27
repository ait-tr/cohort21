//Дан лист Account {String iban, Person owner}.
// Необходимо вернуть Map<Person,String>, где ключ,
//это Person а его значение это строка, изображение счета
//В рамках данной задачи считаем, что у Person-a есть только один счет, если несколько -> MoshennikException

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Я у мамы программист");
        List<Account> list = new ArrayList<>();
        list.add(new Account("DE01", new Person("Jack Sparrow")));
        list.add(new Account("DE02", new Person("Black Widow")));
        list.add(new Account("DE03", new Person("Hulk")));
        list.add(new Account("DE03", new Person("Hulk")));
        list.add(new Account("DE04", new Person("Hans Zimmer")));
        System.out.println(getPersonAccounts(list));
    }
    public static HashMap<Person, String> getPersonAccounts(List<Account> list)throws MoshennikException{
        HashMap<Person, String> res = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(res.containsKey(list.get(i).getOwner())){
                throw new MoshennikException("Мошенники!!!");
            }else{
                res.put(list.get(i).getOwner(),list.get(i).getIban());
            }
        }
        return res;
    }
}