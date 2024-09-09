class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // s = s.trim();
        s = s.replace(" ","");
        int start = 0;
        int last = s.length() - 1;


        while(start<last){
            if(!isAlphaNumeric(s.charAt(start))){
                start++;
            }else if(!isAlphaNumeric(s.charAt(last))){
                last--;
            }           
            else{
                if(s.charAt(start)==s.charAt(last)){
                    start++;
                    last--;
                }
                else{
                    return false;
                } 
            }  
        }
        return true;
    }

    public boolean isAlphaNumeric(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }
}