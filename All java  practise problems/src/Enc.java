public class Enc {
    public static void main(String args[]){

        EncapsulationGetter eg = new EncapsulationGetter();
        System.out.println("Name : " +eg.getName());
        System.out.println("Enroll : " + eg.getEnroll());
        eg.setName("Rohit yadav");
        eg.setEnroll("025142");
        System.out.println("Name is : " + eg.getName());
        System.out.println("Enroll is: " + eg.getEnroll());
        System.out.println("hello MOhit Yadav");




    }
}
