package com.mayuran19.learning.stack;

/**
 * Created by smayuran on 11/23/2017.
 */
public class Stack {
    private Object[] items = null;
    int top;
    int size;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        items = new Object[size];
    }

    public void push(Object object){
        if(top != size - 1){
            items[top + 1] = object;
            top = top + 1;
        }else{
            throw new RuntimeException("Stack is full");
        }
    }

    public Object pop(){
        if(top != -1){
            int topLocation = top;
            top = top - 1;
            return items[topLocation];
        }else{
            throw new RuntimeException("No element to pop");
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack(5);
        stack.push("Mayuran");
        System.out.println(stack.pop());

        stack.push("Sadden");
        stack.push("Theepan");
        stack.push("Appa");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
