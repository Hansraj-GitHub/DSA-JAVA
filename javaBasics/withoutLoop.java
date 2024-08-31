public class withoutLoop {
    public static void main(String[] args) {
       System.out.println(8);
       
    }
    public void recursiveNo(int n) {
        
        if(n>0){
            recursiveNo(n-1);
            System.out.print(n+ " ");
        }
        
    }
    
    
}
