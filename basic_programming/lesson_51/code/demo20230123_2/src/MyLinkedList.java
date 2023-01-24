import java.util.List;
// MyListPerson()
// boolean addFirst(Person str)
// Person remove(int index)
// boolean remove(Person value)




public class MyLinkedList {
     Node first=null;
     Node last=null;
    private int size=0;

    public boolean addFirst(Person value){
        Node newNode = new Node(null, null,value);
        if(first ==null){
            last = newNode;
        } else {
            first.setPrev(newNode);
            newNode.setNext(first);
        }
        first = newNode;
        size++;
        return true;
    }

    public boolean add(Person value){   //
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

    /*
    public Person[] toArray(){   //
        Person[] res= new Person[size]; //
        int index=0;
        Node temp= first;
        while (temp!=null){
            res[index++] = temp.getValue();
            temp=temp.getNext();
        }
        return res;
    }


     */
    private Node find(Person person){
        Node res=first;
        while (res!=null){
            Person temp= res.getValue();
            if(person==null && temp==null) return res;
            if(person.equals(temp)) return res;
            res=res.getNext();
        }
        return null;
    }


    private Node find(int index){
        if (index<0 || index>= size ) throw new IllegalArgumentException();

        int counter=0;
        Node res = first;
        while (counter<index){
            res=res.getNext();
            counter++;
        }
        return res;
    }


    private Person remove(Node node){
        if(node==null && first==null) return null;
        Node prev= node.getPrev();
        Node next= node.getNext();

        Person res = node.getValue();
        if(prev!=null) prev.setNext(node.getNext()); else first=node.getNext();
        if(next!=null) next.setPrev(node.getPrev()); else last= node.getPrev();
        node.setPrev(null);
        node.setNext(null);
        node.setValue(null);
        size--;
        return res;
    }


    public boolean remove(Person person){
        Node node=find(person);
        if(node!=null){
            remove(node);
            return true;
        } else {
            return false;
        }
    }
    public Person remove(int index){
        Node node=find(index);
        if (node!=null){
            return remove(node);
        } else {
            return null;
        }
    }

    public Person get(int index){
        if(index<0 || index>=size) return null;
        int counter=0;
        Node temp=first;
        while(counter<index){
            temp=temp.getNext();
            counter++;
        }
        return temp.getValue();
    }



}
