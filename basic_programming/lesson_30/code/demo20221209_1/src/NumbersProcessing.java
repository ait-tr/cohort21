public class NumbersProcessing {
    private int capacity=2;
    private int[] array= new int[capacity];
    private int size=0;
    
    public void add(int num){
        if(size>=array.length){
            enlarge();
        }
        array[size++]=num;
    }

    public void enlarge(){
        int[] array2= new int[array.length*2];
        for (int i = 0; i < size; i++) {
            array2[i]=array[i];
        }
        array=array2; // изменили ссылку на новый массив
    }
    
    public String toString(){
        String res="";
        for (int i = 0; i < size ; i++) {
            res+= array[i]+"   ";
        }
        return res;
    }

    public long sum(){
        long res=0;
        for (int i = 0; i < size; i++) {
            res+=array[i];
        }
        return res;
    }

    public double avg(){
        if(size!=0) {
            return sum() / (double)size;
        } else {
            return 0;
        }
    }


    public boolean find(int num){
        boolean res=false;
        for (int i = 0; i <size ; i++) {
            if (array[i]==num){
                return true;
            }
        }
        return res;
    }
    
    
}
