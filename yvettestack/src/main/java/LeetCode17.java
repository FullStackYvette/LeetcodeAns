import java.util.*;

public class LeetCode17 {
    public static List<String> letterCombinations(String digits) {
        HashMap<Character,char[]> map = new HashMap<Character, char[]>();

        map.put('2',new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});

        List<String> result = new ArrayList<String>();
        if(digits==null||digits.length()==0)
            return result;
        List<Character> temp= new ArrayList<Character>();
        dfs(result,temp,0, digits,map);
        return result;
    }

    public static void dfs(List<String> result, List<Character> temp, int i, String digits, HashMap<Character,char[]> map)
    {
        if(i==digits.length())
        {
            StringBuilder builder = new StringBuilder();
            for(int j=0;j<temp.size();j++)
                builder.append(temp.get(j));
            result.add(builder.toString());
            temp= new ArrayList<Character>();
            return;
        }
        if(!map.containsKey(digits.charAt(i))) {
            dfs(result, temp, i + 1, digits, map);
        }
        else {
            char[] target = map.get(digits.charAt(i));
            for (int k = 0; k < target.length; k++) {
                temp.add(target[k]);
                dfs(result, temp, i + 1, digits, map);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args)
    {
        List<String> result = letterCombinations("2");
        ArrayPrint.printCharList(result);
        ArrayPrint.printCharList(letterCombinations("23"));
        ArrayPrint.printCharList(letterCombinations("123"));
    }
}

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//Assuming the average number of letters on every number is m, and the length of digits string is n, then the complexity is O(mn).

