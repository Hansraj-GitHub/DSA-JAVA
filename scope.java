public class scope {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        String name="kishan";
        
        {
            //  int a=99; already initialize outside the block in the same mothod cannot initialize again in this block
             a=100; // reassign the original ref variable
             System.out.println(a);
            int c= 55;
             // value initialize in this block will remain in block
            name ="hansraj";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); cannot use outside the block
    }
    static void random(int marks) {
        int num=66;
        System.out.println(num);
        System.out.println(marks);
    }
}
