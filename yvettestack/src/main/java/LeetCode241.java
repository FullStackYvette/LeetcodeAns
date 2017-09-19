import java.util.*;

public class LeetCode241 {
    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<input.length();i++)
        {
            char c= input.charAt(i);
            if(c=='+'||c=='-'||c=='*')
            {
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(int l: left)
                {
                    for(int r: right)
                    {
                        if(c=='+')
                            result.add(l+r);
                        else if (c=='-')
                            result.add(l-r);
                        else if(c=='*')
                            result.add(l*r);
                    }
                }
            }
        }
        if (result.size() == 0) result.add(Integer.parseInt(input));
        return result;
    }

    public static void main(String[] args)
    {
        String test1 = "2-1-1";
        System.out.println(Arrays.toString(diffWaysToCompute(test1).toArray()));

        String test2 = "2*3-4*5";
        System.out.println(Arrays.toString(diffWaysToCompute(test2).toArray()));
    }


}
