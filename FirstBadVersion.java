/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution {
    public int firstBadVersion(int n) {
        int r = -1;
        int start = 1;
        int end = n;
        while (start <= end) {
            Long midLong = (Long.valueOf(start) + Long.valueOf(end)) / 2;
            int mid = midLong.intValue();
            if (isBadVersion(mid)) {
                if (r == -1) {
                    r = mid;
                } else if (mid < r) {
                    r = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (r == -1) {
            return n;
        } else {
            return r;
        }
    }
}
