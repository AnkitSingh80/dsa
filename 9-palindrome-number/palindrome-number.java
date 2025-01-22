class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int temp = 0;

        while(num > 0){
           int r = num %10;
           temp = r + temp *10;
           num = num/10;
        }

        return x == temp;
    }
}