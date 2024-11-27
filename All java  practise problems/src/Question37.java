
// write a java programm to print number between 1 to 100 which are divisble by 3,5 and by both

public class Question37 {
    public static void main(String args[]){

        // number divide by 3
        System.out.println("\nDivide by 3: ");
        for(int i = 1;i<100;i++)
            if(i%3==0){
                System.out.print(i + ", ");
            }

            // number divide by 5
            System.out.println("\n\nDivide by 5: ");// \n use for  double space after divide by 3
            for(int i = 1; i<100;i++)
                if(i%5 == 0){
                    System.out.print(i + ", ");
                }

                // number divide by 3 and 5
                System.out.println("\n\nDivide by 3 and 5: ");
                for(int i = 1; i<100; i++){
                    if(i%3 == 0 && i%5 == 0)
                        System.out.print(i + ", ");
                    }
                    System.out.println();
                }
            }



