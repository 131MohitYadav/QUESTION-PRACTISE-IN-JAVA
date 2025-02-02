public class ArraySandG {

    public static void main(String args[]){

        int arr[] = {10,82,23,24,29};
        int max = arr[0]; // hamne mann liya ki 10 greatest hai

        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] > max) // here 82 > 10
                max = arr[i]; // 82
        }

        System.out.println("The greatest Element: " + max);
    }
}
