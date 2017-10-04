import java.util.*;

public class LeetCode690 {
    public static int getImportance(List<Employee> employees, int id) {
        if(employees.size()==0)
            return 0;
        HashMap<Integer,Integer> importance= new HashMap<Integer, Integer>();
        HashMap<Integer,List<Integer>> sub = new HashMap<Integer,List<Integer>>();

        for(Employee e:employees)
        {
            importance.put(e.id,e.importance);
            sub.put(e.id,e.subordinates);
        }
        if(!importance.containsKey(id))
            return 0;
        return getVal(importance,sub,id);
    }

    public static int getVal(HashMap<Integer,Integer> importance,HashMap<Integer,List<Integer>> sub,int id)
    {
        int total=importance.get(id);
        List<Integer> temp = sub.get(id);
        if(temp.size()==0)
            return total;
        for(int subord:temp)
        {
            total+=getVal(importance,sub,subord);
        }
        return total;
    }

    public static void main(String[] args)
    {
        Employee a = new Employee(1,5);
        Employee b = new Employee(2,3);
        Employee c = new Employee(3,3);
        List<Integer> sub1 = new ArrayList<Integer>();
        sub1.add(2);
        sub1.add(3);
        a.subordinates=sub1;
        b.subordinates=new ArrayList<Integer>();
        c.subordinates=new ArrayList<Integer>();
        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        System.out.println(getImportance(list1,1));

        Employee d = new Employee(1,15);
        Employee e = new Employee(2,10);
        Employee f = new Employee(3,5);
        List<Integer> sub2 = new ArrayList<Integer>();
        sub2.add(2);
        List<Integer> sub3 = new ArrayList<Integer>();
        sub2.add(3);
        d.subordinates=sub2;
        e.subordinates=sub3;
        f.subordinates=new ArrayList<Integer>();
        List<Employee> list2 = new ArrayList<Employee>();
        list2.add(d);
        list2.add(e);
        list2.add(f);
        System.out.println(getImportance(list2,1));
    }
}
//https://leetcode.com/problems/employee-importance/description/
