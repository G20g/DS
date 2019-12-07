package D.S.BST;

import java.util.Scanner;

public class DictionaryUsingBST {
    Node root;
    class Node{
        String key;
        Node left,right;
        public Node(String key){
            this.key = key;
            left = right = null;
        }
    }
    DictionaryUsingBST(){
        root = null;
    }
    void insert(String key){
        root = insertNode(root,key);
    }
    Node insertNode(Node root,String key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key.compareTo(root.key)<0) {
            root.left = insertNode(root.left, key);
        }
        else if(key.compareTo(root.key)>0){
            root.right = insertNode(root.right,key);
        }
        else{
            System.out.println("{You  Have Entered a Duplicate Node}");
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+ " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
    }
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key+ " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
    }
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+ " ");
        }
    }
    void search(String key){
        searching(root,key);
    }
    public void searching(Node root, String key)
    {
        if (root==null || root.key==key) {
            System.out.println("Word Is Present In The Dictionary");
            return;
        }
        if (key.compareTo(root.key)<0) {
            searching(root.left, key);
        }else {
            searching(root.right, key);
        }
    }

    public static void main(String[] args) {
        DictionaryUsingBST bst = new DictionaryUsingBST();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of Words To Be Inserted");
        int n = s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            bst.insert(s.nextLine());
        }
        System.out.print("Inorder -> {");
        bst.inorder();
        System.out.println("}");
        System.out.print("Preorder -> {");
        bst.preorder();
        System.out.println("}");
        System.out.print("Postorder -> {");
        bst.postorder();
        System.out.println("}");
        System.out.println("Enter Word Too Be Searched");
        bst.search(s.nextLine());
    }

}
