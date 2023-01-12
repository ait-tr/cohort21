public class Duck implements Swimable {
    private String name;
    private int swimSpeed;

    public Duck(String name, int swimSpeed) {
        this.name = name;
        this.swimSpeed = swimSpeed;
    }

    public void swim(){
        System.out.println("Утка"+ name + " поплыла со скоротью "+swimSpeed);
    }

}
