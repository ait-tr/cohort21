public class AccountsArray {
    private Account[] accounts;

    public AccountsArray(Account[] accounts) {
        this.accounts = accounts;
    }

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
