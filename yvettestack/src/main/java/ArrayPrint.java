import java.util.List;

public class ArrayPrint {
    public static void printArray(List<List<Integer>> lists)
    {
        for(List l:lists)
        {
            if(l.size()==0)
                continue;
            System.out.print("[");
            for(int i=0;i<l.size()-1;i++)
            {
                System.out.print(l.get(i) +",");
            }
            System.out.println(l.get(l.size()-1)+"]");
        }
    }

    public static void printCharList(List<String> l)
    {
        System.out.print("[");
        for(int i=0;i<l.size()-1;i++)
        {
            System.out.print(l.get(i) +",");
        }
        System.out.println(l.get(l.size()-1)+"]");
    }
}
