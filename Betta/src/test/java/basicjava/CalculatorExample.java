package basicjava;

public class CalculatorExample {
    public static void main(String[] args) {
        int a = 50;
        int b= 80;
        String operator = "+";
        if(operator.equals("-")){
            System.out.println(a - b);
            
        } else if (operator.equals("/")) {
            System.out.println(a / b);
            
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("+")) {
            System.out.println(a + b);
            
        }
        else{
            System.out.println("provide valid operator");
        }

    }
}
