public class IfElseNested {
    public static void main(String args[]){
        int a = 24, b = 74, c=39;
        System.out.print("LARGEST VALUE IS: ");
        if(a>b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        else{
            if(c>b){
                System.out.println(c);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
