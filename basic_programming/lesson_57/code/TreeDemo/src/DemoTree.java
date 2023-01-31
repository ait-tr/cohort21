public class DemoTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(1);
        tree.add(2);
        tree.add(19);
        tree.add(5);
        tree.add(-1);

        System.out.println("find: "+tree.find(1));

        //tree.insert(6);
        //tree.insert(4);
        //tree.insert(-8);



        tree.print();


    }
}

