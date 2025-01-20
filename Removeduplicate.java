public class Removeduplicate {
    public static void main(String[] args) {
        int[] arr = {12, 23, 23, 2, 12, 32, 5, 23, 234, 5, 234, 32};

        int j = 0; // Pointer for the unique element index

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] has already been seen
            for (int k = 0; k < j; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the unique list
            if (!isDuplicate) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Print the unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
