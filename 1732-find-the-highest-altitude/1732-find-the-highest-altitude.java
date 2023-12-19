class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int temp = 0; //starts trip
        for(int i=0; i<gain.length; i++)
        {
            temp = temp + gain[i]; //store (add prev temp with gain[i])
            if(temp>max){
                max=temp;
            }
            //max or the new temp
        }

        return max;
    }
}