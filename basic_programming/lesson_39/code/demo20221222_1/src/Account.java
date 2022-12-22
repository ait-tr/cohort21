public class Account {
    private String IBAN;
    private double balance;
    private Person client;

    public Account(String IBAN, double balance, Person client) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.client = client;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%.2f)", IBAN,client, balance);
    }
}
