class Solution {
    public boolean isHappy(int n) {
        if(n==1||n==7){
            return true;
        }
        if(n<9){
            return false;
        }
        int sum=0;
        int digit;
        while(n>0){
            digit = n%10;
            sum+= digit*digit;
            n/=10;
        }
        return isHappy(sum);
    }
}