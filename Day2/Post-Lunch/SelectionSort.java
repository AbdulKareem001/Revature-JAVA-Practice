public class SelectionSort {
    public static void main(String[] args) {
      int[] array = {2, 3, 1, 45, 15}; // Example array, you can change the values if needed
      int n = array.length;
  
      for (int i = 0; i < n-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < n; j++) {
          if (array[j] < array[minIndex]) {
            minIndex = j;
          }
        }
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
      }
  
      System.out.println("Array sorted in ascending order:");
      for (int num : array) {
        System.out.print(num + " ");
      }
    }
  }
  