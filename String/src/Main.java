public class Main {
    public static void main(String[] args) {
      String stringObj = new String("Hello World");
      System.out.println(stringObj);
        System.out.println("New String Concat Manually " + stringObj);
        System.out.println(stringObj.concat(" Concat String through concat() method"));
      System.out.println(stringObj.charAt(0));
    }
}