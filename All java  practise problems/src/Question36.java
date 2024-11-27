// write a java program to accept a number and check whether the number is even or not prints. if the number is even or 0 if odd
import  java.util.*;
public class Question36 {
    public static void main(String args[]){
        //create a scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT A NUMBER: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
