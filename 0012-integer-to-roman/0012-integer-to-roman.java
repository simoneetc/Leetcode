class Solution {
    public String intToRoman(int num) {
       //like key value pair
        int[] values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        String[] notations=new String[]     {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<values.length;i++){ //iterate values array
            while(num>=values[i]) // num greater
            {
                num-=values[i]; //decrement num by value(cuurent)
                sb.append(notations[i]);//append roman
            }
        }

        return sb.toString(); //string form
    

    }
}