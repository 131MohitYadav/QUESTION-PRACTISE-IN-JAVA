import java.util.Scanner;

public class factorial {
    public static void  main (String args[]){
        Scanner sc = new Scanner(System.in);

      //  System.out.println("ENTER A NUMBER: ");here take input of number
        int fact = 1; // intialize the variable

        System.out.println("ENTER A NUMBER: ");
        int number = sc.nextInt();
        for(int i = 1 ; i<=number; i++){
            fact = fact * i;
        }
        System.out.println("The factorial number is: " + fact);


    }
}
