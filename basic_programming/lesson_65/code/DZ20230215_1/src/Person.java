public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;

    public Person(String firstName, String lastName, String email, String phone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddressAsString() {
        return address.toString();
    }

    @Override
    public String toString() {
        return this.getFullName() +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address;
    }
}