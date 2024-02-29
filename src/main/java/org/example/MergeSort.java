package org.example;

public class MergeSort {

    public static void main(String[] args) {

        int nums[] = {8, 57, 9, 111, 6, 7,75};

        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();

        mergesort(nums, 0, nums.length - 1);

        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.println(num + " ");
        }

    }

    public static void mergesort(int[] nums, int l, int r) {
        if (l < r) {

            int mid = (l + r) / 2;

            mergesort(nums, l, mid);
            mergesort(nums, mid + 1, r);

            merge(nums, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (lArr[i] <= rArr[j]) {

                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;

        }

        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

}
