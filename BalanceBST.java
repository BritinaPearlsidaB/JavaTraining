
    import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BalanceBST {
    public static TreeNode convertToBST(TreeNode root) {
        // Step 1: Perform inorder traversal and store nodes in ArrayList
        ArrayList<TreeNode> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);

        // Step 2: Construct balanced BST from ArrayList
        return constructBST(nodes, 0, nodes.size() - 1);
    }

    private static void inorderTraversal(TreeNode root, ArrayList<TreeNode> nodes) {
        if (root == null)
            return;
        inorderTraversal(root.left, nodes);
        nodes.add(root);
        inorderTraversal(root.right, nodes);
    }

    private static TreeNode constructBST(ArrayList<TreeNode> nodes, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = nodes.get(mid);

        // Recursively construct left and right subtrees
        node.left = constructBST(nodes, start, mid - 1);
        node.right = constructBST(nodes, mid + 1, end);

        return node;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        System.out.println("Original Tree (inorder):");
        inorderTraversal(root);
        System.out.println();

        TreeNode balancedBST = convertToBST(root);

        System.out.println("Balanced BST (inorder):");
        inorderTraversal(balancedBST);
    }
}

