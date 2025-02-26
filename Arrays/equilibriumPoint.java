public class equilibriumPoint {
    public static int findEquilibriumPoint(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num; // Compute total sum of array
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Right sum = totalSum - leftSum - arr[i]
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i; // Found equilibrium index
            }
            leftSum += arr[i]; // Update leftSum
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 3};
        System.out.println(findEquilibriumPoint(arr1)); // Output: 2

        int[] arr2 = {1, 1, 1, 1};
        System.out.println(findEquilibriumPoint(arr2)); // Output: -1

        int[] arr3 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumPoint(arr3)); // Output: 3
    }
}
