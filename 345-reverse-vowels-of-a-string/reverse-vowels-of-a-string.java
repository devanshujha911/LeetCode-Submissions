class Solution {
    public String reverseVowels(String s) {
        // s=s.toLowerCase();
        char[] word = s.toCharArray();
        // String s1;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while((s.charAt(start)!='a'&& s.charAt(start)!='i'&& s.charAt(start)!='e'&& s.charAt(start)!='u'&& s.charAt(start)!='o') && (start<end)&&s.charAt(start)!='A'&& s.charAt(start)!='E'&& s.charAt(start)!='I'&& s.charAt(start)!='O'&& s.charAt(start)!='U'){
                start++;
            }
            while((s.charAt(end)!='a'&& s.charAt(end)!='i'&&s.charAt(end)!='e'&&s.charAt(end)!='u'&&s.charAt(end)!='o') && start<end && s.charAt(end)!='A'&& s.charAt(end)!='E'&&s.charAt(end)!='I'&&s.charAt(end)!='O'&& s.charAt(end)!='U'){
                end--;
            }
            char temp =word[start];
            word[start]=word[end];
            word[end]=temp;

            start++;
            end--;
        }

        String answer = new String(word);
        return answer;
    }

    // public String reverseString(String s){
    //     for(int i=0; i<=s.length()/2; i++){
    //         char temp = s.charAt(i);
    //         s.charAt(i)=s.charAt(s.length()-i);
    //         s.charAt(s.length()-i)=temp;
    //     }
    //     return s;
    // }
}