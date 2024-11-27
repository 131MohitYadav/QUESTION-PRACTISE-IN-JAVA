
public class SearchArray {
    public static int search(int arr[], int tar, int si, int ei) {

        // Base case
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;

        // Case Found
        if (arr[mid] == tar) {
            return mid;
        }

        // Mid of the left sorted portion
        if (arr[si] <= arr[mid]) {
            // Case a: Left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: Right
                return search(arr, tar, mid + 1, ei);
            }
        }
        // Mid of the right sorted portion
        else {
            // Case c: Right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: Left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
