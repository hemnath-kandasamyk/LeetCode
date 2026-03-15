class Solution {
    public int[] asteroidCollision(int[] a) {
       Stack<Integer> stack=new Stack<>();
       for(int i=0;i<a.length;i++){
        if(a[i]>0){
            stack.push(a[i]);
        }
        else{
            int val=-a[i];
            while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<val){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()==val){
                stack.pop();
                continue;
            }
            if(stack.isEmpty() || stack.peek()<0 ){
                stack.push(a[i]);
            }
        }
       } 
       int[] result=new int[stack.size()];
       for(int i=result.length-1;i>=0;i--){
        result[i]=stack.pop();
       }
       return result;
    }
}
