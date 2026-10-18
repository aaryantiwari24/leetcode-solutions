class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length-1;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n]!=arr[n-1]) return arr[n];
        
        int l=0, h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) return arr[mid];
            int f=mid, s=mid;
            if(arr[mid]==arr[mid+1]) s=mid+1;
            else f=mid-1;
            int leftCount=f-l;
            int rightCount=h-s;
            if(leftCount%2==0)l=s+1;
            else h=f-1;
        }
        return 123;
    }
}