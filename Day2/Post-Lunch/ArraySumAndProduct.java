public class ArraySumAndProduct {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10}; // Example array, you can change the values if needed
        int sum = 0;
        int product = 1;

        for (int num : array) {
            sum += num; // Calculate the sum of all elements
            product *= num; // Calculate the product of all elements
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}
