import java.util.*;

public class LeetCode20 {
    public static boolean isValid(String s) {
        char[] src= s.toCharArray();
        Stack<Character> sta= new Stack<Character>();
        for(char c:src)
        {
            if(c=='('||c=='{'||c=='[')
                sta.push(c);
            else if(!sta.isEmpty() && c==')' && sta.peek()=='('
                    || !sta.isEmpty() && c==']' && sta.peek()=='['
                    || !sta.isEmpty() && c=='}' && sta.peek() == '{')
                sta.pop();
            else
                return false;
        }
        return sta.isEmpty();
    }

    public static void main(String args[])
    {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("("));
        System.out.println(isValid(")"));
    }
}
