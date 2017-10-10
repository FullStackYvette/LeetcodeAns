public class LeetCode243 {
    public static int shortestDistance(String[] words, String word1, String word2) {
        int shortDistance = Integer.MAX_VALUE;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(word1))
                index1 = i;
            else if(words[i].equals(word2))
                index2 = i;
            if(index1!=-1 && index2!=-1)
                shortDistance = Math.min(shortDistance,Math.abs(index1-index2));
        }
        return shortDistance;
    }

    public static void main(String[] args)
    {
        String[] test1 = {"practice", "makes", "perfect", "coding", "makes"};
        String[] test2 = {"a","b"};

        System.out.println(shortestDistance(test1,"coding","practice"));
        System.out.println(shortestDistance(test1,"coding","makes"));
        System.out.println(shortestDistance(test2,"a","b"));
    }
}
//https://leetcode.com/problems/shortest-word-distance/description/
//Time Complexity O(n)
