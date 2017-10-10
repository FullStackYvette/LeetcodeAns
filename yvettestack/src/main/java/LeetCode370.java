public class LeetCode370 {
    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for(int i=0;i<updates.length;i++)
        {
            int start=updates[i][0];
            int end=updates[i][1];
            for(int j=start;j<=end;j++)
                result[j]+=updates[i][2];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int length=5;
        int[][] updates= {{1,  3,  2}, {2,  4,  3}, {0,  2, -2}};
        ArrayPrint.printIntArray(getModifiedArray(length,updates));
    }
}
//https://leetcode.com/problems/range-addition/description/
