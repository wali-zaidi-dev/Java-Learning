public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("My String");
        sb.append("\tAppended String");
        System.out.println(sb.capacity());
        String str = sb.toString();
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0, "Java");
        System.out.println(sb);
        sb.ensureCapacity(10);
        sb.setLength(30);
    }
}