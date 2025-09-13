//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping 
//intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.
//You can return the intervals in any order.

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse and merge
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                // Overlapping → extend the end
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // No overlap → add as new interval
                current = interval;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output:
        // [1, 6]
        // [8, 10]
        // [15, 18]
    }
}
