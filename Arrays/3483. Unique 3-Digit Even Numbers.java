// 3483. Unique 3-Digit Even Numbers
class Solution {
    public int totalNumbers(int[] digits) {
        
        int[] freq = new int[10];
        for(int i : digits){
            freq[i]++;
        }
        int count = 0;
        
        for(int i=100;i<999;i+=2){
            int f1 = i%10;
            int f2 = (i/10)%10;
            int f3 = (i/100)%10;

            if(f1==f2 && f2==f3){
                if(freq[f1]>=3){
                    count++;
                }
            }
            else if(f1==f2){
                if(freq[f1]>=2 && freq[f3]>=1){
                    count++;
                }
            }
            else if(f1==f3){
                if(freq[f1]>=2 && freq[f2]>=1){
                    count++;
                }
            }
            else if(f2==f3){
                if(freq[f2]>=2 && freq[f1]>=1){
                    count++;
                }
            }
            else{
                if(freq[f1]>=1 && freq[f2]>=1 && freq[f3]>=1){
                    count++;
                }
            }
        }
        return count;
    }
}
