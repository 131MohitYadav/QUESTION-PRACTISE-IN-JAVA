
// WRITE A JAVA PROGRAMME TOF FIND THE AREA OF HEXAGONAL
 import  java.util.*;
public class Question23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE LENGTH OF THE SIDE OF HEXAGON: ");
        // Read the length of one side of the user
        double s = sc.nextDouble();

// Display area of the hexagon
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
    }

    public static double hexagonArea(double s){
            return(6*(s*s)/4*Math.tan(Math.PI/6));
        }
    }

