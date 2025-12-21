class Solution {
    public int reverse(int x) {
        // int original=x;
       
        long rev=0;
        while(x!=0)
        {
            int ld=x%10;
            
            x=x/10;
            rev=rev*10+ld;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE )
        {
            return 0;
        }
        return (int) rev;
    }
}