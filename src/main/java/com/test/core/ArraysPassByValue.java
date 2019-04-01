package com.test.core;

/**
 * Java is always pass-by-value.
 *
 * <p>
 * Pass by Value: The method parameter values are copied to another variable and then the copied object is passed,
 * that’s why it’s called pass by value.
 * <p>
 * <p>
 * Pass by Reference: An alias or reference to the actual parameter is passed to the method,
 * that’s why it’s called pass by reference.
 */
public class ArraysPassByValue {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        changeArray(ar[0], ar);

        System.out.println(ar[0] + ", " + ar[1]); // Output : 1,6
    }

    /**
     * All arrays in Java are objects.
     *
     * Every Java array type has java.lang.Object as its supertype,
     * and inherits the implementation of all methods in the Object API.
     *
     * <p>
     * Like all Java objects, arrays are passed by value ... but the value is the reference to the array.
     * <p>
     *
     * Real passing by reference involves passing the address of a variable
     * so that the variable can be updated. This is NOT what happens when you pass an array in Java.
     *
     * @param i
     * @param ar
     */
    public static void changeArray(int i, final int[] ar) {
        ar[i] = 6; // Here, we are modifying the array and not it's address
        i = 5;
    }
}
