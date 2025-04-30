// Default constructor

class Student1 {
    String name;
    int age;

    Student1() {
        name = "Hansraj";
        age = 24;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age :"+ age);
    }

}

public class constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.display();
    }
}
