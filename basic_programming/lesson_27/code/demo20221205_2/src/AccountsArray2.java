public class AccountsArray2 {
    /*
    В классе AccountsArray реализовать метод printClientsWithBalanceLessThan, который выводит на экран всех клиентов банка, с балансом менее заданной суммы.
     */
    private Account[] accounts;

    public AccountsArray2(Account[] accounts) {
        this.accounts = accounts;
    }
    public Account[] getAccountsWithBalanceLessThan(double balanceLimit){
        Account[] res= new Account[accounts.length];
        int counter = 0;

        for (int i=0; i<accounts.length; i++){
            if (accounts[i].getBalance()<balanceLimit){
                res[counter++]=accounts[i];
            }
        }
        return res;
    }

    public void print(Account[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null){
                System.out.println(array[i]);
            }
        }
    }

/*
    public Account[] getAccountsWithBalanceLessThan(double balanceLimit){
        int counter = 0;
        for (int i = 0; i < accounts.length ; i++) {
            if (accounts[i].getBalance()<balanceLimit){
                counter++;
            }
        }
        Account[] res= new Account[counter];
        counter=0;
        for (int i=0; i<accounts.length; i++){
            if (accounts[i].getBalance()<balanceLimit){
                res[counter]=accounts[i];
                counter++;
            }
        }
        return res;
    }
*/

    public String toString(){
        String res="";
        for (int i = 0; i < accounts.length ; i++) {
            res+=accounts[i] + "\n";
        }
        return res;
    }

    public String secureToString(){
        String res="";
        for (int i = 0; i < accounts.length ; i++) {
            res+=accounts[i].secureToString() + "\n";
        }
        return res;
    }


    public void increase(){
        for (int i = 0; i < accounts.length;  i++) {
            double balance=accounts[i].getBalance();
            accounts[i].increaseBalance(balance*0.1);
        }
    }

}
