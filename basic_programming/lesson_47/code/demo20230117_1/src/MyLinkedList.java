import java.util.List;
// MyListPerson()
// boolean addFirst(Person str)
// Person remove(int index)
// boolean remove(Person value)




public class MyLinkedList {
    private Node first=null;
    private Node last=null;
    private int size=0;


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

    public String  toString(){
        String rez="";
        Node temp= first;
        while (temp!=null){
            rez+=temp.getValue()+"\n";
            temp = temp.getNext();
        }
        return rez;
    }

    public int size(){
        return size;
    }
    public String[] toArray(){
        String[] res= new String[size];
        int index=0;
        Node temp= first;
        while (temp!=null){
            res[index++] = temp.getValue();
            temp=temp.getNext();
        }
        return res;
    }

    public String get(int index){
        if(index<0 || index>=size) return null;
        return toArray()[index];
    }



}
