//import java.util.Map;
//
//public class RecursionDuplicate {
//
//    public static void Removeduplicate(String str, int idx , StringBuilder newStr, boolean Map[]) {
//
//        // base case
//
//        if (idx = str.length()) {
//            System.out.println(newStr);
//            return;
//        }
//        char CurrChar = str.charAt(idx);
//
//        if (Map[CurrChar - 'a'] == true) {
//
//            Removeduplicate(str, idx + 1, newStr, Map);
//        } else {
//            Map[CurrChar - 'a'] == true;
//            Removeduplicate(str, idx, newStr.append(CurrChar), Map);
//        }
//    }
//    public static void main(String args[]){
//
//String str = "appnacollege";
//Removeduplicate(str, 0 , new StringBuilder("") , new boolean[26]);
//
//    }
//}
