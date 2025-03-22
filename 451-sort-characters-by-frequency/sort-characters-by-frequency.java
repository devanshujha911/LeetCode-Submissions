class Solution {
    public String frequencySort(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<c.length; i++){
            map.put(c[i], map.getOrDefault(c[i],0)+1);
        }
        List<Character> sortedChars = new ArrayList<>(map.keySet());
        Collections.sort(sortedChars, (a, b) -> map.get(b) - map.get(a));
        StringBuilder result = new StringBuilder();
        for(char i:sortedChars){
            result.append(String.valueOf(i).repeat(map.get(i)));
        }
        return result.toString();
    }
}