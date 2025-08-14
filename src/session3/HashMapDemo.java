package session3;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        Map<String,Object> hasMap=new HashMap<String,Object>();
        hasMap.put("age", 30);
        hasMap.put("marks", 80);
        hasMap.put("salary", 70000);

        for (Map.Entry<String,Object> map : hasMap.entrySet())
        {
            System.out.println(map.getKey());
        }
    }
}
