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

}
