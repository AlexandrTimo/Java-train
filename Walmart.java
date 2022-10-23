
package Get;

import java.util.HashMap;
import java.util.Map;

public class Walmart{

    public static void main(String[] args) {
    
        HashMap<String, Integer> item = new HashMap<>();
    
        item.put("Nutella", 12);
        item.put("IceCream", 4);
        item.put("Nuts", 123);
        item.put("Coca Cola", 14);

        //System.out.println(item);
        //System.out.println(item.get("Nuts"));

        // Task:
        // run for loop in hashMap
        // run if amount of item less than x or equal x then print count and name of items
        
        for (Map.Entry<String, Integer> i: item.entrySet()){
            if (i.getValue() <= 20){
                System.out.println("--------------");
                System.out.println("Item - " + i.getKey() + " - is required filling up the palletes");
                System.out.println("Current amount of item : " + i.getValue());
            }
            else {
                System.out.println("--------------");
                System.out.println("Item - " + i.getKey() + " - not required new palletes");
            }
        }    
    }
}