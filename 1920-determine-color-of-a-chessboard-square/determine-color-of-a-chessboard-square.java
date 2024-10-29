class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int number = (int)coordinates.charAt(1);
        if(letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g'){
            if(number % 2 == 0){
                return true;
            }return false;
        }
        if(letter == 'b' || letter == 'd' || letter == 'f' || letter == 'h'){
            if(number % 2 != 0){
                return true;
            }return false;
        }
        return false;
    }
}