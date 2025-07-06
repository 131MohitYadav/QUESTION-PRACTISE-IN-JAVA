
// write a java programme to convert given number in binary form with the help of array

import java.util.Scanner;
public class ArrayBinary {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER: ");
        int n = sc.nextInt();

        int i  = 0;
        int arr[] = new int[10];

        while ( n > 0){//10
            // for binary number or you can also find the hexadecimal 16 and octal 8
            int r = n % 2;//5
            arr[i] = r;// 5 in 0 index
            i++;
            n = n/2;
        }

  System.out.println("Binary Number is:");
        // ye hmm esleye user kr rahi taki digit print lsb to msb
        for (  i = i-1; i >= 0; i--){
            System.out.print("\t"+arr[i]);
            System.out.println("All Binary number is Here");
        }



    }
}
