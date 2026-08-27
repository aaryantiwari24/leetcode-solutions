class Solution {
    public boolean isPalindrome(int x) {
        int l;
        int n = x;
        int r=0;
        while(n>0){
            l=n%10;
            r=r*10+l;
            n=n/10;
        }
        if(x==r){
            return true;
        }
        else{
            return false;
        }
    }
}