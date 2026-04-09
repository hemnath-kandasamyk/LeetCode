class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack=new Stack<>();
       for(String s:tokens){
        if(s.equals("+")){
            int prev1=stack.pop();
            int prev2=stack.pop();
            stack.push(prev1+prev2);
        }
        else if(s.equals("-")){
            int prev1=stack.pop();
            int prev2=stack.pop();
            stack.push(prev2-prev1);
        }
        else if(s.equals("*")){
            int prev1=stack.pop();
            int prev2=stack.pop();
            stack.push(prev2*prev1);
        }
        else if(s.equals("/")){
            int prev1=stack.pop();
            int prev2=stack.pop();
            stack.push(prev2/prev1);
        }
        else{
            stack.push(Integer.parseInt(s));
        }
       }
       return stack.peek(); 
    }
}
