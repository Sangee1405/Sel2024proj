package basicjava;

public class OverRidingClassTwo extends OverRidingClassOne {

    public static void main(String[] args) {

        OverRidingClassOne c = new OverRidingClassOne();
        c.m1();
    }
    public void m1(){

        System.out.println("OverRidingClassOne");
    }
}
