package org.example;

public class BinarySearchRecrusive {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 7, 9, 11, 13};
        int target = 3;

        //int nums[] = new int[100000000];
        //int target = 500;

        int targetValueIndex = binarySearch(nums, target, 0, nums.length - 1);

        if (targetValueIndex != -1) {
            System.out.println("Element found at index : " + targetValueIndex);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //5,7,9,11,13
        int steps = 0;
        if (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Number of steps taken by binary search : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }

        }
        System.out.println("Number of steps taken by binary search: " + steps);
        return -1;
    }
}
