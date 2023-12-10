class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = nums[0];//first
        rightSum[n - 1] = nums[n - 1];//last 

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i]; //sum for left side 
            rightSum[n - 1 - i] = rightSum[n - i] + nums[n - 1 - i]; //right side sum +present element from right side
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}
