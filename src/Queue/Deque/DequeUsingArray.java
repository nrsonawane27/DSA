//Deque implementation using array
package Queue.Deque;

import java.util.Scanner;

class QueueCA {
    int queueArr[];
    int front;
    int rear;
    int maxsize;

    QueueCA(int size) {
        this.queueArr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.maxsize = size;
    }

    //method to add element
    public int pushBack(int data) {
        if(isFull()) {
            return -1;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front != 0 && rear == maxsize-1) {
            rear = 0;
        } else {
            rear++;
        }

        queueArr[rear] = data;
        return data;
    }

    public int pushFront(int data) {
        if(isFull()) {
            return -1;
        }

        if (front == -1) {
            front = rear = 0;
//        } else if (front != 0 && rear == maxsize-1) {
//            front--;
        } else if (front == 0){
           front = maxsize-1;
        } else {
            front--;
        }

        queueArr[front] = data;
        return data;
    }

    public int deleteFirst() {
        if(isEmpty()) {
            return -1;
        }

        int ret = queueArr[front];

        if(front == rear) {
            front = rear = -1;
        }else if(front == maxsize-1) {
            front = 0;
        } else {
            front++;
        }

        return ret;
    }

    public int deleteLast() {
        if(isEmpty()) {
            return -1;
        }

        int ret = queueArr[rear];

        if(front == rear) {
            front = rear = -1;
        }else if( rear == maxsize-1) {
            rear = 0;
        } else if(rear == 0){
            rear = maxsize-1;
        } else {
            rear--;
        }

        return ret;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == maxsize - 1) || ((rear + 1) % maxsize == front);
    }

    public int frontElement() {
        return queueArr[front];
    }

    public int rearElement() {
        return queueArr[rear];
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if(front <= rear) {
            System.out.println("First");
            for(int i = front; i <= rear; i++) {
                System.out.print(queueArr[i] +" ");
            }
        } else {
            System.out.println("second");
            for(int i = front; i <= maxsize-1; i++) {
                System.out.print(queueArr[i] +" ");
            }

            for(int i = 0; i <= rear; i++) {
                System.out.print(queueArr[i] +" ");
            }
        }
    }
}
public class DequeUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue: ");
        int size = sc.nextInt();

        QueueCA q = new QueueCA(size);

        char ch;

        do {

            System.out.println("1.Add last");
            System.out.println("2.Add first");
            System.out.println("3.Delete first");
            System.out.println("4.Delete last");
            System.out.println("5.Check queue is empty");
            System.out.println("6.Check queue is full");
            System.out.println("7.Front element");
            System.out.println("8.Rear element");
            System.out.println("9.Print queue");

            System.out.println("\nEnter a choice :");
            int choice = sc.nextInt();

            int temp;
            int data;

            switch(choice) {

                case 1 :
                    System.out.println("Enter the data to add: ");
                    data = sc.nextInt();
                    temp = q.pushBack(data);
                    if(temp == -1) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println(data+" added in the queue");
                    }
                    break;

                case 2 :
                    System.out.println("Enter the data to add: ");
                    data = sc.nextInt();
                    temp = q.pushFront(data);
                    if(temp == -1) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println(data+" added in the queue");
                    }
                    break;

                case 3 :
                    temp = q.deleteFirst();
                    if(temp != -1) {
                        System.out.println(temp+" deleted in the queue");
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 4 :
                    temp = q.deleteLast();
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
                    if(q.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
                    }
                    break;

                case 7 :
                    temp = q.frontElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a front element");
                    }
                    break;

                case 8 :
                    temp = q.rearElement();
                    if(temp == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println(temp+ " is a rear element");
                    }
                    break;

                case 9 :
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
