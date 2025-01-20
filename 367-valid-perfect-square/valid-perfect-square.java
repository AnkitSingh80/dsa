class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <= 1)
         return true;

        long left = 1, right = num;

        while(left <= right){
           
           long mid = left + (right - left)/2;

           long sqr = mid * mid;

           if(sqr == num) 
             return true;

           if(sqr < num){
               left = mid+1;
           }
           else {
               right = mid-1;
           }

        }
        return false;

    }
}