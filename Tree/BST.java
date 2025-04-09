public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;


        public Node(int val){
            this.value = val;
        }
        public int getValue(){
            return value;
        }

    }
    private Node root;

    public BST(){}

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void display(){
        display(root,"Root Node : ");
    }

    private void display(Node node,String details){
        if(node == null){ return;}
        System.out.println(details + node.getValue());
        display(node.left, "Left Child Of "+node.getValue());
        display(node.right, "Right Child Of "+node.getValue());
    }


    public void insert(int value){
        root = insert(root,value);

    }

    private Node insert(Node node,int value){
        if(node == null ){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }
        if(value>node.value){
            node.right = insert(node.right, value);
        }

        return node;
    }


}
 