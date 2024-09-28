
import java.util.ArrayList;


public class factorialList{
    public static void main(String[] args) {

        ArrayList<Long> factorials = factorial(7);
        System.out.println(factorials); 
    }

    public static ArrayList<Long> factorial(int n){
        ArrayList<Long> fact = new ArrayList<>();

        long facto = 1;

        for ( int i = 1 ; i <= n; i++){
            facto *= i;
            if (facto <= n){
                fact.add(facto);
            }
        }
        return fact;

    }
}