 // WRITE A JAVA PROGRAMME TO PRINT TABLE NUMBER
 import java.util.*;
public class Question6 {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = read.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(num + "x" + (i+1) + "=" + (num*(i+1)));
        }
    }
}
