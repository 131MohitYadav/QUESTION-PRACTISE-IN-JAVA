
// Write a java programe to check given array is sorted or not

import java.util.Scanner;
public class ArraySort {
public static void main(String args [ ]){
    Scanner sc = new Scanner(System.in);

    int arr[] = {60,20,30,40,50};
    int count = 0;


    for(int i =0 ; i< arr.length; i++){
        for( int j = i + 1; j < arr.length; j++){
            if ( arr[i] > arr[j]){
                count++;
            }
        }
    }
    if ( count == 0){
        System.out.println("Yes Array is sorted");
    }
    else{
        System.out.println("No Array is not sorted");
        System.out.println("Array is not sorted correctly");
    }

    }
}
