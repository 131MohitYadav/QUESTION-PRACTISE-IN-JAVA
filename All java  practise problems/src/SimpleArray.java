public class SimpleArray {
    public static void main(String args[]){

        int arr[] ={1,2,3,4,5};
        System.out.println("Original: ");
        for(int num : arr){
            System.out.println(num + " ");
        }

        // simple reverse login
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move pointers
            start++;
            end--;
        }
        System.out.println("\n Reversed: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
