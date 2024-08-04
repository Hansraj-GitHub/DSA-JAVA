public class Sum_Max_Min {
    public static void main(String[] args) {
        int n =4;
        int arr[]= {20,4,6,14};

        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i< n; i++){
            if(arr[i]< min){
                min = arr[i];
               System.out.println(min);
            }
            if ( arr[i]>min ){
                max = arr[i];
                System.out.println(max);
            }
            
        }  
        int result = min+max; 
        System.out.println(result);
            
    }
}
