//
//// example of user-defined exception class
// class NegativException extends  throwable {
//    private String msg;
//    public NegativException(String msg){
//        this.msg = msg;
//    }
//    public String getMsg(){
//        return  msg;
//    }
//
//
//}
//
//
//
//public class E5 {
//
//    int n = 0;
//    try{
//        n = Integer.parseInt(args[0]);
//        if ( n < 0){
//            NegativeException x = new NegativeException("Negative number exception occur");
//            throw x;
//
//        }
//    }catch(ArrayIndexOutOfBoundsException ae){
//        System.out.println("Pleaes enter one agrument at least in command line");
//        ae.printStackTrace();
//    }
//catch(NumberFormatException ne){
//        System.out.println("Please enter only numric value only");
//        ne.printStackTrace();
//    }
//    catch(NegativeException y){
//        System.out.println(y.getMsg());
//
//        System.out.println("Square is: " + Math.pow(n,2));
//    }
//
//}
