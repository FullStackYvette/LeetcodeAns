import java.util.*;

public class LeetCode346 {
    int[] arr;

    /** Initialize your data structure here. */
    public void MovingAverage(int size) {
        arr = new int[size];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public double next(int val) {
        int count =0;
        int size = arr.length;
        int result=0;
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
            if(arr[i]!=Integer.MIN_VALUE)
            {
                count++;
                result = result + arr[i];
            }
        }
        arr[size-1]= val;
        result=result+val;
        count++;
        return (double)result/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
//https://leetcode.com/problems/moving-average-from-data-stream/description/
