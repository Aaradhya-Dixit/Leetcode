class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        if(nums[start]>target){
            return start;
        }
        else if(nums[end]<target){
            return end+1;
        }
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(nums[start]>target){
                return start;
            }
            else if(nums[end]<target){
                return end+1;
            }
                    }
                    return 0;
    }
}