class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        // System.out.print(words[0]);
        int left=0;
        int right = words.length-1;
        while(left<right){
            String temp;
            temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            right--;
            left++;
        }
        s="";
        
        for(int i=0; i<words.length;i++){
            s+=words[i]+" ";
        }
        s.trim();
        // System.out.print(words[0]);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==' '&& s.charAt(i+1)==' '){
                
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}