//Queue implementation using array

package Queue;

import java.util.Scanner;

public class QueueUsingArray {
    public static void main(String []args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        char ch;

        do {

            System.out.println("1.Add data");
            System.out.println("2.Delete data");
            System.out.println("3.Check queue is empty");
            System.out.println("4.Check queue is full");
            System.out.println("5.Front element");
            System.out.println("6.Rear element");
            System.out.println("7.Print queue");

            System.out.println("\nEnter a choice :");
            int choice = sc.nextInt();

            int temp;

            switch(choice) {

                case 1 :
                    System.out.println("Enter the data to add: ");
                    int data = sc.nextInt();
                    temp = q.enqueue(data);
                    if(temp != -1) {
                        System.out.println(data+" added in the queue");
                    } else {
                        System.out.println("Queue is full");
                    }
                    break;

                case 2 :
                    temp = q.dequeue();
                    if(temp != -1) {
                        System.out.println(temp+" deleted in the queue");
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
                    if(q.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
                    }
                    break;

                case 5 :
                    temp = q.frontElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a front element");
                    }
                    break;

                case 6 :
                    temp = q.rearElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a rear element");
                    }
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

class Queue {
    int QueueArr[];
    int front;
    int rear;
    int maxsize;

    Queue(int size) {
        this.QueueArr = new int[size];
        this.maxsize = size;
        this.front = -1;
        this.rear = -1;
    }

    //method to add element in the queue
    public int enqueue(int data) {
        if(rear == maxsize-1) {
            return -1;
        }

        if(front == -1) {
            front = rear = 0;
            QueueArr[front] = data;
            return data;
        }

        rear++;
        QueueArr[rear] = data;
        return data;
    }

    //method to delete element from the queue
    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }

        int data = QueueArr[front];

        if(front == rear) {
            front = rear = -1;
            return data;
        }

        front++;
        return data;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == maxsize-1;
    }

    public int frontElement() {
        if(isEmpty()) {
            return -1;
        }

        return QueueArr[front];
    }

    public int rearElement() {
        if(isEmpty()) {
            return -1;
        }

        return QueueArr[rear];
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("[ ");
        for(int i = front; i <= rear; i++) {
            System.out.print(QueueArr[i] +" ");
        }
        System.out.print(" ]");
    }
}
