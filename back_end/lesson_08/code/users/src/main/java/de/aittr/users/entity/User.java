package de.aittr.users.entity;

public class User {
    private static int counter=0;
    private int id;
    private String name;
    private String city;

    public User() {
        id=++counter;
    }

    public User(String name, String city) {
        this();
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        if (getId() != user.getId()) return false;
        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        return getCity() != null ? getCity().equals(user.getCity()) : user.getCity() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        return result;
    }
}
