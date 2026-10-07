class Solution {
    public String compressedString(String s) {
        int i =0;
        int j =0;
        String str ="";
        String ans = "";
        int c=0;
        while(j<s.length()){
        if(s.charAt(i)==s.charAt(j) && c!=9){
            c++;
            j++;
        }
       else{
            ans+=""+c+s.charAt(i);
            c=0;
            i=j;
        }
        }ans += ""+c+s.charAt(i);
        return ans;
        
    }
}