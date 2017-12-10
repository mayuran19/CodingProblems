package com.mayuran19.learning.queue;

/**
 * Created by smayuran on 11/23/2017.
 */
public class CircularQueue {
    private Object[] items = null;
    private int front;
    private int rear;
    private int size;
    private int numberOfItems;

    public CircularQueue(int size){
        items = new Object[size];
        front = 0;
        rear = 0;
        this.size = size;
        numberOfItems = 0;
    }

    public void enqueue(Object object){
        if(numberOfItems <= size){
            if(rear == size){
                rear = 0;
            }
            items[rear] = object;
            rear++;
            numberOfItems++;
        }
        else{
            throw new RuntimeException("queue is full");
        }
    }

    public Object dequeue(){
        if(numberOfItems > 0){
            if(front == size){
                front = 0;
            }
            int frontTmp = front;
            front = front + 1;
            numberOfItems--;
            return items[frontTmp];
        }else{
            throw new RuntimeException("No elements in queue");
        }
    }

    public static void main(String args[]){
        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.enqueue("1");
        circularQueue.enqueue("2");
        circularQueue.enqueue("3");
        circularQueue.enqueue("4");
        circularQueue.enqueue("5");
        circularQueue.enqueue("6");
        circularQueue.enqueue("7");
        circularQueue.enqueue("8");
        circularQueue.enqueue("9");
        circularQueue.enqueue("10");

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());

        circularQueue.enqueue("11");
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
    }
}
