package basicjava;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(35);
        l.add(45);
        l.add(60);
        System.out.println(l);
        l.add(90);
        System.out.println(l);
        l.add(120);
        System.out.println(l);
        l.add(120);
        l.add(120);
        System.out.println(l);

        for(Integer q:l){

            System.out.println(q);
        }


        List<String> s = new ArrayList<>();
        s.add("Sangee");
        s.add("Akshara");
        s.add("Adwita");

        for(String m:s){

            System.out.println(m);
        }

        System.out.println(s.get(2));
        System.out.println(l.get(3));

        for(int o=0;o<s.size();o++){
            System.out.println(s.get(o));
        }
    }
}
