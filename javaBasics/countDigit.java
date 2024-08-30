
public class countDigit {
    public static void main(String[] args) {
        int n = 12;
        int originalNumber = n;
        int count = 0;
        while (n > 0) {
            int digit = n % 10; 
            n = n / 10; 
            if (digit != 0 && originalNumber % digit == 0) { 
                count++;
            }
        }
        System.out.println(count);
    }
}
