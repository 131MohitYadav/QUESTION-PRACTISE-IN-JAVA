class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Mohit";
        obj.roll_no = 131;

        System.out.println("Student Name: " + obj.name);
        System.out.println("Roll Number: " + obj.roll_no);
    }
}
