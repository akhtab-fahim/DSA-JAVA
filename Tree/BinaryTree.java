import java.util.Scanner;

public class BinaryTree {

    public static class Node{
        private final int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value : ");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner,root);


    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to insert left of "+ node.value);
        boolean ansLeft = scanner.nextBoolean();
        if(ansLeft){
            System.out.println("Enter the value of the left of "+node.value);
            int valueLeft = scanner.nextInt();
            node.left = new Node(valueLeft);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert right of "+node.value);
        boolean ansRight = scanner.nextBoolean();
        if(ansRight){
            System.out.println("Enter the value of the right of "+node.value);
            int valueRight = scanner.nextInt();
            node.right = new Node(valueRight);
            populate(scanner,node.right);
        }

    }

    public void display(){
        display(root,"");
    }

    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public BinaryTree(){
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}
