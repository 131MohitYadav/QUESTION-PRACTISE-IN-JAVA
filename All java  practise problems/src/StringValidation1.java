import java.util.Scanner;

public class StringValidation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if(input.length() < 6){
            System.out.println("Error: The string must have at least 6 characters");
        }
        else if(!input.matches("[a-zA-Z0-9@]+]")) {
            System.out.println("Error: The string must not contains special characters except @");
        }
        else{
            System.out.println("Valid string: " + input);
        }
    }
}
