class Solution {
    public String decodeString(String s) {
        Stack<Integer> numb=new Stack<>();
        Stack<Character> cha=new Stack<>();
        int k=0;
        for(char i:s.toCharArray()){
            if(i>='0'  && i<='9'){
                k=(k*10)+(int)(i-'0');
            }
            else if(i=='['){
                numb.push(k);
                k=0;
                cha.push(i);
            }
            else if(i!=']'){
                cha.push(i);
            }
            else{
                ArrayList<Character> temp=new ArrayList<>();
                while(!cha.isEmpty() && cha.peek()!='['){
                    temp.add(0,cha.pop());
                }
                cha.pop();
                int val=numb.pop();
                int size=temp.size();
                while(val>1){
                    for (int j=0;j<size;j++){
                       temp.add(temp.get(j));
                    }
                     val--;
                }
                for(char j:temp){
                    cha.push(j);
                }
            }
        }
        char[] ans=new char[cha.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=cha.pop();
        }
        return new String(ans);  
    }
}
