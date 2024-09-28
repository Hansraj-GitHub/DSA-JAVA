public class recursionExample{

   static int count = 0;
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        
        if ( count == 5){
            return;
        }else{
            System.out.println("Hansraj");
            count++;
            print();
        }
        

    }
}