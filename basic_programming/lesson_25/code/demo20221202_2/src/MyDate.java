public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return addLeadZero(day) + "-"+addLeadZero(month)+"-"+year;
    }

    private String addLeadZero(int num){
        return (num<10?"0": "")+num;
    }

    public void setDay(int day){
        this.day=day;
    }


}
