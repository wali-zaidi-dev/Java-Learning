public class ElseIfStatement {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;
        int z = 17;

        if(x > y && x > z) {
            System.out.println(x + " is greater than " + y);
        } else if (x > y && x > z) {
            System.out.println(x + " is greater than " + z);
        }else {
            System.out.println(x + " is less than " + z);
        }
    }
}
