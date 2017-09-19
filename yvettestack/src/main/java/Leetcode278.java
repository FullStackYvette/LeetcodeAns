public class Leetcode278 {
    static boolean[] badVersion={true,true,false,false,false,false};
    public static int firstBadVersion(int n) {
        if(n==1)
            return 1;
        int start=1;
        int end=n;
        while(start+1<end)
        {
            int mid =start+(end-start)/2;
            if(isBadVersion(mid))
            {
                start=mid+1;
            }
            else
                end=start-1;
        }
        if(isBadVersion(start))
            return start;
        else
            return end;
    }

    public static boolean isBadVersion(int i)
    {
        return badVersion[i-1];
    }

    public static void main(String[] args)
    {
        System.out.println(firstBadVersion(6));
    }


}
