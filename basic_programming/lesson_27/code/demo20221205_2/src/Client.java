public class Client {
    private String outputFormat="%s %s";
    private String firstName;
    private String lastName;

    public Client(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String toString(){
        return String.format(outputFormat, firstName,lastName);
    }

}
