package DataStructures;

public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data = node.data;

        if (root == null){
            root = node;
            return root;
        }
        else if (data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root,data);
    }
    private boolean searchHelper(Node root, int data){
        if (root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (data < root.data) {
            return searchHelper(root.left,data);
        }
        else {
            return searchHelper(root.right,data);
        }
    }
    public void remove(int data){
        if (search(data)){
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " Could Not Be Found");
        }
    }
    private Node removeHelper(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node.left = removeHelper(node.left, data);
        } else if (data > node.data) {
            node.right = removeHelper(node.right, data);
        } else { // Node found
            if (node.left == null && node.right == null) { // Case 1: No children
                return null;
            } else if (node.right != null) { // Case 2: Replace with successor
                node.data = successor(node);
                node.right = removeHelper(node.right, node.data);
            } else { // Case 3: Replace with predecessor
                node.data = predecessor(node);
                node.left = removeHelper(node.left, node.data);
            }
        }
        return node;
    }

    private int successor(Node root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

}
