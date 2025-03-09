import java.util.Scanner;

class Student3 {
    String name;
    String studentClass;
    char section;
    int[] marks = new int[4];

    Student3(String name, String studentClass, char section, int[] marks) {
        this.name = name;
        this.studentClass = studentClass;
        this.section = section;
        System.arraycopy(marks, 0, this.marks, 0, 4);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    String getStudentClass() {
        return studentClass;
    }

    void setSection(char section) {
        this.section = section;
    }

    char getSection() {
        return section;
    }

    void setMarks(int[] marks) {
        System.arraycopy(marks, 0, this.marks, 0, 4);
    }

    int[] getMarks() {
        return marks;
    }

    int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double getPercentage() {
        return getTotalMarks() / 4.0;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Section: " + section);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter class: ");
        String studentClass = scanner.nextLine();
        System.out.print("Enter section: ");
        char section = scanner.next().charAt(0);
        int[] marks = new int[4];
        System.out.print("Enter marks in 4 subjects: ");
        for (int i = 0; i < 4; i++) {
            marks[i] = scanner.nextInt();
        }
        Student3 student = new Student3(name, studentClass, section, marks);
        student.displayStudent();
    }
}
