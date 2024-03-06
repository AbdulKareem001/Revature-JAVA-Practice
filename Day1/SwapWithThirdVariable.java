public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;

        System.out.println("Before swapping - a: " + a + ", b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping - a: " + a + ", b: " + b);
    }
}
