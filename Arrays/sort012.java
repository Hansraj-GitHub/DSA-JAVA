
import java.util.ArrayList;
import java.util.List;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,0,2};
        List<Integer> mergedList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        
        for ( int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                list1.add(arr[i]);
            }else if(arr[i] == 1){
                list2.add(arr[i]);

            }else{
                list3.add(arr[i]);
            }
        }
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        mergedList.addAll(list3);

        System.out.println(mergedList);
        
    }
}
