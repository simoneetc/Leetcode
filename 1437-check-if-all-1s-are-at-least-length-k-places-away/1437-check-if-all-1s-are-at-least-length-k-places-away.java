class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=-1; //prev
        for(int j=0;j<nums.length;j++){ //current
            if(nums[j]==1){
                if(i!=-1&&j-i-1<k) //check if spaced
                    return false;
                else
                    i=j; //prev position to curr

            }
         
        }
        return true;  
        
    }
}