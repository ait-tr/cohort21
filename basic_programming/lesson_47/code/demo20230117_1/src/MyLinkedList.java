public class MyLinkedList {
    private Node first=null;
    private Node last=null;
    int size=0;


    public boolean add(String value){
        Node newNode = new Node(null, null,value);
        if(first==null){
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size++;

        return true;
    }

    



}
