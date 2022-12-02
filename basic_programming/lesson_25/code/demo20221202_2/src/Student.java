public class Student {
    private int id;
    private String name;
    private MyDate birthday;
    private MyDate examDate;

    public Student(int id, String name, MyDate birthday){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
    }

    public Student(int id, String name, MyDate birthday, MyDate examDate){
        this(id,name,birthday);
        this.examDate=examDate;
    }

    public String toString(){
        return id + ". " + name + "(" + birthday +")" + " Exam date: " + examDate;
    }

    public MyDate getBirthday(){
        return birthday;
    }
    public void setExamDate(MyDate examDate){
        this.examDate=examDate;
    }

    public void changeDayInBirthdayDate(int day){
        birthday.setDay(day);
    }

}
