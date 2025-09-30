public class CubeOddNumber {
    public static void main(String args[]){

        for ( int i = 1 ; i < 10; i++){
            if ( i % 2 != 0){
                System.out.println("The cube of odd number: " + ( i * i * i));
            }
        }
    }
}
