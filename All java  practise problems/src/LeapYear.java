 import  java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A YEAR: ");
        int  x = sc.nextInt();
        if(x%400==0 || x%4==0 ){
            System.out.println("IT IS LEAP YEAR");
        }
        else {
            System.out.println("IT IS NOT A LEAP YEAR");
        }
    }
}
