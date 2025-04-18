public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = (si + ei) / 2;
        Mergesort(arr, si, mid); // left part
        Mergesort(arr, mid + 1, ei); // right part
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterate from left part
        int j = mid + 1; // iterate from right part
        int k = 0; // iterate for temp array

        // comparison
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining elements from left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining elements from right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        Mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
