import java.util.Arrays;

public class People {
    private int capacity;
    private Person[] array;
    private int size;

    public People() {
        this.capacity =3;
        array = new Person[capacity];
        size=0;
    }

    public void add(Person person){
        if(size<array.length){
            array[size++]= person;
        }
    }

    public People selectPersonOlderThan(int age){
        People res=new People();
        for (int i = 0; i < size ; i++) {
            if(array[i].getAge()>age){
                res.add(array[i]);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res="";
        for (int i = 0; i < size ; i++) {
            res+=array[i] + "\n";
        }
        return res;
    }
}
