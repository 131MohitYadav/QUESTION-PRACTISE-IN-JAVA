//Java: List the available character sets in charset objects
import java.nio.charset.Charset;
        public class Question28 {
            public static void main(String args[]){
                System.out.print("LIST OF AVAILABLE CHARACTER SET: ");
                //ITERATE THROUGH AVAILABLE CHARACTER SET
                for(String str: Charset.availableCharsets().keySet()){
                    System.out.println(str);
                }

            }
}
