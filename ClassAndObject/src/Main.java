 class Calculator {
    int a;
    public int add(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
       int num1 = 10;
       int num2 = 20;
       Calculator calc = new Calculator();
       calc.add(num1, num2);
    }
}