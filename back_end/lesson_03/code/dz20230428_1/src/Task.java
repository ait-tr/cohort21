public class Task {
    private int Number;
    private String description;
    private String status;
    private int daysInProcessing;


    public Task(int number, String description, String status, int daysInProcessing) {
        Number = number;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    @Override
    public String toString() {
        return "Nr.:" + Number + "-" + description + ": " + status + " (" + daysInProcessing + " days)";
    }

    public int getNumber() {
        return Number;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getDaysInProcessing() {
        return daysInProcessing;
    }
}
