class Solution {
    public int search(int[] nums, int target) {
       int low = 0;
    int high = nums.length-1;
      
       return binaryRecursion(low, high, target, nums);
    }
    private int binaryRecursion(int low, int high, int target, int [] nums){
        if(low<=high){
            int mid = low+(high-low)/2;

        if(target==nums[mid]){
            return mid;
        }
        
        if(target<nums[mid]){
            return binaryRecursion(low, mid-1, target, nums);
        }else {
            return binaryRecursion(mid+1, high,target, nums);
        }
        }
        return -1;
    }
}