import java.util.Comparator;

public class ProductComparatorByName implements ProductComparator {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }

    @Override
    public String name() {
        return "по-имени";
    }
}
