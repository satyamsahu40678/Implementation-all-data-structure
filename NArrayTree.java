import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    private int val;
    private List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public int getVal() {
        return val;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}

public class NArrayTree {
    public static TreeNode createTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the root node: ");
        int rootVal = scanner.nextInt();
        TreeNode root = new TreeNode(rootVal);
        
        System.out.print("Enter the number of children for the root node: ");
        int numChildren = scanner.nextInt();
        for (int i = 0; i < numChildren; i++) {
            addChildren(root, scanner);
        }
        return root;
    }

    public static void addChildren(TreeNode node, Scanner scanner) {
        System.out.print("Enter the value of the node: ");
        int nodeVal = scanner.nextInt();
        TreeNode newNode = new TreeNode(nodeVal);
        node.addChild(newNode);
        
        System.out.print("Enter the number of children for this node: ");
        int numChildren = scanner.nextInt();
        for (int i = 0; i < numChildren; i++) {
            addChildren(newNode, scanner);
        }
    }

    public static void bfsTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getVal() + " ");

            for (int i = 0; i < node.getChildren().size(); i++) {
                queue.add(node.getChildren().get(i));
            }
        }
    }
    

    public helper(Map<TreeNode, Double> map, int prob, TreeNode root){
        Queue<Pair<TreeNode, Double>> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            prob = temp.getVal();
            map.put(temp, prob);

            int size = temp.getChildren().size();
            for(int i = 0; i < size; i++){
                q.offer(new Pair(temp.getChildren().get(i), size * prob));
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println("BFS Traversal of the tree:");
        bfsTraversal(root);
    }
}