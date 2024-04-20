package basicjava;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(90);
        s.add(100);
        s.add(120);
        System.out.println(s);
        s.add(90);


    }
}
