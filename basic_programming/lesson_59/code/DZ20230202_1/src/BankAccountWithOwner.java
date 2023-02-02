public class BankAccountWithOwner {
    private String iban;
    private Person owner;

    public BankAccountWithOwner(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return iban + "" + owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccountWithOwner)) return false;

        BankAccountWithOwner that = (BankAccountWithOwner) o;

        if (getIban() != null ? !getIban().equals(that.getIban()) : that.getIban() != null) return false;
        return getOwner() != null ? getOwner().equals(that.getOwner()) : that.getOwner() == null;
    }

    @Override
    public int hashCode() {
        int result = getIban() != null ? getIban().hashCode() : 0;
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        return result;
    }
}
