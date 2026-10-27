class Solution {
    public int mySqrt(int x) {
        int l=0,h=x;
        while(l<=h){
            int m=(l+h)/2;
            if((long)m*m==x)return m;
            else if((long)m*m>x)h=m-1;
            else l=m+1;
        }
        return h;
    }
}