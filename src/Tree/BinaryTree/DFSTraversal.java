package Tree.BinaryTree;

import java.util.Scanner;

//class Node {
//    int data;
//    Node right;
//    Node left;
//
//    Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}

class BinaryTrees {
    Scanner sc = new Scanner(System.in);

    public Node constructBt() {
        System.out.println("Enter data : ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        //for left tree
        System.out.println("Do you want to add node to the left of "+newNode.data);
        char leftNode = sc.next().charAt(0);

        if(leftNode == 'Y' || leftNode == 'y') {
            newNode.left = constructBt();
        }

        //for right tree
        System.out.println("Do you want to add node to the right of "+newNode.data);
        char rightNode = sc.next().charAt(0);

        if(rightNode == 'Y' || rightNode == 'y') {
            newNode.right = constructBt();
        }

        return newNode;
    }

    void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    void print(Node root, String prefix, boolean isLeft) {
        if(root == null) {
            return;
        }

        System.out.println(prefix +(isLeft ? "├── " : "└── ") + root.data);
        print(root.left, prefix + (isLeft ? "│   " : "    "), true);
        print(root.right,  prefix + (isLeft ? "│   " : "    "), false);
    }
}
public class DFSTraversal {

    public static void main(String []args) {
        Node root = null;

        BinaryTrees bt = new BinaryTrees();
        root = bt.constructBt();
        bt.print(root,  "", false);

        System.out.println("\n\nIn order traversal");
        bt.inOrder(root);

        System.out.println("\n\nPre order traversal");
        bt.preOrder(root);

        System.out.println("\n\nPost order traversal");
        bt.postOrder(root);
    }
}
