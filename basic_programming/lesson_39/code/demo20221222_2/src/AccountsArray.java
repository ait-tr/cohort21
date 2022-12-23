public class AccountsArray {
    private  Account[] array = new Account[4];
    private int size=0;


    public Account[] findAccountsByPerson(Person person) {
        AccountsArray res = new AccountsArray();
        for (int i = 0; i < size ; i++) {
            if (array[i].getClient().equals(person)) {
                res.add(array[i]);
            }
        }
        return res.getAsArray();
    }



    public void  add (Account[] accounts){
        for (Account acc:accounts){
            add(acc);
        }
    }

    public void add(Account account){
        if(size>=array.length){
        enlarge();
        }
        array[size++]=account;
    }




    private void enlarge(){
        Account[] res= new Account[array.length*2];
        for (int i = 0; i < size; i++) {
            res[i]=array[i];
        }
        array=res;
    }

    public String toString(){
        String res="";
        for (int i = 0; i < size; i++) {
            res+=array[i]+System.lineSeparator();
        }
        return res;
    }

    public Account[] getAsArray() {
        Account[] res = new Account[size];
        for (int i = 0; i < size; i++) {
            res[i] = array[i];
        }
        return res;
    }



    public void print(){
        System.out.println(" ------------ print -------------");
        System.out.println("size="+size);
        System.out.println("array.length="+array.length);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    public void print1(){
        System.out.println(" ------------ print1 -------------");
        System.out.println("size="+size);
        System.out.println("array.length="+array.length);
        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
    }



}
