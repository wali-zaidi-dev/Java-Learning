 class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int a = 7;
        int b = 6;

        boolean result = x > y && a > b;
        System.out.println(result);
        boolean result2 = x < y && a < b;
        System.out.println(result2);

        boolean result3 = x > y && a < b;
        System.out.println(result3);
        boolean result4 = x < y && a > b;
        System.out.println(result4);

        boolean result5 = x > y || a > b;
        System.out.println(result5);
        boolean result6 = x < y || a < b;
        System.out.println(result6);

        boolean result7 = x > y || a < b;
        System.out.println(result7);
        boolean result8 = x > y || a < b;
        System.out.println(result8);

        boolean result9 = x < y || a < b || x > y;
        System.out.println(result9);

        boolean result10 = x < y;
        System.out.println(!result10);
    }
}
