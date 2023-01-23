public class Node {
    private Node prev = null;
    private Node next = null;
    private Person value = null;  // String -> Person

    public Node(Node prev, Node next, Person value) {  //
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getValue() {
        return value;
    }  //

    public void setValue(Person value) {
        this.value = value;
    } //
}
