import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings ={
                "Jack",
                "Stan",
                "John",
                "Ann",

        };


        Person[] persons = {
                new Person("Jack1", "Jack2", 25, 85.5),
                new Person("John1", "John2", 20, 89.3),
                new Person("Ann1", "Ann2", 22, 60.1),
                new Person("Stan1", "Stan2", 35, 110.5),
                new Person("Lena1", "Lena2", 33, 66.5),
        };

        int[] numbers = {1,6,-2,0,9,17,7};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


        Arrays.sort(persons,new PersonComparatorByAge());
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons,new PersonComparatorByName());
        System.out.println(Arrays.toString(persons));


        Arrays.sort(persons,new PersonComparatorByWeight());
        System.out.println(Arrays.toString(persons));



        //System.out.println(persons[2].compareTo(persons[0]));

    }

    public static void bubbleSort1(int[] array){
        for (int i=0; i<array.length-1; i++){
            for (int j = 0; j < array.length-1; j++) {

                if (array[j] > array[j + 1]) {

                    swap(array, j);
                }

            }
        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }


}