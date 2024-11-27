// write a java prgramme to display unique value of three digit number
import java.util.*;
 public class Question27 {

     public static void main(String args[]){

         int amount=0;
         //iterated through three nested loop of unique three digit number
         for(int i=1;i<=4;i++){
             for(int j=1; j<=4;j++){
                 for(int k=1; k<=4;k++){
                     //check if i , j , k are all different
                     if(i != j && k != j &&  k != i){
                         amount++;//increment the operator
                         System.out.println( i + "" + j + "" + k + ""); //print the three digit number
                     }
                 }
             }
         }
         System.out.println("TOTAL NUMBER OF UNIQUE THREE DIGIT NUMBER: " + amount);

     }


}
