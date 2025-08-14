package session3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortingInJava 
{
    public static void main(String[] args)
    {
        List<Integer> num =new ArrayList<Integer>();
        num.add(102);
        num.add(80);
        num.add(68);

        Collections.sort(num);
        System.out.println(num);

        System.out.println("-------- Sorting of ArrayList by the help of Comparator Interface Using Anonymous Inner class -------");
        Comparator<Integer> comp = new Comparator<>()
        {
            @Override
            public int compare(Integer i1, Integer i2)
            {
                //logic for Ascending-Order
                if (i1%10>i2%10) 
                {
                    return 1;
                }
                else if (i1%10<i2%10) 
                {
                   return -1; 
                }
                else
                return 0;
            }
        };
        Collections.sort(num, comp);
        System.out.println(num);

        System.out.println("-------- Sorting of ArrayList by the help of Comparator Interface Using Lambda Expression -------");
        Comparator<Integer> comp1 =( o1, o2) ->{
            if (o1>o2)
                return 1;
            else if (o1<o2) 
            {
                return -1;   
            }
            else
            return 0;
        };

        Collections.sort(num, comp1);
        System.out.println(num);
    }
}
