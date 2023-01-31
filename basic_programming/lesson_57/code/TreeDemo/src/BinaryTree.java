public class BinaryTree {
    private Node root;


    public Node find(int value){
        return find(value,root);
    }
    private Node find(int value, Node node){
        if(node==null || node.getValue()==value) return node;
        if(value<node.getValue()) {
            return find(value,node.getLeft());
        } else {
            return find(value,node.getRight());
        }
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {
            root = newNode;
        } else {

            Node current = root;
            Node parent = null;
            while (true)
            {
                parent = current;
                if (value == current.getValue()) {   // уже есть
                    return;
                }
                if (value < current.getValue()) {   // на лево?
                    current = current.getLeft();
                    if (current == null) {       //  если конец,
                        parent.setLeft(newNode); //  то вставить слева
                        return;
                    }
                } else { // на направо?
                    current = current.getRight();
                    if (current == null) {          // конец,
                        parent.setRight(newNode);  //то вставить справа
                        return;
                    }
                }
            }
        }
    }



    public void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.println(node);
            print(node.right);
        }
    }

    public void print(){
        print(root);
    }

}