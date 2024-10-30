class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String res = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length();j++){
                if(isPalindrome(s, i, j)){
                    int Len = maxLen;
                    maxLen = Math.max(maxLen,j-i+1);
                    if(maxLen>Len){
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String s, int start, int end){
        // int start=0;
        // int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}