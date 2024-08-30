import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter no: ");
        ArrayList <Integer> list= new ArrayList<>(5);
        
        for(int i = 0; i < 5; i++) {
        list.add(sc.nextInt());
        }

        // get item at any index

        for(int i = 0; i < 5 ; i++) {
            // System.out.println(list.get(i)); // pass index here4
        }
        System.out.println(list);
    }
    
}
