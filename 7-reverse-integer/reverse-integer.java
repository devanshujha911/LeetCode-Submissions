class Solution {
    public int reverse(int x) {
        // int num=0;
        // boolean pos = true;
        // if(x<0){
        //     pos = false;
        //     x = x * -1;
        // }
        // int rem;
        // int prevNum=0;
        // while(x>0){
        //     rem = x%10;
        //     num = num *10 + rem;
        //     if((num-x%10)/10!=prevNum){
        //         return 0;
        //     }
        //     prevNum = num;
        //     x/=10;
            
        // }
        // if(!pos){
        //     return num*(-1);
        // }
        // return num;

        long rev=0;
        while(x!=0){
            rev = rev*10 + (x%10);
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}