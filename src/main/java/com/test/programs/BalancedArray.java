package com.test.programs;

/**
 * Given an array of even size, task is to find minimum value that can be added to an element so that array become balanced.
 *
 * An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
 *
 */
public class BalancedArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 2, 1, 3};
        int[] array1 = new int[]{20, 10};

        System.out.println(isBalanced(array));
        System.out.println(isBalanced(array1));
    }

    private static int isBalanced(int[] inputArray) {

        int mid = inputArray.length / 2;

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += inputArray[i];
        }
        for (int i = mid; i < inputArray.length; i++) {
            rightSum += inputArray[i];
        }
        if (leftSum == rightSum) {
            return 0;
        } else {
            if (leftSum > rightSum) {
                return leftSum - rightSum;
            } else {
                return rightSum - leftSum;
            }
        }

      /*  int count = 1;
        for (int i = 0; i < inputArray.length; i++) {
            if ((inputArray[i] % 2) != (i % 2)) {
                count = 0;
                break;
            }
        }
        return count;*/
    }

}
