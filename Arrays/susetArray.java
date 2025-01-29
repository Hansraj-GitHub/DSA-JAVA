import java.util.HashSet;

public class susetArray {
    public static boolean isSubset(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (!set.contains(num)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b1 = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a1, b1)); 
    }
}


