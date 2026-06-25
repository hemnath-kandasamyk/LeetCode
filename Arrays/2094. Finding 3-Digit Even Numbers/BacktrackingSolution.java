class Solution {

    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    int n;

    public int[] findEvenNumbers(int[] digits) {
        n=digits.length;
        visited= new boolean[n];
        int[] freq = new int[10];

        for(int i=0;i<n;i++){
            if(digits[i]%2==0){
                freq[digits[i]]=Math.min(3,freq[digits[i]]+1);
            }
            else{
                freq[digits[i]]=Math.min(2,freq[digits[i]]+1);
            }
        }
        int count=0;
        for(int i : freq){
            count+=i;
        }
        int[] newdigits = new int[count];
        int index=0;
        for(int i=0;i<10;i++){
            while(freq[i]!=0){
                newdigits[index++]=i;
                freq[i]--;
            }
        }
         backtrack(0,newdigits);

        int[] res = new int[set.size()];

        int idx=0;
        for(int i =100;i<1000;i++){
            if(set.contains(i)){
                res[idx++]=i;
            }
        }
        return res;

    }

    public void backtrack(int num,int[] a){
        int digit =(int)Math.log10(num) +1;
        
        if(digit==3 && num%2==0){
            set.add(num);
            return;
        }
        if(digit>=3){
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!visited[i]){
                num=(num*10)+a[i];
                visited[i]=true;
                backtrack(num,a);
                num/=10;
                visited[i]=false; 
            }
        }
    }
}
