class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer>st=new Stack<>();
        int ans [] = new int[prices.length];
        int j = prices.length-1;
        for(int i=prices.length-1; i>=0;i--){
            while(!st.isEmpty() && prices[i]<st.peek())
            st.pop();
            if(st.isEmpty()){
                ans[j]=prices[i];
                j--;
            }else{
                ans[j]=prices[i]-st.peek();
                j--;
            }
            st.push(prices[i]);

        } return ans;
    }
}