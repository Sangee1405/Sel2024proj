package basicjava;

public class PolyExample {

    public static void main(String[] args) {
    PolyExample p= new PolyExample();
    p.m1("aa","uu");
    }

    public void m1(int a){
        System.out.println(a);
    }
    public void m1(String b){

        System.out.println(b);
    }
    public void m1(String a, String b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(int a, String b){
        System.out.println(a);
        System.out.println(b);

    }

    public  void m1(int a, int b){
        System.out.println(a);
        System.out.println(b);

    }
}
