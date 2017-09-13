public class LeetCode661 {
    public static int[][] imageSmoother(int[][] M) {
        int[][] p = new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[0].length;j++)
            {
                int result=M[i][j];
                int count=1;
                if(i-1>=0)
                {
                    result+=M[i-1][j];
                    count++;
                }
                if(i-1>=0&&j-1>=0)
                {
                    result+=M[i-1][j-1];
                    count++;
                }
                if(i-1>=0&&j+1<M[0].length)
                {
                    result+=M[i-1][j+1];
                    count++;
                }
                if(j-1>=0)
                {
                    result+=M[i][j-1];
                    count++;
                }
                if(j+1<M[0].length)
                {
                    result+=M[i][j+1];
                    count++;
                }
                if(i+1<M.length&&j-1>=0)
                {
                    result+=M[i+1][j-1];
                    count++;
                }
                if(i+1<M.length)
                {
                    result+=M[i+1][j];
                    count++;
                }
                if(i+1<M.length&&j+1<M[0].length)
                {
                    result+=M[i+1][j+1];
                    count++;
                }
                p[i][j]=result/count;
            }
        }
        return p;
    }

    public static void main(String[] args)
    {
        int[][] test1 = {{1,1,1},{1,0,1},{1,1,1}};
        printArray(imageSmoother(test1));

        int[][] test2 = {{0,0,0},{0,0,0},{0,0,0}};
        printArray(imageSmoother(test2));

        int[][] test3 = {{1,1,1},{1,1,1},{1,1,1}};
        printArray(imageSmoother(test3));
    }

    private static void printArray(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("[");
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+",");
            }
            System.out.print(arr[i][arr[0].length-1]+"]\n");
        }
        System.out.println();
    }
}

//https://leetcode.com/problems/image-smoother/description/
//Time Complexity O(n^2)
