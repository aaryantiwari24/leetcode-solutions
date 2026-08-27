class Solution {
    public int[] searchRange(int[] arr, int t) {
        int l=0,h=arr.length-1,idx=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]>t)h=m-1;
            else if(arr[m]<t)l=m+1;
            else{
                idx=m;
                h=m-1;
            }
        }
        l=0;
        h=arr.length-1;
        int idx2=-1;
        while(l<=h){
             int m=(l+h)/2;
            if(arr[m]>t)h=m-1;
            else if(arr[m]<t)l=m+1;
            else{
                idx2=m;
                l=m+1;
            }
        }
        return new int[]{idx,idx2};
    }
}