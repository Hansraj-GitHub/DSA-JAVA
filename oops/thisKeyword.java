
// this keyword
class student4{

    String name;
    int age;

    public student4() {
        this.name = "Hansraj";
        this.age = 24;
    }
    
}
public class thisKeyword {
    public static void main(String[] args) {
        student4 s = new student4();
        System.out.println(s.name);
        System.out.println(s.age);
    }   
}
