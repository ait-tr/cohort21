package HW221214;

public class Assortment {

    private Product[] assortment;
    private int capacity = 20;
    private int size = 0;


    public Assortment() {
        this.assortment = new Product[capacity];
    }
    // приватный Конструктор - ассортимент, только для вывода конкретной категории товаров (не доделано)
    private Assortment(int capacity) {
        assortment = new Product[capacity];
    }

    public void addTypeOfProduct(Product product) {
        if (size == capacity) {
            assortment = enlarge();
        }
        assortment[size++] = product;
    }

    private Product[] enlarge() {
        capacity *= 2;
        Product[] specialAssortment = new Product[capacity];
        for (int i = 0; i < size; i++) {
            specialAssortment[i] = assortment[i];
        }
        return specialAssortment;
    }


//    public Assortment showClothes() {
//        Assortment clothes = new Assortment(size);
//        for (int i = 0; i < size; i++) {
//
//        }
//        return clothes;
//    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += assortment[i] + "\n";
        }
        return result;
    }

    public int getSize() {
        return size;
    }
}



