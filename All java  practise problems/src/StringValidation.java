import java.util.Scanner;

public class StringValidation {

    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        if(input.length() < 3){
            System.out.println("Error: the string ust have at least 3 characters");
        }
        else if(!input.matches("[a-zA-Z]+")){
            System.out.println("Error: The string must contain only alphabets");

        }
        else{
            System.out.println("Valid String: " + input);
            System.out.println("Hello Mohit Yadav");
            System.out.println("Hello Yadav Ji");
        }
    }
}
