import java.util.*;

public class HashmapsEg {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
    
        //insertion
        map.put("India", 120);
        map.put("Us", 30);
        System.out.println(map);

        map.put("India", 150);
        System.out.println(map);
        
        System.out.println(map.containsKey("India"));
        System.out.println(map.get("India"));

        // Iterating over the map entries
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("India");
    }
}
