public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        //System.out.println(div);
        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-101));
        System.out.println(isPalindrome(3223));
        System.out.println(isPalindrome(13223));
        System.out.println(isPalindrome(1000001));
        System.out.println(isPalindrome(100010001));
    }
}
