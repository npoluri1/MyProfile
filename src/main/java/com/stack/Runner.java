package com.stack;

public class Runner {

    public static void main(String[] args){

        Stack nums =new Stack();
        System.out.println("Is Empty : "+nums.isEmpty());
        nums.push(15);
        nums.push(8);
        System.out.println("Peek Value : "+nums.peek());
        nums.push(10);
        nums.push(12);
        nums.push(18);
        nums.push(17);
        nums.show();

        System.out.println("Pop Value : "+nums.pop());

        System.out.println("Size is : "+nums.size());
        System.out.println("Is Empty : "+nums.isEmpty());

        nums.show();

    }

}
