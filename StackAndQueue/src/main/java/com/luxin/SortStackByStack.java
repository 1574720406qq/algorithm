package com.luxin;

import sun.security.acl.WorldGroupImpl;

import java.util.Stack;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 8:35 下午 2020/8/28
 * @Modified By:
 */
public class SortStackByStack {

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()){
            stack.push(help.pop());
        }

    }
}
