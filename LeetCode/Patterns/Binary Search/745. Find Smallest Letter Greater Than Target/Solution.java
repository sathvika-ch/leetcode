class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len =letters.length-1;
        for(int i=0;i<len;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }return letters[0];
    }
}