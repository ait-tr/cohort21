public class Transaction {

    private Account debit;
    private Account credit;
    private double amount;

    public Transaction(Account debit, Account credit, double amount) {
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Debit:" + debit + ", Credit:" + credit + " = " + amount;
    }

    public Account getDebit() {
        return debit;
    }

    public Account getCredit() {
        return credit;
    }

    public double getAmount() {
        return amount;
    }
}