//Deque using circular linked list

package Queue.Deque;

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
    public int enqueueLast(int data) {
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

    //dequeue operation
    public int enqueueFirst(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            front = rear = newNode;
            rear.next = front;
            return front.data;
        }

        newNode.next = front;
        front = newNode;
        rear.next = front;

        return front.data;
    }


    //    method to delete node
    public int dequeueFirst() {
        if(isEmpty()) {
            return -1;
        }

        int data = front.data;
        if(front == rear) {
            front = rear = null;
            return data;
        }

        rear.next = front.next;

        front = front.next;
//        rear = front;

        return data;
    }

    // method to delete node
    public int dequeueLast() {
        if(isEmpty()) {
            return -1;
        }

        int data = rear.data;
        if(front == rear) {
            front = rear = null;
            return data;
        }

        Node temp = front;
        while (temp.next != rear) {
            temp = temp.next;
        }

        temp.next = front; // Maintain circular linkage
        rear = temp;

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
        do {
//            System.out.print(temp.data+ " + "+temp.next +" -> ");
            System.out.print(temp.data+" -> ");

            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

}

public class DequeUsingCL {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue: ");
        int size = sc.nextInt();

        QueueC q = new QueueC();

        char ch;

        do {

            System.out.println("1.Add last");
            System.out.println("2.Add first");
            System.out.println("3.Delete first");
            System.out.println("4.Delete last");
            System.out.println("5.Check queue is empty");
            System.out.println("6.Front element");
            System.out.println("7.Rear element");
            System.out.println("8.Print queue");

            System.out.println("\nEnter a choice :");
            int choice = sc.nextInt();

            int temp;
            int data;

            switch(choice) {

                case 1 :
                    System.out.println("Enter the data to add: ");
                    data = sc.nextInt();
                    temp = q.enqueueLast(data);
                    if(temp == -1) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println(data+" added in the queue");
                    }
                    break;

                case 2 :
                    System.out.println("Enter the data to add: ");
                    data = sc.nextInt();
                    temp = q.enqueueFirst(data);
                    if(temp == -1) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println(data+" added in the queue");
                    }
                    break;

                case 3 :
                    temp = q.dequeueFirst();
                    if(temp != -1) {
                        System.out.println(temp+" deleted in the queue");
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 4 :
                    temp = q.dequeueLast();
                    if(temp != -1) {
                        System.out.println(temp+" deleted in the queue");
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;


                case 5 :
                    if(q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;

                case 6 :
                    temp = q.frontElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a front element");
                    }
                    break;

                case 7 :
                    temp = q.rearElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a rear element");
                    }
                    break;

                case 8 :
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
