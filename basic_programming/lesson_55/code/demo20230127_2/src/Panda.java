public class Panda {
    private String name;
    private boolean notBaby;

    public Panda(String name, boolean notBaby) {
        this.name = name;
        this.notBaby = notBaby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Panda panda = (Panda) o;

        if (notBaby != panda.notBaby) return false;
        return name.equals(panda.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (notBaby ? 1 : 0);
        return result;
    }
}
