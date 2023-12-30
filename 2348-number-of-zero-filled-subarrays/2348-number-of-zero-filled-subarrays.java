class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, res = 0;
        for (int x : nums) {
            if (x != 0)
                count = 0;
            else
                count++;
            res += count;
        }
        return res;
    }
}