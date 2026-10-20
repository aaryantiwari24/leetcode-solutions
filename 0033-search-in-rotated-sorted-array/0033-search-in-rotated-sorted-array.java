class Solution {
    public int search(int[] arr, int target) {
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int m=lo+(hi-lo)/2;
            if(target==arr[m]) return m;
            if(arr[m]>=arr[lo]){
                if(arr[lo]<=target && arr[m]>target) hi=m-1;
                else lo=m+1;
            }
            else{
                if(arr[hi]>=target && arr[m]<target) lo=m+1;
                else hi=m-1;
            }
        }
        return -1;
    }
}