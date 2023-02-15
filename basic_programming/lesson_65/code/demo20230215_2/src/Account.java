public class Account {

    private String iban;
    private Person person;

    public Account(String iban, Person person) {
        this.iban = iban;
        this.person = person;
    }

    @Override
    public String toString() {
        return iban + " " + person;
    }

    public String getIban() {
        return iban;
    }

    public Person getPerson() {
        return person;
    }
}
