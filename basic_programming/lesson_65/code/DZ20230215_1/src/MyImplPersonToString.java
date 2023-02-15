public class MyImplPersonToString implements PersonToStringFunction  {
    private String str1;
    private String str2;

    public MyImplPersonToString(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String processing(Person person) {
        return str1 +person.toString()+str2;
    }
}
