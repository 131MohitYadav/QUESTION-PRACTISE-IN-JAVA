
// Write java programme to print given array in ascending order

import java.util.Scanner;
public class ArrayAscending {

    public static void main(String args [ ]){

        int arr[] = {20,30,40,70,23};

        System.out.println("Before Sorting: ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] +" ");
        }

        for ( int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){

                    // bubble sort logic
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting in Ascending order:");

        for ( int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("The first smallest Element: " + arr[0]);
        System.out.println("The Second smallest Element : " + arr[1]);

        System.out.println("The first Greatest Element: " + arr[arr.length-1]);
        System.out.println("The Second Greatest Element : " + arr[arr.length-2]);
    }
}
