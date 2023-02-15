public class Address {

    private String postcode;
    private String city;
    private String street;
    private int houseNr;

    public Address(String postcode, String city, String street, int houseNr) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }

    @Override
    public String toString() {
        return postcode + " " + city + " " + street + " " + houseNr;
    }
}