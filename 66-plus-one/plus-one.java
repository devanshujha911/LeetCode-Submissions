class Solution {
    public int[] plusOne(int[] digits) {
        // digits[digits.length-1] = digits[digits.length-1]+1;
        // if(digits[digits.length-1]>9){
        //     int n = digits[digits.length-1];
        //     int temp1, temp2;
        //     int[] arr1 = new int[digits.length+1];
        //     int i;
        //     for(i=0; i<arr1.length-2; i++){
        //         arr1[i]=digits[i];
        //     }
        //     while(n>0){
        //         arr1[i]=n%10;
        //         i++;
        //         n=n/10;
        //     }
        //     int temp = arr1[i-1];
        //     arr1[i-1]= arr1[i-2];
        //     arr1[i-2]=temp;
        //     return arr1;
        // }
        // return digits;



        // long num=0;
        // for(int i=0; i<digits.length; i++){
        //     num = num*10l + digits[i];
        // }
        // num++;
        // long num1=0;
        // while(num>0){
        //     num1 = num1*10l+ num%10l;
        //     num=num/10l;
        // }
        // int i=0, n;
        // if(digits[digits.length-1]>=5 && digits[0]==9){
        //     n=digits.length+1;
        // }else{
        //     n=digits.length;
        // }
        // int[] x = new int[n];
        // while(num1>0l){
        //     x[i]=num1%10l;
        //     num1=num1/10l;
        //     i++;
        // }
        // return x;

        for (int i = digits.length - 1; i >=0; i--) {
        if (digits[i] != 9) {
            digits[i]++;
            break;
        } else {
            digits[i] = 0;
        }
    }
    if (digits[0] == 0) {
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
    return digits;
    }
}