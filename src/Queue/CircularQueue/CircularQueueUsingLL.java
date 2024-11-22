package Queue.CircularQueue;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueC {
    Node front;
    Node rear;

    QueueC() {
        front = rear = null;
    }

    int countNode() {
        int count = 0;

        Node temp = front;

        do{
            count++;
            temp = temp.next;
        } while(temp != front);

        return count;
    }

    //Method to add element
    public int enqueue(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            front = rear = newNode;
            rear.next = front;
            return front.data;
        }

        rear.next = newNode;
        rear = newNode;
        rear.next = front;

        return rear.data;
    }

//    method to delete node
    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }

        int data = front.data;
        rear.next = front.next;

        front = front.next;
//        rear = front;

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    //method to find front element
    public int frontElement() {
        if(isEmpty()) {
            return -1;
        }

        return front.data;
    }

    //method to find rear element
    public int rearElement() {
        if(isEmpty()) {
            return -1;
        }

        return rear.data;
    }

    public void printQueue() {
        if(isEmpty()) {
            return;
        }

        Node temp = front;
        System.out.println(temp);
        do {
//            System.out.print(temp.data+ " + "+temp.next +" -> ");
            System.out.print(temp.data+"+"+temp.next+ " -> ");

            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

}
public class CircularQueueUsingLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueC q = new QueueC();

        char ch;

        do {

            System.out.println("1.Add data");
            System.out.println("2.Delete data");
            System.out.println("3.Check queue is empty");
            System.out.println("4.Front element");
            System.out.println("5.Rear element");
            System.out.println("6.Count of node");
            System.out.println("7.Print queue");


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
                    System.out.println(q.countNode());;
                    break;

                case 7 :
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
