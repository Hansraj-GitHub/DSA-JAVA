
// Parameterized constructor

class student2{

    String name;
    int age ;

    public student2(String n , int a) {
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name :"+ name);
        System.out.println("Age :" + age);
    }
    
}


public class constructorPara {
    public static void main(String[] args) {
        
        student2 s = new student2("Hansraj", 24);
        s.display();
    }
}
