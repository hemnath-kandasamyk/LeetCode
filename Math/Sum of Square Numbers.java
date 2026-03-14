class Solution {
    public boolean judgeSquareSum(int c) {
        int hem=0,kar=(int)Math.sqrt(c);
        while(hem<=kar){
            long sum=(long)(hem*hem)+(long)(kar*kar);
            if(sum==c)return true;
            else if(sum>c)kar--;
            else hem++;
        }
        return false;
    }
}
