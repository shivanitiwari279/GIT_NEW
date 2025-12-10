package PRACTICE;

import java.util.*;
public class prac6 {
        public static int maxPairs(int[] arr, int k) {
            Arrays.sort(arr); // Step 1: sort array
            int left = 0, right = arr.length - 1;
            int count = 0;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == k) {
                    count++;
                    left++;
                    right--;
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int[] arr = {5, -3, 0, 6, 3, 7};
            int k = 3;

            int result = maxPairs(arr, k);
            System.out.println("Maximum number of pairs with sum " + k + " = " + result);
        }
    }

