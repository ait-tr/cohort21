public class Main {
    public static void main(String[] args) {

//        String[] patients = {"Patient 1", "Patient 2",...,  "Patient 30"};
        String[] patients = new String[30];// мы создали массив из 30 элементов, пока он заполнен null

        for(int i = 0; i <30; i++) {
            patients[i] = "Patient " + (i+1); // присваиваем значение элементу массива с индексом i, значение явлется строкой String
            System.out.println(patients[i]);  // выводим на печать элемент с индексом i
        }
    }
}