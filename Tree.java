// class Node {
//     int val;
//     Node left;
//     Node right;

//     public Node(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTree {
//     Node root;

//     public BinaryTree() {
//         this.root = null;
//     }

//     public void inorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.val + " ");
//         inorder(root.right);
//     }

//     public void preorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         System.out.print(root.val + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public void postorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.val + " ");
//     }

// }


//------------------------------------------------------------------------------------------------------------------------------------------------
class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree{
    Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    void insert(int val){
        root = insertRec(root, val);
    }

    Node insertRec(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insertRec(root.left, val);
        }
        else{
            root.right = insertRec(root.right, val);
        }
        return root;
    }


    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root == null){
            return;
        }
        inorderRec(root.left);
        System.out.print(root.val + " ");
        inorderRec(root.right);
    }

    Node search(int val){
        return searchRec(root, val);
    }

    Node searchRec(Node root, int val){
        if(root == null || root.val == val){
            return root;
        }

        if(val > root.val){
            return searchRec(root.left, val);
        }
        return searchRec(root.right, val);
    }


}


public class Tree {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        // tree.root = new Node(1);
        // tree.root.left = new Node(2);
        // tree.root.right = new Node(3);
        // tree.root.left.left = new Node(4);
        // tree.root.left.right = new Node(5);
        // tree.root.right.left = new Node(6);
        // tree.root.right.right = new Node(7);
        // tree.inorder(tree.root);
        // System.out.println();
        // tree.preorder(tree.root);
        // System.out.println();
        // tree.postorder(tree.root);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.inorder();
        System.out.println();
        System.out.println(bst.search(20));
        System.out.println(bst.search(10));
    }
}
