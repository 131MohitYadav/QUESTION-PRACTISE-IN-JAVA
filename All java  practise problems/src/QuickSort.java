public class QuickSort {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int si, int ei){

        // base case
        if(si >= ei){ // that means array pehle se hi sort h
            return;
        }

        // last element
        int PIDX = partition(arr,si,ei);
        quicksort(arr, si, PIDX-1);// left part
        quicksort(arr,PIDX+1,ei);//right part
    }
    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;// to make place for element smaller than pivot

        for(int j = si; j<ei; j++){// current element
            if(arr[j] <= pivot){
                i++;

                // swap condition
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]  = arr[i];
        arr[i] =temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,1,5};
        quicksort(arr,0,arr.length-1);
        printArr(arr);
    }
}
