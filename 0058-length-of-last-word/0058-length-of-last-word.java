class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();  //removes leading and trailing spaces
        int total=0;
        
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') //if a " " found stop counting
                break;
            else
                total+=1; //increment total or else
        }

        return total;
    }
}