public class RecursionLastOcc {
    public static int LastOccurence(int arr[],int key, int i){

        // base case
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
                if (isFound == -1 && arr[i] == key){
                    return i;
                }
                return  isFound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,8,10};
        System.out.println(LastOccurence(arr,5,0));
    }
}
