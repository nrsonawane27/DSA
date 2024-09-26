package LinkedList.Concept.CircularLL;

import java.util.Scanner;

public class SinglyCircularLL {

    public class Node {
        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    //count total node
    int countNode() {
        int count = 0;

        Node temp = head;

        do{
            count++;
            temp = temp.next;
        } while(temp != head);

        return count;
    }

    //add first
    void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    //add last
    void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    //add at any position
    void addAtPos(int pos, int data) {
        if(pos <= 0 || pos > countNode()+1) {
            System.out.println("Invalid Position");
            return;
        }

        if(pos == 1) {
            addFirst(data);
            return;
        } else if(pos == countNode()+1) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        Node temp = head;
        while(pos-2 != 0) {
            temp = temp.next;
            pos--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //delete firat node
    void deleteFirst() {
        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }

        if(countNode() == 1) {
            head = null;
            tail.next = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    //delete last node
    void deleteLast() {
        if(head == null) {
            System.out.println("Linked List is empty");;
            return;
        }

        if(countNode() == 1) {
            head = null;
            tail.next = null;
            return;
        }

        Node temp = head;
        while(temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
    }

    //delete node at any position
    void deleteAtPos(int pos) {
        if(pos <= 0 || pos >= countNode()+1) {
            System.out.println("Invalid Position");
            return;
        }

        if(pos == 1) {
            deleteFirst();
            return;
        } else if(pos == countNode()+1) {
            deleteLast();
            return;
        }

        if(head == null) {
            System.out.println("Linked list empty");
            return;
        }

        Node temp = head;
        while(pos-2 != 0) {
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;
    }

    //Search node
    int searchNode(int data) {
        if(head == null) {
            System.out.println("Linked list empty");
            return -1;
        }

        int pos = -1;
        int count = 0;
        Node temp = head;

        do{
            count++;
            if(temp.data == data) {
                pos = count;
                return pos;
            }
            temp = temp.next;
        } while(temp != head);

        return pos;
    }

    //Reverse the linked list
    void reversell() {
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node prev = null;
        Node curr = head;
        Node temp = head.next;

        do {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = curr.next;
        } while(curr != head);
        curr.next = prev;
        head = prev;
    }

    //print the linked list
    void print() {
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        do {
//            System.out.print(temp.data+ " + "+temp.next +" -> ");
            System.out.print(temp.data+ " -> ");

            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyCircularLL ll = new SinglyCircularLL();

        char con = 'y';

        do {

            System.out.println("Perform operations on linked list");
            System.out.println("1.Add node at first");
            System.out.println("2.Add node at last");
            System.out.println("3.Add node at any position");
            System.out.println("4.Delete node from first");
            System.out.println("5.Delete node from last");
            System.out.println("6.Delete node from any position");
            System.out.println("7.Search node");
            System.out.println("8.Reverse linked list");
            System.out.println("9.Count node");
            System.out.println("10.Print Linked List");

            System.out.print("\nEnter choice to perfrom operation : ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1 :
                    System.out.print("Enter data : ");
                    int data = sc.nextInt();
                    ll.addFirst(data);
                    break;

                case 2 :
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;

                case 3 :
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    System.out.print("Enter position : ");
                    int pos = sc.nextInt();
                    ll.addAtPos(pos,data);
                    break;

                case 4 :
                    ll.deleteFirst();
                    break;

                case 5 :
                    ll.deleteLast();
                    break;

                case 6 :
                    System.out.print("Enter position : ");
                    pos = sc.nextInt();
                    ll.deleteAtPos(pos);
                    break;

                case 7 :
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    pos = ll.searchNode(data);
                    if(pos == -1) {
                        System.out.println("Node not found");
                    } else {
                        System.out.println("Node is found at : " +pos);
                    }
                    break;

                case 8 :
                    ll.reversell();
                    ll.print();
                    break;

                case 9 :
                    int count = ll.countNode();
                    System.out.println("Total number of node : " +count);
                    break;

                case 10 :
                    ll.print();
                    break;

                default :
                    System.out.println("Enter the valid choice");
            }

            System.out.print("Do you want to continue ? : ");
            con = sc.next().charAt(0);

        } while(con == 'Y' || con == 'y');
    }
}
