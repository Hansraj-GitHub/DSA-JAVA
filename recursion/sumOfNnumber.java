public class sumOfNnumber{
    public static void main(String[] args) {
        int n = 5;
        int answer = sumOfSeries(n);
        System.out.println(answer);
    }

    public static  int  sumOfSeries(int n){
        if ( n <= 0){
            return  0;
        }
        return n + sumOfSeries(n-1);
    }
}