import java.util.*;

public class LeetCode454 {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                int sum = A[i]+B[j];
                if(map.containsKey(sum))
                    map.put(sum, map.get(sum)+1);
                else
                    map.put(sum,1);
            }
        }

        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<D.length;j++)
            {
                int sum = (C[i]+D[j])*(-1);
                if(map.containsKey(sum))
                    result+=map.get(sum);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] A = {1,2}; int[] B = {-2,-1}; int[] C = {-1,2}; int[] D ={0,2};
        System.out.println(fourSumCount(A,B,C,D));
    }

    /*
    1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
    2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
     */
}

//https://leetcode.com/problems/4sum-ii/description/
//Time Complexity O(n^2)

