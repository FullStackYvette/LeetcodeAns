import java.util.*;

public class LeetCode244 {

        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();

        public LeetCode244(String[] words) {
            for(int i=0;i<words.length;i++)
            {
                if(map.containsKey(words[i]))
                    map.get(words[i]).add(i);
                else
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    map.put(words[i],list);
                }
            }

        }

        public int shortest(String word1, String word2) {
            List<Integer> list1 = map.get(word1);
            List<Integer> list2 = map.get(word2);
            int minLen = Integer.MAX_VALUE;
            for(int i=0;i<list1.size();i++)
            {
                int a = list1.get(i);
                for(int j=0;j<list2.size();j++)
                {
                    int b= list2.get(j);
                    minLen=Math.min(minLen,Math.abs(a-b));
                }
            }
            return minLen;
        }
}
//https://leetcode.com/problems/shortest-word-distance-ii/description/
