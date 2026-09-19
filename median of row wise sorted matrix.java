class Solution {
    public int median(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int i = 0; i < m; i++) {
            l = Math.min(l, mat[i][0]);
            h = Math.max(h, mat[i][n - 1]);
        }

        int required = m * n / 2;

        while (l < h) {

            int mid = l + (h - l) / 2;

            int cnt = 0;

            for (int i = 0; i < m; i++) {
                cnt += UB(mat[i], mid);
            }

            if (cnt <= required) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }

        return l;
    }

    private int UB(int[] arr, int trgt) {

        int low = 0;
        int high = arr.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= trgt) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
