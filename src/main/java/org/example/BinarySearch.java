package org.example;

public class BinarySearch {

    public static void main(String[] args) {

        //int nums[] = {1, 2, 3, 4, 5, 7, 9, 11, 13};
       // int target = 11;

        int nums[] = new int[100000000];
        int target = 500;

        int targetValueIndex = binarySearch(nums, target);

        if (targetValueIndex != -1) {
            System.out.println("Element found at index : " + targetValueIndex);
        }
        else {
            System.out.println("Element not found");
        }

    }

    public static int binarySearch(int[] nums, int target) {
        //5,7,9,11,13

        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            steps ++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Number of steps taken by binary search : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else right = mid - 1;

        }
        System.out.println("Number of steps taken by binary search: " + steps);
        return -1;
    }
}
