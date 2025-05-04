

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
    
}

class Puppy extends Animal{
    void weep(){
        System.out.println("Puppy weeps");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();

        Puppy p = new Puppy();
        p.eat();
        p.weep();
    }
}
