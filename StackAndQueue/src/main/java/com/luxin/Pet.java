package com.luxin;

import java.util.Stack;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 8:19 下午 2020/8/28
 * @Modified By:
 */
public class Pet {
    private String type;
    public Pet(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}

class doMain{
    public static void main(String[] args) {
        Stack<Pet> stack = new Stack<Pet>();

    }

}

class Dog extends Pet{

    public Dog(String type) {
        super("dog");
    }
}

class Cat extends Pet{

    public Cat(String type) {
        super("cat");
    }
}
