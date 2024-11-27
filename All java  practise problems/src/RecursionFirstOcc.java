public class RecursionFirstOcc {
    public static int FirstOccurence(int arr[] , int key, int i){

        // base case
        if( i == arr.length){
            return -1;
        }

        // agr index find ho gyi too

        if(arr[i] == key){
            return i;
        }
        // agr nhi hui ho
        return FirstOccurence(arr,key,i +1);
    }
    public static void main(String args[]){
        int arr[] = { 8,3,6,9,5,10,2,5,3};
          // index    0,1,2,3,4,5,6,7,8
        System.out.println(FirstOccurence(arr,5,0));
    }
}
