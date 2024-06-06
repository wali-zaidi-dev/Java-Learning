public class TypeCasting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        b = (byte) a;
        System.out.println(b);

        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);

        byte p = 127;
        int q = p;
        System.out.println(q);

        int h = 257;
        byte t = (byte) h;
        System.out.println(t);

        byte g =10;
        byte s = 30;
        int result = (g*s);
        System.out.println(result);
    }
}
