
// Write a java programme to find unique and duplicate element from the array

import java.util.Scanner;

public class ArrayUnique {
    public static void main(String args [ ]){

        int arr[] = {1,2,3,1,4,8,9,6,2,5};
        int freq [] = new int[10];


        for ( int i = 0; i<arr.length; i++){
                freq[arr[i]]++;

        }

        System.out.println("Unique Element in the array: ");
        for( int i = 0 ; i < freq.length; i++){
            if ( freq[i] == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDuplicate Element in the array: ");
        for( int i = 0 ; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
