package org.example;

public class LinearSearch {

    public static void main(String[] args) {

        //int nums[] = {1, 2, 3, 4, 5, 7, 9, 11, 13};

       // int target = 11;

        int nums[] = new int[100000000];
        int target = 500;

        int targetValueResultIndex = linearSearch(nums, target);

        if (targetValueResultIndex != -1) {
            System.out.println("Element found at index : " + targetValueResultIndex);
        }
        else {
            System.out.println("Element not found");
        }

    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps ++;
            if (nums[i] == target) {
                System.out.println("No of steps taken by linear search : "+ steps);
                return i;
            }
        }
        System.out.println("No of steps taken by linear search: "+ steps);
        return -1;
    }


}
