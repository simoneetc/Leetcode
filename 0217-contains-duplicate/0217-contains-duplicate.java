class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean test=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return test;
    }
}