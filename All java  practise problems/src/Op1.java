public class Op1 {

    // write a java program swap to number without using third varibale

    public static void main(String args[]){

        int a , b;
        a = 23;
        b = 32;
        System.out.println("Before Swapping: ");
        System.out.println("A= " + a +"B = " +b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: ");
        System.out.println("A =  " + a + "B = " + b);

    }
}
