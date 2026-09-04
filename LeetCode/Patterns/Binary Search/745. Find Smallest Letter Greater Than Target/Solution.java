class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        if (letters[high]<=target){
            return letters[0];
        }while(low<high){
            int mid = low +(high-low)/2;
            if(letters[mid]>target){
                high = mid;
            }else {
                low = mid +1;
            }
        }return letters[low];
    }
}