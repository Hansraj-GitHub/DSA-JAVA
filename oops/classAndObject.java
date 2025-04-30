// Define the class
class Student {
    // Attributes (variables)
    String name;
    int age;
    String course;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("--------------------");
    }
}

// Main class to test the object
public class classAndObject{
    public static void main(String[] args) {
        // Create first Student object
        Student s1 = new Student();
        s1.name = "Hansraj";                   // Assign values
        s1.age = 24;
        s1.course = "Computer Science";

        // Create second Student object
        Student s2 = new Student();
        s2.name = "Raja";
        s2.age = 22;
        s2.course = "Mechanical Engineering";

        // Call method to display details
        s1.displayDetails();
        s2.displayDetails();
    }
}
