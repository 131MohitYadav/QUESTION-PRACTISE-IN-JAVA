

// WRITE A JAVA PROGRAMME TOF FIND THE AREA OF HEXAGONAL
import java.awt.*;
import  java.util.*;
public class Question24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NO. OF THE SIDE OF POLYGON: ");
        // number of  one side
        int ns = sc.nextInt();

        System.out.print("ENTER THE LENGTH OF THE SIDE POLYGON: ");
        // length of the side
        double ls = sc.nextDouble();

// Display area of the polygon
        System.out.print("The area of the polygon is: " + PolygonArea(ns, ls) + "\n");
    }

    public static double PolygonArea(int ns, double ls){
        return(ns*ls/4 * Math.tan(Math.PI*ns));
    }
}


