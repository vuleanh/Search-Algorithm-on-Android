package com.anhvu.search;

import static android.R.attr.value;

/**
 * Created by leanh on 6/10/17.
 */

public class SearchUtil {

    /**
     * Linear Search
     * <p>
     * Don't require the collection to be sorted
     * For small set of data
     *
     * @param array
     * @param target
     * @return
     * <p>
     * Best case: O(1)
     * - target is at the beginning of the array
     * Worst case: O(n)
     * - target is at the end of the array
     * - target not found
     */
    public static int linearSearch(int[] array, int target) {
        if (array.length < 1) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Binary Search
     * <p>
     * data collection have to be sorted
     *
     * @param array  sorted array
     * @param target
     * @return
     */
    public static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = (int) Math.floor(start + end / 2);
        int midValue = array[middle];
        
        if (target < midValue) binarySearch(array, target, start, middle - 1);
        if (target > midValue) binarySearch(array, target, middle + 1, end);

        return  middle;
    }



}
