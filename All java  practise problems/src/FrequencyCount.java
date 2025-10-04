import java.util.*;

public class FrequencyCount {
    public static void mian(String args[]){

        Scanner sc = new Scanner(System.in);

        // step 1 // take size of arra as inupt
        int n = sc.nextInt();

        // step 2 declare array and read elements
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // step 3 use hashmpa to store frequency
        HashMap<Integer , Integer> map = new HashMap<>();

        for( int num : arr){
            // if number already exists , increase its count
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        // step 4 print  the result in sorted order
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for( int key : keys){
            System.out.println(key + " occurs " + map.get(key) + "times");
        }
        sc.close();
    }
}
