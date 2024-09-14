public class recursionExample{

   static int count = 0;
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        
        if ( count == 4){
            return;
        }else{
            System.out.println(count);
            count++;
            print();
        }
        

    }
}