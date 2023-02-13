public class StringLengthFunction implements StringToIntFunction{
    @Override
    public int transform(String s) {
        return s.length();
    }
}
