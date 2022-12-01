public class Person {
    private String firstName;
    private String lastName;
    private int age;


    // "Иван Иванов", 19
    /*
    public Person(String name, int age){

        this.age=age;

        String[] nameSplit=name.split(" ");
        this.firstName = nameSplit[0];
        this.lastName = nameSplit[1];
    }

     */

    //"Иван Иванов"
    public Person(String name, int age){

        this.age=age;
        int index=name.indexOf(" ");

        this.firstName= name.substring(0,index);
        this.lastName= name.substring(index+1);



    }

    public int getAge(){
        if (checkRights()) {
            return age;
        } else {
            return -1;
        }
    }
    boolean checkRights(){
        return true;
    }

    public void setAge(int age){
        this.age=age;
    }



    // " first name is %  last name is %  ( % )"
    public String toString(){
        return String.format("%s %s (%d)", firstName,lastName,age);
    }


}
