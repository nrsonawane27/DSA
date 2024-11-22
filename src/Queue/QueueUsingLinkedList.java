package Queue;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data =  data;
        this.next = null;
    }
}

class QueueLL {
    Node front;
    Node rear;

    QueueLL() {
        front = rear = null;
    }

    //method to add element
    public int enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = rear = newNode;
            return data;
        }

        rear.next = newNode;
        rear = newNode;
        return data;
    }

    //delete from the queue
    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }

        int temp = front.data;
        front = front.next;
        return temp;
    }


    public boolean isEmpty() {
        return front == null;
    }

    public int frontElement() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int rearElement() {
        if(isEmpty()) {
            return -1;
        }

        return rear.data;
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}

public class QueueUsingLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL q = new QueueLL();
        char ch;

        do {

            System.out.println("1.Add data");
            System.out.println("2.Delete data");
            System.out.println("3.Check queue is empty");
            System.out.println("4.Front element");
            System.out.println("5.Rear element");
            System.out.println("6.Print queue");

            System.out.println("\nEnter a choice :");
            int choice = sc.nextInt();

            int temp;
            int data;

            switch(choice) {

                case 1 :
                    System.out.println("Enter the data to add: ");
                    data = sc.nextInt();
                    temp = q.enqueue(data);
                    if(temp != -1) {
                        System.out.println(data+" added in the queue");
                    }
                    break;

                case 2 :
                    data = q.dequeue();
                    if(data != -1) {
                        System.out.println(data+" deleted in the queue");
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;


                case 3 :
                    if(q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;

                case 4 :
                    data = q.frontElement();
                    if(data == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(data+ " is a front element");
                    }
                    break;

                case 5 :
                    data = q.rearElement();
                    if(data == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(data+ " is a rear element");
                    }
                    break;

                case 6 :
                    q.printQueue();
                    break;

                default :
                    System.out.println("Enter the valid choice");

            }

            System.out.print("Do you want to continue : ");
            ch = sc.next().charAt(0);

        } while(ch == 'y');
    }

}
