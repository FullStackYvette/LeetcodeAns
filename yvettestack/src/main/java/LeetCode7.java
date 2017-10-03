public class LeetCode7 {
    public static int reverse(int x) {
        boolean flag=false;
        if(x<0)
        {
            flag=true;
            x=-x;
        }
        double result=0;
        while(x!=0)
        {
            result=result*10+x%10;
            x=x/10;
        }
        if(flag)
        {
            result=-result;
        }
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)
            return 0;
        return (int)result;
    }
    public static void main(String[] args)
    {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));
    }
}
