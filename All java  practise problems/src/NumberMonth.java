import java.util.Scanner;

public class NumberMonth {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int  M , Y , daysInmonth;
        String MonthName;

        System.out.println("ENTER A MONTH NUMBER : ");
        M = sc.nextInt();
        System.out.println("Enter a year: ");
        Y = sc.nextInt();

        switch(M){

            case 1:
                 MonthName = "January";
                 daysInmonth = 31;
                 break;

            case 2:
                 MonthName = "February";
                 if (( Y % 4 == 0 && Y % 100 != 0) || ( Y % 400 == 0)){
                     daysInmonth = 29; // leap year
            }
                 else{
                     daysInmonth = 28; // non leap year
                 }
            case 3:
                MonthName = "March";
                daysInmonth =  31;
                break;

        }
    }
}
