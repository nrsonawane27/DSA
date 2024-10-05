package Stack.Concept;

import LinkedList.Concept.LinkedList;

import java.util.Scanner;

public class StackUsingArray {

    public static class Stack {
        int maxSize;
        int stackArr[];
        int top = -1;

        Stack(int size) {
            this.stackArr = new int[size];
            this.maxSize = size;
        }

        int push(int element) {
            if(top == maxSize-1) {
                System.out.println("Stack is overflow");
                return -1;
            }

            stackArr[++top] = element;
            return stackArr[top];
        }

        boolean isEmpty() {
            if(top == -1) {
                return true;
            }

            return false;
        }

        boolean isFull() {
            if(top == maxSize-1) {
                return true;
            }

            return false;
        }

        int pop() {
            if(isEmpty()) {
                return top;
            }

            int element = stackArr[top];
            top--;

            return element;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return stackArr[top];
        }

        int size() {
            if(isEmpty()) {
                return top;
            }

            return top+1;
        }

        void reverse() {
            if(isEmpty()) {
                System.out.println("Stack is epmty");
                return;
            }

            int t = top;
            for(int i = 0; i <= top / 2; i++) {
                int temp = stackArr[i];
                stackArr[i] = stackArr[t];
                stackArr[t] = temp;
                t--;
            }

        }

        void sort() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            int t = top;
            boolean swap = false;
            for(int i = 0; i <= top; i++) {
                for(int j = 0; j < t-1-i; j++) {
                    if(stackArr[i] > stackArr[j]) {
                        int temp = stackArr[i];
                        stackArr[i] = stackArr[j];
                        stackArr[j] = temp;
                        swap = true;
                    }
                }

                if(swap == false) {
                    return;
                }
            }

        }

        void print() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("[ ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stackArr[i]+" ");
            }
            System.out.println(" ]");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack(5);

        char con = 'y';

        do {

            System.out.println("Perform operations on Stack");
            System.out.println("1.Push element");
            System.out.println("2.Pop element");
            System.out.println("3.Check stack is empty or not");
            System.out.println("4.Check stack is full or not");
            System.out.println("5.Peek element");
            System.out.println("6.Size of stack");
            System.out.println("7.Sort Stack");
            System.out.println("8.Reverse Stack");
            System.out.println("9.Print Stack");

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
                    if(s.isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;

                case 5 :
                    System.out.println(s.peek());
                    break;

                case 6 :
                    if(s.size() == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Size of stack is : "+s.size());
                    }
                    break;

                case 7 :
                    s.sort();
                    break;

                case 8 :
                    s.reverse();
                    break;

                case 9 :
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
