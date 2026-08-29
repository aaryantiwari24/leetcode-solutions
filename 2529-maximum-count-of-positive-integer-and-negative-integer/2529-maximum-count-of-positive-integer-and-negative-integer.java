class Solution {
    public int maximumCount(int[] arr) {
        
        int n = arr.length;
        int l = 0, h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (arr[m] < 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        int negativeCount = l;
        l = 0;
        h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] <= 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        int positiveCount = n - l;
        return Math.max(negativeCount, positiveCount);
    }
}