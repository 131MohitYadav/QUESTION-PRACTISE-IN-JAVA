
/// static keyword
public class StaticK {

    // instace class or member data
    int x;
    int y;
    int count;

    // default constructor
    public StaticK(){
        count++;
    }
    public static void main(String args[]){
        StaticK sk1 = new StaticK();
       // System.out.println(sk.count); // access by classname.memberdata name
        StaticK sk2 = new StaticK();
        StaticK sk3 = new StaticK();
        StaticK sk4 = new StaticK();
        System.out.println(sk3 .count);
    }
}
