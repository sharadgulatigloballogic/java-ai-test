public class Main {
    public static void main(String[] args) {
        Object obj = "Hello World"; // obj actually holds a String

        Integer num = (Integer) obj; // ❌ invalid cast
        System.out.println(num);
    }
}
