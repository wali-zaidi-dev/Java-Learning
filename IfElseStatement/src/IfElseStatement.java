public class IfElseStatement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x>10){
            System.out.println("Hello");
        }else {
            System.out.println("Bye");
        }

        if (x<10){
            System.out.println("Hello");
        }else {
            System.out.println("Bye");
        }

        if(x<10 && x>10){
            System.out.println("Hello");
        }else {
            System.out.println("Bye");
        }

        if(x<y){
            System.out.println("Hello X");
        }else {
            System.out.println("Hello Y");
        }

        if(x>y){
            System.out.println("Hello X");
        }else {
            System.out.println("Hello Y");
        }
    }
}
