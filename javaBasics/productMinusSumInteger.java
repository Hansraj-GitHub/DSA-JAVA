public class productMinusSumInteger {
    public static void main(String[] args) {
        int n = 234;
        int temp = 1;
        int sum = 0;
        int count = n;
        int answer;
        while(n>0){  
            int digit = n %10;
            temp = temp * digit;
            n = n/10;
        }
        n = count;
        while(n > 0){
            int digit = n %10;
            sum = sum + digit;
            n = n /10;
           
        }
        answer = temp - sum;
        System.out.println(answer);
    }
}
