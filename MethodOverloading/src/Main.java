class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, int b) {
        return a + b;
    }
}


public class Main {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    int result = calc.add(1, 2);
    System.out.println(result);
    double resultFloat = calc.add(2.5, 2);
    System.out.println(resultFloat);
    result = calc.add(3,3,3);
        System.out.println(result);

    }
}