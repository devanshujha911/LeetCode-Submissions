class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] c1 = pattern.toCharArray();
        String[] s1 = s.split(" ");

        if(c1.length!=s1.length){
            return false;
        }
        
        HashMap<String, Character> map = new HashMap<>();
        HashMap<Character, String> map1 = new HashMap<>();
        for(int i=0; i<s1.length; i++){
            if(!map.containsKey(s1[i])){
                map.put(s1[i], c1[i]);
            }
            if(!map1.containsKey(c1[i])){
                map1.put(c1[i], s1[i]);
            }
            if(!map.get(s1[i]).equals(c1[i]) || !map1.get(c1[i]).equals(s1[i])){
                return false;
            }
        }
        return true;
    }
}