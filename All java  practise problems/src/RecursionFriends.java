public class RecursionFriends {

    public static int friendspairing(int n ){

        // base case
        if ( n == 1 || n == 2){
            return n;
        }

        //choice
        // single

        int fnm1 = friendspairing(n - 1);

        //pairing

        int pairWays = fnm1 * friendspairing(n -2);

        // total pairs

        int totalWays = fnm1 + pairWays;
        return totalWays;

        // return friendsPairing ( n - 1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));
    }
}
