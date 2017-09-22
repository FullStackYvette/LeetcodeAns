import java.util.*;

public class LeetCode13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] src = s.toCharArray();
        int result =0;
        for(int i=0;i<src.length;i++)
        {
            if(i-1>=0 && map.get(src[i])>map.get(src[i-1]))
                result+=map.get(src[i])-2*map.get(src[i-1]);
            else
                result+=map.get(src[i]);
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(romanToInt("DCXXI"));//621
    }
}

//https://leetcode.com/problems/roman-to-integer/description/
//Time complexity O(n)
