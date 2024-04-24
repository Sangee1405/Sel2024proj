package basicjava;

public class StringExample {
    public static void main(String[] args) {
        String a = "Welcome";
        String b= "Home";
        System.out.println(a+b);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.charAt(2));
        System.out.println(a.concat(b));

        String name ="GoodMorning";
        System.out.println(name.substring(4));
        System.out.println(name.substring(0,4));

    }
}
