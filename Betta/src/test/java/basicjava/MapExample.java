package basicjava;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(05,"Adwita");
        m.put(20,"Akshara");
        System.out.println(m);
        System.out.println(m.get(20));

        for(Map.Entry h:m.entrySet()){

            System.out.println(h.getKey());
            System.out.println(h.getValue());

            if(h.getValue().equals("05")){
           h.getValue();
           }
        }
    }
}
