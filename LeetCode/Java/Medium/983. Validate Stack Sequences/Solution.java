class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       int[] stack = new int[pushed.length];
       int top = -1;
       int j = 0;
       for(int i = 0; i < pushed.length; i++){
        stack[++top] = pushed[i];
        while(top >= 0 && stack[top] == popped[j]){
            top--;
            j++;
        }
       } 
       return top == -1;
    }
}