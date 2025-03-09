class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-20d %s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-20s %s\n", "Name", "Year of joining", "Address");
        Employee e1 = new Employee("Ram", 1994, "64C- Bhopal");
        Employee e2 = new Employee("Praveen", 2000, "68D- Bhopal");
        Employee e3 = new Employee("Yash", 1999, "26B- Bhopal");
        e1.display();
        e2.display();
        e3.display();
    }
}
