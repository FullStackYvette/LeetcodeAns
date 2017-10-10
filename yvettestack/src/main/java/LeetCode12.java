public class LeetCode12 {
    public static String intToRoman(int num) {
        int[] weight= new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();
        while(num>0)
        {
            for(int i=0;i<weight.length;i++)
            {
                int time = num/weight[i];
                for(int j=0;j<time;j++)
                {
                    builder.append(symbol[i]);
                }
                num=num-time*weight[i];
            }
        }
        return builder.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(intToRoman(900));
    }
}
//https://leetcode.com/problems/integer-to-roman/description/