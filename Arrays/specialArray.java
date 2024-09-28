class specialArray{
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,8};
        int[] nums2 = {1,2,3,4,5,7};
        System.out.println(specialArray1(nums1));
        System.out.println(specialArray1(nums2));
    }

    public static boolean specialArray1(int[] nums){
        if (nums.length == 1){
            return true;
        }
        for ( int i = 1 ; i < nums.length ; i++){
            if ( (nums[i]%2) == (nums[i-1] % 2)){
                return false;
            }
        }
        return true;
    }
}