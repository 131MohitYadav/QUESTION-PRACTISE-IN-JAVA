import java.util.*;
public class OopsStudent {

    // declare member data
    String name;
    String Enroll;
    int p;
    int c;
    int m;
    int h;
    int e;

    int totalmarks;
    double percentage;

    void acceptData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        name = sc.nextLine();
        System.out.println("ENTER YOUR ENROLLMENT NUMBER: ");
        Enroll = sc.nextLine();
        System.out.println();
    }
}
