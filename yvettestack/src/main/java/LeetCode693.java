public class LeetCode693 {
    public static boolean hasAlternatingBits(int n) {
        String prev = "";
        while (n > 0)
        {
            String current =  ( (n % 2 ) == 0 ? "0" : "1");
            if(!prev.equals("")&&current.equals(prev))
                return false;
            n = n / 2;
            prev=current;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(10));
        System.out.println(hasAlternatingBits(11));
    }
}
