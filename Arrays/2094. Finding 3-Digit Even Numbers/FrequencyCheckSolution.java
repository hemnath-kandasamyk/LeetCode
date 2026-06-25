class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        int[] freq = new int[10];
        boolean[] isnumber=new boolean[1001];
        for(int i=0;i<digits.length;i++){
            if(digits[i]%2==0){
                freq[digits[i]]=Math.min(3,freq[digits[i]]+1);
            }
            else{
                freq[digits[i]]=Math.min(2,freq[digits[i]]+1);
            }
        }
        int count=0;
        for(int i=100;i<1000;i=i+2){
            int[] tempfreq= new int[10];
            int num=i;
            while(num!=0){
                int rem=num%10;
                tempfreq[rem]++;
                num/=10;
            }
            boolean flag=true;
            for(int j=0;j<10;j++){ 
              if(tempfreq[j]>freq[j]){
                flag=false;
                break;
              }
            }
            if(flag){
                isnumber[i]=true;
                count++;
            } 
        }
        int res[] = new int[count];
        int idx=0;
        for(int i=100;i<1000;i=i+1){
             if(isnumber[i]){
                res[idx++]=i;
             }
        }
        return res;
    }
}
