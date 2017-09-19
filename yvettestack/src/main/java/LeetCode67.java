public class LeetCode67 {
    public static String addBinary(String a, String b) {
        char[] src1= a.toCharArray();
        char[] src2=b.toCharArray();
        int i = src1.length-1;
        int j = src2.length-1;
        int carry=0;
        StringBuilder builder = new StringBuilder();
        while(i>=0||j>=0)
        {
            int val=0;
            if(i>=0) {
                val += Character.getNumericValue(src1[i]);
                i--;
            }
            if(j>=0) {
                val += Character.getNumericValue(src2[j]);
                j--;
            }
            val+=carry;
            builder.append(val%2);
            carry=val/2;
        }
        if(carry==1)
            builder.append("1");
        return builder.reverse().toString();
    }

    public static void main(String[] args)
    {
        String str1= "111";
        String str2="10";
        System.out.println(addBinary(str1,str2));//1001

        String str3= "111";
        String str4="11";
        System.out.println(addBinary(str3,str4));//1010
    }
}
//https://leetcode.com/problems/add-binary/description/
//O(m+n)
