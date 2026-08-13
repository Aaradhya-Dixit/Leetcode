class Solution {
    public int reverse(int x) {
      long sum =0;
      int rev=0;
      int c;
      if(x>=0){
        c=1;
      }
      else{
        x=-1*x;
        c= -1;
      }
      while(x>0){
        rev=x%10;
        sum=sum*10+rev;
        x=x/10;
      }  
      
      if(sum< (-1*Math.pow(2,31)) || sum> (Math.pow(2,31)-1)){
        return 0;
      }
      x=c*(int)sum;
      return x;
    }
}