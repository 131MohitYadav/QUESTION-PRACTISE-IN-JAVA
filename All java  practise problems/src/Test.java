
// METHOD OVERLOADING EXAMPLE -> in method oveloading create multiple method  with same name but different parameter

public class Test {

    public void add(){
        int a , b , c;
        a = 1;
        b = 2;
        c = a + b;
        System.out.println("Addition without argument: " + c);
    }

    public  void add( int a , int b){
        int c;
        c = a + b;
        System.out.println("Addition with two int argument: " + c);
    }
    public void add(int a , float b){
        float c;
        c = a + b;
        System.out.println("Addition with one int argument and two float argument: " + c);
    }
    public void add(String s1 , String s2){
        int c ;
        c = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("Additon with two String arguement: " + c);
    }

    public static void main(String args[]){
        Test t = new Test();
        t.add();
        t.add("1" , "1");
        t.add(4  , 5);
        t.add(4 , 4.5f);

    }

}
