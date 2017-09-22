import java.util.*;

public class LeetCode252 {
    public static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval v1, Interval v2)
            {
                return v1.start-v2.start;
            }
        });

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i].start<intervals[i-1].end)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        Interval[] test1 ={new Interval(0,30), new Interval(5,10), new Interval(15,20)};
        Interval[] test2 ={new Interval(0,4), new Interval(5,10), new Interval(10,11)};
        Interval[] test3 ={new Interval(0,4), new Interval(5,10), new Interval(11,12)};

        System.out.println(canAttendMeetings(test1));//false
        System.out.println(canAttendMeetings(test2));//false
        System.out.println(canAttendMeetings(test3));//true
    }
}

//https://leetcode.com/problems/meeting-rooms/description/
//Time complexity O(nlgn)
