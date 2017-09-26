public class LeetCode657 {
    public static boolean judgeCircle(String moves) {
        char[] actionList = moves.toCharArray();
        int x=0;
        int y=0;
        for(int i=0;i<actionList.length;i++)
        {
            switch(actionList[i])
            {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
            }
        }
        return x==0 && y==0;
    }

    public static void main(String[] args)
    {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("UDLR"));
        System.out.println(judgeCircle("UDLRR"));
        System.out.println(judgeCircle("UDLRLRDURL"));
        System.out.println(judgeCircle(""));
    }
}
//https://leetcode.com/problems/judge-route-circle/description/
//Time Complexity O(n)
