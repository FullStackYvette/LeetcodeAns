import java.util.Comparator;
import java.util.*;

public class LeetCode253 {
    public static int minMeetingRooms(Interval[] intervals) {
        if(intervals==null||intervals.length==0) // because of queue.add function, need to have null and 0 check
            return 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start-i2.start;
            }
        });

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(intervals[0].end);

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i].start>=queue.peek())//since the start is greater than the previous end, so its end is definitely greater than the end
            {
                queue.poll();
            }

            queue.offer(intervals[i].end); // you need to keep the conflict rooms in the queue
        }
        return queue.size();
    }

    public static void main(String[] args)
    {
        //[[0, 30],[5, 10],[15, 20]]
        Interval[] test1 ={new Interval(0,30), new Interval(5,10), new Interval(15,20)};
        Interval[] test2 ={new Interval(0,4), new Interval(5,10), new Interval(10,11)};
        Interval[] test3 ={new Interval(0,4), new Interval(5,10), new Interval(11,12)};

        System.out.println(minMeetingRooms(test1)); //2
        System.out.println(minMeetingRooms(test2)); //1
        System.out.println(minMeetingRooms(test3)); //1
    }
}
//https://leetcode.com/problems/meeting-rooms-ii/description/
//Time complexity O(nlgn)
