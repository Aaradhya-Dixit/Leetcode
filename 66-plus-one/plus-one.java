class Solution {
    public int[] plusOne(int[] digits) {
        int count=0;
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        else{
            int c =0;
            for(int i =0;i<digits.length;i++)
             if(digits[i]==9){
                c++;
             }
             if(c==digits.length){
             int number[]=new int[digits.length+1];
             for(int i = number.length-1;i>0;i--){
             number[i]=0;
             }
             number[0]=1;
             return number;
           }
           else
           digits[digits.length-1]=0;
           digits[digits.length-2]++;
           for(int i = digits.length -2;i>0;i--){
             if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++; 
             }
           }
    }
           return digits;
        }
}