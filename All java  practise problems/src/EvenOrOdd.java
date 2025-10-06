 import java.util.Scanner;
public class EvenOrOdd {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("IT IS EVEN NUMBER");
        }
        else {
            System.out.println("IT IS ODD NUMBER");
            System.out.println("helo");
        }
        sc.close();
    }
}
