class Solution {
    public void sortColors(int[] arr) {
        int z=0, o=0, t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) z++;
            else if(arr[i]==1) o++;
            else if(arr[i]==2) t++;
       }
       for(int i=0;i<arr.length;i++){
        if(i<z)arr[i]=0;
        else if(i<o+z)arr[i]=1;
        else arr[i]=2;
       }
    }
}