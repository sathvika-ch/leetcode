class Solution {
    public int compress(char[] chars) {
        int i =0;
        int j = 0;
        String str = "";
        int count = 0;
        while(j<chars.length){
                if(chars[i]==chars[j]){
                   count++;
                    j++;
                    
                }else{
                    if(count>1){
                    str +="" + chars[i]+count;}
                    else str +=""+chars[i];
                    count=0;
                    i=j;
                }
        }
                if(count>1){
                        str += ""+chars[i]+count;}
                   else{
                    str +=""+chars[i];
                }for(int k =0;k<str.length();k++){
                    chars[k]=str.charAt(k);
                }
        return str.length();
    }
}