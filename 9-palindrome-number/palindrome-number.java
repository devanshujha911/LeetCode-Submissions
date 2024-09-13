class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int n1 = x;
        while(x>0){
            n = (n*10)+(x%10);
            x = x/10;
        }
        // if(n1<0){
        //     n = -1 *n; 
        // }
        if(n1 == n){
            return true;
        }
        return false;
    }
}