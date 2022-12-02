public class Student {
    private int id;
    private String name;
    private MyDate birthday;

    public Student(int id, String name, MyDate birthday){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
    }

    public String toString(){
        return id + ". " + name + "(" + birthday +")";
    }

    public MyDate getBirthday(){
        return birthday;
    }
}
