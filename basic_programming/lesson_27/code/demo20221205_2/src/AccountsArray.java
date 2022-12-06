public class AccountsArray {
    /*
    В классе AccountsArray реализовать метод printClientsWithBalanceLessThan, который выводит на экран всех клиентов банка, с балансом менее заданной суммы.
     */
    private Account[] accounts;
    private int size;

    public AccountsArray(Account[] accounts) {
        this.accounts = accounts;
        for (size = 0; size < accounts.length && accounts[size]!=null ; size++);


    }
    public AccountsArray getAccountsWithBalanceLessThan(double balanceLimit){

        Account[] res= new Account[accounts.length];
        int counter = 0;

        for (int i=0; i<size; i++){
            if (accounts[i].getBalance()<balanceLimit){
                res[counter++]=accounts[i];
            }
        }
        AccountsArray resAccountArray= new AccountsArray(res);
        return resAccountArray;
    }


    public String toString(){
        String res="";
        for (int i = 0; i < size; i++) {
            res+=accounts[i] + "\n";
        }
        return res;
    }

    public String secureToString(){
        String res="";
        for (int i = 0; i < size ; i++) {
            res+=accounts[i].secureToString() + "\n";
        }
        return res;
    }


    public void increase(){
        for (int i = 0; i < size;  i++) {
            double balance=accounts[i].getBalance();
            accounts[i].increaseBalance(balance*0.1);
        }
    }

}
