package Stack.Concept;

import java.util.Scanner;

public class StackUsingLinkedList {

    public static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head;

        Stack() {
            this.head = null;
        }

        int size = 0;

        boolean isEmpty() {
            if(head == null) {
                return true;
            }

            return false;
        }

        int push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                size++;
                return head.data;
            }
            newNode.next = head;
            head = newNode;
            size++;

            return head.data;
        }

        int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            size--;

            return top;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }

        int size() {
            return size;
        }

        void reverse() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            Node previous = null;
            Node current = head;
            Node temp;

            while(current != null){
                temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            head = previous;
        }


        void print() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = head;

            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        char con = 'y';

        do {

            System.out.println("Perform operations on Stack");
            System.out.println("1.Push element");
            System.out.println("2.Pop element");
            System.out.println("3.Check stack is empty or not");
            System.out.println("4.Peek element");
            System.out.println("5.Size of stack");
            System.out.println("6.Sort Stack");
            System.out.println("7.Reverse Stack");
            System.out.println("8.Print Stack");

            System.out.print("\nEnter choice to perfrom operation : ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1 :
                    System.out.print("Enter data : ");
                    int element = sc.nextInt();
                    s.push(element);
                    break;

                case 2 :
                    s.pop();
                    break;

                case 3 :
                    if(s.isEmpty()) {
                        System.out.println("Stack is epmty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;

                case 4 :
                    System.out.println(s.peek());
                    break;

                case 5 :
                    if(s.size() == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Size of stack is : "+s.size());
                    }
                    break;

                case 6 :
//                    s.sort();
                    break;

                case 7 :
                    s.reverse();
                    break;

                case 8 :
                    s.print();
                    break;

                default :
                    System.out.println("Enter the valid choice");
            }

            System.out.print("Do you want to continue ? : ");
            con = sc.next().charAt(0);

        } while(con == 'Y' || con == 'y');
    }
}
