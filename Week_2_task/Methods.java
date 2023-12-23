package com.mycompany.methods;

public class Methods {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int b = 10;
        arr1 = add(arr1, b);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static int[] add(int[] arr, int a) {
        int b = arr.length;

        // Create a new array with increased size
        int[] newArray = new int[b + 1];

        // Copy the elements from the original array to the new array
        for (int i = 0; i < b; i++) {
            newArray[i] = arr[i];
        }

        // Add the new element to the end of the new array
        newArray[b] = a;

        // Return the new array
        return newArray;
    }
}
