package LinkedList.Concept;

import java.util.Scanner;

public class DoublyLinkedList {

    public class Node {
        Node prev = null;
        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    //count total node
    int countNode() {
        int count = 0;

        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    //add first
    void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
//
//        System.out.println(head.data);
//        System.out.println(head.next);
//        System.out.println(head.prev);
//        System.out.println(head);

    }

    //add last
    void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
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
            return;
        }

        Node temp = head;
        while(pos-2 != 0) {
            temp = temp.next;
            pos--;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    //delete firat node
    void deleteFirst() {
        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }

        if(countNode() == 1) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

    //delete last node
    void deleteLast() {
        if(head == null) {
            System.out.println("Linked List is empty");;
            return;
        }

        if(countNode() == 1) {
            head = null;
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
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
        temp.next.prev = temp;
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
        while(temp != null) {
            count++;
            if(temp.data == data) {
                pos = count;
                return pos;
            }
            temp = temp.next;
        }
        return -1;
    }

    //Reverse the linked list
    void reversell() {
        Node previous = null;
        Node current = head;
        Node temp = head.next;

        while(temp != null){


            current.next = previous;
//            if(temp == null) {
//                head = current;
//                return;
//            }
            previous = current;
            current = temp;
            temp = current.next;
            current.prev = temp;
        }
        current.next = previous;
        current.prev = temp;
        head = current;

    }

    //print the linked list
    void print() {
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;

        }

        System.out.println("null");
        System.out.println(head.prev);
        System.out.println(head.next);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoublyLinkedList ll = new DoublyLinkedList();

        char con = 'y';

        do {

            System.out.println("Perform operations on linked list\n" +
                    "1.Add node at first\n" +
                    "2.Add node at last\n" +
                    "3.Add node at any position\n" +
                    "4.Delete node from first\n" +
                    "5.Delete node from last\n" +
                    "6.Delete node from any position\n" +
                    "7.Search node\n" +
                    "8.Reverse linked list\n" +
                    "9.Count node\n" +
                    "10.Print Linked List");

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
