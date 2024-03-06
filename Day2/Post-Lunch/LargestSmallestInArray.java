public class LargestSmallestInArray {
    public static void main(String[] args) {
        int[] array = {4, 10, -2, 18, 5, 9, -8}; // Example array, you can change the values if needed
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update the largest element if found
            }
            if (array[i] < smallest) {
                smallest = array[i]; // Update the smallest element if found
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
