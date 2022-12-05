public class Account {
    private String IBAN;
    private Client client;
    private double balance;

    public Account(String IBAN, Client client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Client getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %7.2f", IBAN,client,balance);
    }

    public String secureToString(){
        // "DE1234567890" -> "DE12******90"
        String res="";
        if(IBAN.length()>6) {
            res = IBAN.substring(0, 4)
                    + "*".repeat(IBAN.length() - 6)
                    + IBAN.substring(IBAN.length() - 2);
        } else {
            res=IBAN;
        }
        return String.format("%-20s %-20s %7.2f", res,client,balance);
    }


    public String secureToString2(){
        // "DE1234567890" -> "DE12******90"
        String res="";
        char[] ibanArray= IBAN.toCharArray();
        for (int i = 4; i < ibanArray.length-2; i++) {
            ibanArray[i]='*';
        }
        res= new String(ibanArray);
        return String.format("%-20s %-20s %7.2f", res,client,balance);
    }


    public String secureToString1(){
        // "DE1234567890" -> "DE12******90"
        //IBAN.charAt(1)='j'; // !!! Error

        String res = "";
        for (int i = 0; i < IBAN.length(); i++) {
            if (i < 4 || i >= IBAN.length() - 2) {
                res += IBAN.charAt(i);
            } else {
                res += "*";
            }
        }

        return String.format("%-20s %-20s %7.2f", res,client,balance);
    }

    public void increaseBalance(double value) {
        this.balance += value;
    }

    private  String getSecureIban(){
        String res="";
        if(IBAN.length()>6) {
            res = IBAN.substring(0, 4)
                    + "*".repeat(IBAN.length() - 6)
                    + IBAN.substring(IBAN.length() - 2);
        } else {
            res=IBAN;
        }
        return res;
    }

    public String toStringWithSecureCheck(boolean secure) {
        String res =  secure? getSecureIban():getIBAN();
        return String.format("%-20s %-20s %7.2f", res,client,balance);
    }



}
