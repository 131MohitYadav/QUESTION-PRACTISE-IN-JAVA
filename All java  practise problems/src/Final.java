
 // By uisng final keyword -> cannot be change or cannot be override

public class Final {

    public final void show(){
        System.out.println("This is parent class show method...");
    }
}

class  Child1 extends Final{
    public void show(){
        System.out.println("This is child class show method..." + );
    }
    public static void main(String args[]){
        Final f = new Child1();
        f.show();
    }

}
