public class IndexNotCorrectException extends Exception {
    private int index;
    private int size;

    public IndexNotCorrectException(int index, int size) {
        this.index = index;
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }
}
