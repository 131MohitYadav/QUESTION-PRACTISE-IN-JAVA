class Student1 {
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.name = "Mohit";
        student1.roll_no = 101;
        student1.phone_no = "9876543210";
        student1.address = "Delhi";

        Student1 student2 = new Student1();
        student2.name = "Sanjay";
        student2.roll_no = 102;
        student2.phone_no = "8765432109";
        student2.address = "Mumbai";

        System.out.println("Name: " + student1.name);
        System.out.println("Roll Number: " + student1.roll_no);
        System.out.println("Phone Number: " + student1.phone_no);
        System.out.println("Address: " + student1.address);

        System.out.println();

        System.out.println("Name: " + student2.name);
        System.out.println("Roll Number: " + student2.roll_no);
        System.out.println("Phone Number: " + student2.phone_no);
        System.out.println("Address: " + student2.address);
    }
}
