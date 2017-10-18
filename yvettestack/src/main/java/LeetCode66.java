public class LeetCode66 {
    public static int[] plusOne(int[] digits) {
        int carry =1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int val = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i]=val;
        }
        if(carry==0)
            return digits;
        else
        {
            int[] result = new int[digits.length+1];
            result[0]=1;
            for(int i=1;i<=digits.length;i++)
                result[i]=digits[i-1];
            return result;
        }
    }

    public static void main(String[] args)
    {
        int[] test1={9,9};
        int[] test2={9,9,8};
        ArrayPrint.printIntArray(plusOne(test1));
        ArrayPrint.printIntArray(plusOne(test2));
    }
}
