//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Rehmat Singh: 
 */

public class Lab1 {

    // Method to return the maximum of two integers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the minimum of two integers
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the sum of an integer array
    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    // Method to return the average of an integer array
    public static double average(int[] nums) {
        int total = sum(nums);  // Reuse sum method
        return (double) total / nums.length;
    }

    // Method to return the maximum value in an integer array
    public static int max(int[] nums) {
        int maxVal = nums[0];  // Start with the first element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }
        return maxVal;
    }

    // Method to return the minimum value in an integer array
    public static int min(int[] nums) {
        int minVal = nums[0];  // Start with the first element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}
        int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

        // Output the array in order using a while loop
        System.out.println("Array in order:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println(); // New line

        // Output the array in reverse using a for loop
        System.out.println("Array in reverse:");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // New line

        // Output the first and last values of the array
        System.out.println("First value: " + array[0]);
        System.out.println("Last value: " + array[array.length - 1]);

        // Call the methods created
        System.out.println("Max of two numbers (5, 9): " + max(5, 9));
        System.out.println("Min of two numbers (5, 9): " + min(5, 9));
        System.out.println("Sum of array: " + sum(array));
        System.out.println("Average of array: " + average(array));
        System.out.println("Max value in array: " + max(array));
        System.out.println("Min value in array: " + min(array));
    }
}
