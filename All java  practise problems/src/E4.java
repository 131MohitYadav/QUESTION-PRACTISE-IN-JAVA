

// command line argument -> example pass information at the time of execution of the program

public class E4 {

    public static void main(String args[]){

        int n = 0;
        try{
            n = Integer.parseInt(args[0]);

        } catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Please enter at east on ARgument from command line");
        }
        catch (NumberFormatException ne){
            System.out.println("Please enter a numeric value");
        }
        System.out.println("Square is: " + Math.pow(n,2));
    }
}
