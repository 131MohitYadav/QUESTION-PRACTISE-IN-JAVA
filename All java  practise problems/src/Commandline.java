public class Commandline {
    public static void main(String [] args){
        int count , i = 8;
        String string;
        count = args.length;
        System.out.println("NUMBER OF ARGUMENTS: " + count);
        while(i<count){
            string = args[i];
            i = i + 1;
            System.out.println(i + " : " + "java is" + string+ "!");
        }
    }
}
