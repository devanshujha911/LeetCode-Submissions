class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

    //     //USING HASHMAP
    //     HashMap<Character, Integer> map1 = new HashMap<>();
    //     for(int i=0; i<s.length(); i++){
    //         if(map1.get(s.charAt(i))==null){
    //             map1.put(s.charAt(i), 1);
    //         }else{
    //             map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
    //         }
            
    //     }
    //     HashMap<Character, Integer> map2 = new HashMap<>();
    //     for(int i=0; i<t.length(); i++){
    //         if(map2.get(t.charAt(i))==null){
    //             map2.put(t.charAt(i), 1);
    //         }else{
    //             map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
    //         }
    //     }
    //     return map1.equals(map2);
    
    //USING CharArray

        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        return Arrays.equals(chs, cht);

    }
}