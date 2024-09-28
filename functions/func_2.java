
import java.util.Scanner;

// public class func_2 {
//     public static void main(String[] args) {
//         int sum=greet(20,30);
//         System.out.println("your answer is = "+ sum);
//     }
//     static int greet(int a, int b) {
//         int answer = a+b;
//         return answer;
//     }
// }
public class func_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter your  name : ");
    String str = sc.next();
    String answer= greet(str);
    System.out.println(answer);
  }
    static String greet(String name) {
    String greeting="hello "+ name;
    return greeting;
    }

}
