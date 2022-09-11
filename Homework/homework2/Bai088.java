package Homework.homework2;

import java.util.Arrays;

class Bai088 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int j = m - 1;
        int k = n - 1;

        while (k >= 0) {
            if (j >= 0) {
                nums1[i--] = nums1[j] > nums2[k] ? nums1[j--] : nums2[k--];
            } else {
                nums1[i--] = nums2[k--];
            }
        }
    }

    public static void main(String[] args) {

        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums1 = { 10, 11, 12, 0, 0, 0 };
        int m = 3;
        System.out.println("nums1 = " + Arrays.toString(nums1));

        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        System.out.println("nums2 = " + Arrays.toString(nums2));

        merge(nums1, m, nums2, n);
        System.out.println("Merged Array = " + Arrays.toString(nums1));

    }
}