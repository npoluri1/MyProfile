package com.stack;

public class DunamicRunner {

    public static void main(String[] args){

        DynamicStack nums = new DynamicStack();
        //System.out.println("Is Empty : "+nums.isEmpty());
        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
       // System.out.println("Peek Value : "+nums.peek());
        nums.push(10);
        nums.show();
        nums.push(12);
        nums.show();
        nums.push(18);
        nums.show();
        nums.push(17);
        nums.show();

        nums.pop();
        nums.show();



    }

}
