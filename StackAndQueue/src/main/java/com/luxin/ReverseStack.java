package com.luxin;

import sun.security.acl.WorldGroupImpl;

import java.util.Stack;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 7:54 下午 2020/8/28
 * @Modified By:
 */
public class ReverseStack {
    public static int getLastElement(Stack<Integer> stack){
        if (stack.isEmpty()){
            throw new RuntimeException("The stack is empty");
        }
        int num = stack.pop();
        if (stack.isEmpty()){
            return num;
        }else {
            int lastNum = getLastElement(stack);
            stack.push(num);
            return lastNum;
        }
    }
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int lastElement = getLastElement(stack);
        reverse(stack);
        stack.push(lastElement);
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        while (!    stack.isEmpty ()){
            System.out.println(stack.pop());
        }
    }
}
