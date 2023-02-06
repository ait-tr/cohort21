import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public List<String> unDbl(List<String> list){
        LinkedHashSet<String> set;
        return  new ArrayList<>(new LinkedHashSet<>(list));
    }
}