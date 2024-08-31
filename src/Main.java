
public class Main {
    public static void main(String[] args) {
        System.out.println("Test if is a Binary Tree: ");

        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(4);
        tree.add(9);

        System.out.println("In-order traversal of the tree: ");
        tree.traverseInOrder(tree.root);
        System.out.println();

        System.out.println("Post-order traversal of the tree: ");
        tree.traversePostOrder(tree.root);
        System.out.println();

        System.out.println("Pre-order traversal of the tree: ");
        tree.traversePreOrder(tree.root);
        System.out.println();


        System.out.println("Check if is BST: " + tree.isBST());


/**
 *
 *      if (tree.isBST()) {
 *             System.out.println("The tree is a binary search tree.");
 *         } else {
 *             System.out.println("The tree is NOT a binary search tree.");
 *         }
 *
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(9);



        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

*/
    }
}