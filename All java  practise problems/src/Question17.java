 // JAVA PROGRAMME TO COVERT DECIMAL TO HEXADECIMAL NUMBER
 import java.util.*;
public class Question17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // DECLARE VARIABLE TO STRORE DECIMAL NUMBER AND REMAINDER
        int dec_num,rem;

        // DECLARE EMPTY STRING TO STORE HEXADECIMAL NUMBER
        String hexdec_num = "";

        // DEFINE THE HEXADECIMAL NUMBER DIGIT
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

      // USER INPUT TO DECIMAL NUMBER
        System.out.println("INPUT  A DECIMAL NUMBER: ");
        dec_num = sc.nextInt();

        // CONVERT THE DECIMAL NUMBER TO HEXADECIMAL
        while(dec_num>0){
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.println("HEXADECIMAL NUMBER IS: " + hexdec_num);


    }
}
