package org.example;

public class QuickSort {

    public static void main(String[] args) {

        int nums[] = {5, 62, 2, 3, 111, 81, 4};

        quicksort(nums, 0, nums.length - 1);

        for (int num : nums) {

            System.out.println(num + " ");
        }

    }

    public static void quicksort(int[] nums, int low, int high) {
        int pi = partition(nums, low, high);
        if (low < high) {
            quicksort(nums, low, pi - 1);
            quicksort(nums, pi + 1, high);
        }

    }

    public static int partition(int[] nums, int low, int high) {
       // int nums[] = {5, 62, 2, 3, 111, 81, 4};
        int pivot = nums[high];
        int i = low - 1;
        //original value --> j <= high  in below loop;
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        int i1 = i != -1 ? i + 1 : low;
        //original value = i=i+1;
        return i1;
    }
}
