public class NumbersProcessing {
    int capacity=10;
    int[] array= new int[capacity];
    int size=0;
    
    public void add(int num){
        if(size<array.length){
            array[size++]=num;
        }
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
