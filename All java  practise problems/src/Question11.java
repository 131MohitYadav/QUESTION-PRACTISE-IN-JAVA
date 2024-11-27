public class Question11 {
    public static void main(String args[]){
        String p1 = "* * * * * * ====================\n * * * * * =====================";
        String p2 = "================================";
        // PRINT THE PATTERN TOP AND MIDDLE PART OF FLAG//
        System.out.println("AMERICAN FLAG");
        for(int i = 0 ;i<4;i++) {
            System.out.println(p1);
        }
            // PRINT THE PATTER BOTTOM OF FLAG//
            for(int i = 0;i<6;i++){
                System.out.println(p2);
            }
        }
    }

