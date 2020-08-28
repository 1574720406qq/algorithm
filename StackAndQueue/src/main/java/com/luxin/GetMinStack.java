package com.luxin;

import java.util.Stack;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 11:32 下午 2020/8/27
 * @Modified By:
 */
public class GetMinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public GetMinStack() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public int pop() {
        if (stack1 == null || stack1.size() == 0) {
            throw new RuntimeException("the stack is empty");
        }
        stack2.pop();
        return stack1.pop();
    }

    public int peek() {
        if (stack1 == null || stack1.size() == 0) {
            throw new RuntimeException("stack is empty");
        }
        return stack1.peek();
    }

    public void push(int num) {
        if (stack1.isEmpty() || this.getMin() <= num) {
            stack2.push(stack2.push(stack2.peek()));
        }
        if (this.getMin() > num) {
            stack2.push(num);
        }
        stack1.push(num);
    }

    public int getMin() {
        if (stack2.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        GetMinStack stack = new GetMinStack();
        //System.out.println("getMin " + stack.getMin());

        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(3);

        System.out.println("getMin " + stack.getMin());
        System.out.println("peek " + stack.peek());
        System.out.println("pop " + stack.pop());
        System.out.println("peek " + stack.peek());
        System.out.println("pop " + stack.pop());

        System.out.println("getMin " + stack.getMin());
    }
}
