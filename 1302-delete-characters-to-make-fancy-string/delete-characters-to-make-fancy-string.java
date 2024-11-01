class Solution {
    public String makeFancyString(String s) {
        if(s.length()==2 || s.length()==1 || s.length()==0){
            return s;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length()-2; i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
                
            }else{
                str.append(s.charAt(i));
            }
            
        }
        str.append(s.charAt(s.length()-2));
        str.append(s.charAt(s.length()-1));
        return str.toString();
    }
}