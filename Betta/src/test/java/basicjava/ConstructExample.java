package basicjava;

public class ConstructExample {

    static int a;
    public ConstructExample(){

        a= 100;
    }

    public static void main(String[] args) {
        ConstructExample c = new ConstructExample();
        System.out.println(a);
    }
}
