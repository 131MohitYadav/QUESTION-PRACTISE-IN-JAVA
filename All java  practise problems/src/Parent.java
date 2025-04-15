// METHOD OVERRIDING EXAMPLE
public class Parent {
    public void show() {
        System.out.println("This is parent class show method......");
    }
}

class Child extends Parent {

    public void show() {
        System.out.println("This is child class show method.....");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Will call Parent's show()

        Child c = new Child();
        c.show(); // Will call Child's show()

        Parent pc = new Child();
        pc.show(); // Will call Child's show() due to overriding (runtime polymorphism)
    }
}
