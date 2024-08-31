public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public BinaryTree(){
        root = null;
    }

    private Node addRecursive(Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if (data<current.data){
            current.left = addRecursive(current.left,data);
        }else if(data>current.data){
            current.right = addRecursive(current.right,data);
        }
        return current;
    }

    public void add(int data){
        root = addRecursive(root,data);
    }


    private void traverseInOrderRecursive(Node node){
        if(node != null){
            traverseInOrderRecursive(node.left);
            System.out.print(" " + node.data);
            traverseInOrderRecursive(node.right);
        }
    }

    public void traverseInOrder(Node node){
        traverseInOrderRecursive(root);
    }

    private void traversePostOrderRecursive(Node node){
        if(node != null){
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void traversePostOrder(Node node){
        traversePostOrderRecursive(root);
    }


    private void traversePreOrderRecursive(Node node){
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");

        traversePreOrderRecursive(node.left);
        traversePreOrderRecursive(node.right);

    }

    public void traversePreOrder(Node node){
        traversePreOrderRecursive(root);
    }


    // Check if it is BST
    public boolean isBST() {
        return isBSTRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBSTRecursive(Node node, int min, int max){
        // An empty tree is a BST
        if (node == null) {
            return true;
        }

        //Check if the current node's value is within the allowed range
        if(node.data <= min || node.data >=max){
            return false;
        }

        //Recursively check the left and right subtrees
        return isBSTRecursive(node.left, min, node.data)&&
                isBSTRecursive(node.right, node.data, max);
    }


    /*
    public boolean contains(int data){
        return containsRecursive(root,data);
    }

    private boolean containsRecursive(Node current,int data){
        if(current == null){
            return false;
        }

        if (data == current.data){
            return true;
        }

        return data < current.data
                ?containsRecursive(current.left, data)
                :containsRecursive(current.right,data);
    }





*/



}


