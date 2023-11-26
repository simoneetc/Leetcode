class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int sum = 0;
        
        for(int i=0; i<nums.length && nums[i] <= 0; i++) { //i to iterale
            //ith value not equal to 0
            //negative  value so that sum of j+k , makes the whole sum=0
            int j = i+1;
            int k = nums.length-1;
            while(j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k])); 
                    j++; //look for new set
                    k--;
                }
                else if(sum > 0)
                    k--; //sum greater than so move k
                else
                    j++;
            }
        }
        
        return new ArrayList<>(set);
      
    }
}