class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
            st.pop();
            }
            if(st.isEmpty()) al.add(-1);
            else al.add(st.peek());
            st.push(arr[i]);
            }
            Collections.reverse(al);
            return al;
        } 
    }
