import java.util.*;
public class ElseifLadder {
    public static void main(String args[]){

//        int rollnumber[] = {111, 222, 333, 444};
//        int marks[] = {82, 69 , 55 , 28};
//        for(int i = 0; i < rollnumber.length; i++){
//
//            if(marks[i] > 79)
//                System.out.println(rollnumber[i] + "  " + " Honors");
//            else if( marks[i] > 60)
//                System.out.println(rollnumber[i] + "  " + " I Division");
//                else if (marks[i] > 49)
//                    System.out.println(rollnumber[i] + "  " + " II Division");
//                else
//                    System.out.println(rollnumber[i] + "  " + " Fail");
//            }

        // ANOTHER FORMAT OF CODE

        Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A ROLL NUMBER: ");
            int roll = sc.nextInt();

            System.out.println("ENTER A NAME: ");
            int name = sc.nextInt();

            System.out.println("ENTER A MARKS: ");
            int marks = sc.nextInt();

            if (marks > 75)
                System.out.println("Honors");
            else if(marks > 60)
                System.out.println("I Division");
                else if(marks > 50)
                    System.out.println("II Division");
                else
                    System.out.println("Fail");

                }
            }





