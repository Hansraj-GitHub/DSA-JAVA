import java.util.HashMap;

public class equalArray {
    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) {
                return false; // Element missing or count mismatch
            }
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 4, 0};
        int[] b1 = {2, 4, 5, 0, 1};
        System.out.println(areArraysEqual(a1, b1)); // Output: true

        int[] a2 = {1, 2, 5};
        int[] b2 = {2, 4, 15};
        System.out.println(areArraysEqual(a2, b2)); // Output: false
    }

}
