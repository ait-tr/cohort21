// Дан лист Panda нужно получить Map/<Panda, Boolean/>, где ключ - Panda,
// значение - true, если Panda встретилась более одного раза, иначе false


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Panda!");
    }

    static Map<Panda, Boolean> checkedPandas(List<Panda> listOfPanda) {
        Map<Panda, Boolean> resultMap = new HashMap<>();

        for (Panda pnd : listOfPanda) {
            resultMap.put(pnd, resultMap.containsKey(pnd) ? true : false);
        }

        return resultMap;
    }
}