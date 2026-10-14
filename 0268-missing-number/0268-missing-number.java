class Solution {
    public int missingNumber(int[] arr) {
        int n= arr.length;
        int sum=n*(n+1)/2;
        int arraysum=0;
        for(int e : arr){
            arraysum+=e;
        }
        return sum - arraysum;
    }
}