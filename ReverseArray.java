//Given array ar string the task is to reverse the array or string
//array ofinteger = {2,11,5,10,7,8}output ={8,7,10,5,11,2}

public class ReverseArray {
    public void revArr(int[] arr, int start, int end){
       while (start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    }
    public static  void main(String[] args){
        int arr[] =  {2,11,5,10,7,8};
        ReverseArray reverseArray = new ReverseArray();
       reverseArray.revArr(arr, 0, arr.length-1);
        System.out.println(" Reverse Array ");
        System.out.print(arr);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}

//
//public class ReverseArray {
//    // Method to reverse the array
//    public void revArr(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Input array
//        int arr[] = {2, 11, 5, 10, 7, 8};
//
//        // Create an instance of the ReverseArray class
//        ReverseArray reverseArray = new ReverseArray();
//
//        // Call the revArr method to reverse the array
//        reverseArray.revArr(arr, 0, arr.length - 1); // Fix index to arr.length - 1 for correct range
//
//        // Print the reversed array
//        System.out.print("Reversed array: ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}
