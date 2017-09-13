import java.util.*;

public class LeetCode676 {
    Set<String> sets;

    /** Initialize your data structure here. */
    public LeetCode676 () {
        sets= new HashSet<String>();

    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String str:dict)
        {
            sets.add(str);
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        if(word==null)
            return false;
        char[] src = word.toCharArray();
        for(int i=0;i<src.length;i++)
        {
            char c = src[i];
            for(char j='a';j<='z';j++)
            {
                if(c==j)
                    continue;
                src[i]=j;
                String temp = new String(src);
                if(sets.contains(temp))
                    return true;
            }
            src[i]=c;
        }
        return false;
    }
    
}

//https://leetcode.com/problems/implement-magic-dictionary/description/
/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */