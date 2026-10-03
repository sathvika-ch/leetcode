class Solution {
    public int minAddToMakeValid(String s) {
        int i =0;
        int j =0;
        for(int k=0; k<s.length() ;k++){
            char ch =s.charAt(k);
            if (ch == '('){
                i++;
            }else{
                if(i>0){
                    i--;
                }else{
                    j++;
                }
            }
        }
        return j+i;
    }
}