// copy constructor

class Student3{
    
    String name;
    int age;

    // parameterized constructor
    public Student3(String n , int a ) {
        name = n;
        age = a;
    }

    // copy constuctor
    public Student3(Student3 s) {
        name = s.name;
        age = s.age;
    }

    

    void display(){
        System.out.println("Name :"+ name);
        System.out.println("Age :" + age);
    }
    
}


public class constructorCopy {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Hansraj Yadav", 24);
        Student3 s2 = new Student3(s1);

        s1.display();
        System.out.println("----------");
        s2.display();
    }
}
