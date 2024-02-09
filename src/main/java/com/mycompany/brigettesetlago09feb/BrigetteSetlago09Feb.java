/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brigettesetlago09feb;

/**
 *
 * @author Brigette Setlago
 */
import java.util.ArrayList;
import java.util.List;
public class BrigetteSetlago09Feb {

    public static void main(String[] args) {
       

        //Declarations for array
        int[] array1 = {11, 22, 33, 45};
        int[] array2 = {1, 2, 3};

        int[] combinedArray = combine(array1, array2);

        // Printing the combined array
        for (int element : combinedArray) {
            System.out.print(element + " ");
        }
    }

    public static int[] combine(int[] array1, int[] array2) {
        List<Integer> combinedList = new ArrayList<>();
        
       //Calculations
        int maxLength = Math.max(array1.length, array2.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length) {
                combinedList.add(array1[i]);
            }
            if (i < array2.length) {
                combinedList.add(array2[i]);
            }
        }

        // Convert List<Integer> to integer[]
        int[] combinedArray = combinedList.stream().mapToInt(Integer::intValue).toArray();

        return combinedArray;
    }
}

    

