class Solution {
    public int numDifferentIntegers(String word) {
        int start =0, end=word.length();
        Set<String> set = new HashSet<>();
        while(start<word.length()){
            if(Character.isDigit(word.charAt(start))){
                end = start;
                while(end<word.length() && Character.isDigit(word.charAt(end))){
                    end++;
                }
                while(start<end && word.charAt(start)=='0'){
                    start++;
                }
                set.add(word.substring(start, end));
                start = end;
            }else{
                start++;
            }
        }
        return set.size();
    }
}