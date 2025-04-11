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
        System.out.println("ENTER PHYSICS MARKS: ");
        p = sc.nextInt();
        System.out.println("ENTER CHEMISTRY MARKS; ");
        c = sc.nextInt();
        System.out.println("ENTER MATHS MARKS; ");
        m = sc.nextInt();
        System.out.println("ENTER HINDI MARKS: ");
        h = sc.nextInt();
        System.out.println("ENTER ENGLISH MARKS: ");
        e = sc.nextInt();


    }
    void showData(){
        System.out.println("Name: " + name);
        System.out.println("Enroll: "+ Enroll);
        System.out.println("Physics: " + p);
        System.out.println("Chemistry: "+ c);
        System.out.println("Maths: " + m);
        System.out.println("Hindi: "+ h);
        System.out.println("English: " + e);

    }
    void getTotalmarks(){
        totalmarks = p + c + m + h + e;
        System.out.println("Total Marks: " + totalmarks);
    }
}
