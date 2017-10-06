import java.util.*;

public class LeetCode293 {
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        for(int i=0;i<s.length()-1;i++)
        {
            char[] src = s.toCharArray();
            if(src[i]=='+'&&src[i+1]=='+')
            {
                src[i]='-';src[i+1]='-';
            }
            else
                continue;
            result.add(new String(src));
        }
        return result;
    }
    public static void main(String[] args)
    {
        ArrayPrint.printCharList(generatePossibleNextMoves("++++"));
        ArrayPrint.printCharList(generatePossibleNextMoves("--"));
    }
}
//https://leetcode.com/problems/flip-game/description/
//Time complexity O(n)
