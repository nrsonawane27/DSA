package Tree.BinaryTree;

import java.util.Scanner;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
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

    void print(Node root, String prefix, boolean isLeft) {
        if(root == null) {
            return;
        }

        System.out.println(prefix +(isLeft ? "├── " : "└── ") + root.data);
        print(root.left, prefix + (isLeft ? "│   " : "    "), true);
        print(root.right,  prefix + (isLeft ? "│   " : "    "), false);
    }
}


public class BinaryTreeImplementation {

    public static void main(String []args) {
        Node root = null;

        BinaryTree bt = new BinaryTree();
        root = bt.constructBt();
        bt.print(root,  "", false);
    }
}
