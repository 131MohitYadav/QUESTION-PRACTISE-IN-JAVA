//write a java program to print sum of array element by suing for each loop
import java.util.Scanner;
public class SumArray {
    public static void main(String args[]){

        int arr [] = {10,20,30,40,50};
        int sum = 0;

        for ( int x : arr){
            sum = sum + x;
        }
        System.out.println("SUM OF ARRAY ELEMENT: " + sum);
        System.out.println("Average of Array element:  " + ( sum/arr.length));
    }
}
