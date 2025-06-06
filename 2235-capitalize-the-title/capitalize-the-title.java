class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        // for(int i=0; i<title.length()-1; i++){
        //     if(title.charAt(i) == ' '){
        //         title.charAt(i+1) = Character.toUpperCase(title.charAt(i+1));
        //     }
        // }
        // title.charAt(0) = 'A';

        StringBuilder str = new StringBuilder();
        String[] arr = title.split(" ");
        for(String s:arr){
            if(s.length()<=2){
                str.append(s.toLowerCase()+" ");
            }else{
                str.append(s.substring(0, 1).toUpperCase());
                str.append(s.substring(1).toLowerCase()+" ");
            }
        }
        return str.toString().trim();
    }
}