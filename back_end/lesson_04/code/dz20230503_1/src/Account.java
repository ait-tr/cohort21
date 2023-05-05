public class Account {
    private Person person;
    private String iban;
    private double balance;

    public Account(Person person, String iban, double balance) {
        this.person = person;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }
}