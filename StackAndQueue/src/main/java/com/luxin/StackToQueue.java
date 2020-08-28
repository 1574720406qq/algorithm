package com.luxin;

import java.util.Stack;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 12:15 上午 2020/8/28
 * @Modified By:
 */
public class StackToQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackToQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int num){
        stack1.push(num);
    }

    public int poll(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        if (stack2.isEmpty()){

            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("the queue is empty");
        }
        if (stack2.isEmpty()){

            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(2);
        stackToQueue.push(3);
        stackToQueue.push(4);
        System.out.println(stackToQueue.peek());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.peek());
        stackToQueue.push(2);
        stackToQueue.push(3);
        stackToQueue.push(4);
        System.out.println(stackToQueue.peek());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.peek());
    }


}
