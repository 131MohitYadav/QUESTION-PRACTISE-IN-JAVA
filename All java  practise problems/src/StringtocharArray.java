public class StringtocharArray {
    public static void main(String args[]){

        String s1 = "Welcome";

        char[] arr = s1.toCharArray();
        for ( int i = 0; i < arr.length; i++){
            System.out.println("Using for Loop : " + arr[i]);
        }
        System.out.println("USING FOR EACH LOOP " );
        for ( char x : arr){
            System.out.print(x);
        }
    }
}
