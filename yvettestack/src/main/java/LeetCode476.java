public class LeetCode476 {
    public static int findComplement(int num) {
        int i=0;
        int j=0;
        while(i<num)
        {
            i+=Math.pow(2,j);
            j++;
        }
        return i-num;
    }

    public static void main(String[] args)
    {
        System.out.println(findComplement(5));
    }
}
//https://leetcode.com/problems/number-complement/description/
//Time Complexity O(n)
