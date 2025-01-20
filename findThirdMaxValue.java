public class findThirdMaxValue{
//    public  int thirdvalue(int[] arr){
//        if(arr.length<3){
//            throw  new IllegalArgumentException("");
//        }
//        Integer max = null;
//        Integer secondmax = null;
//        Integer thirdmax = null;
//        for (int i : arr){
//            if(i == max ||  i == secondmax|| i == thirdmax){
//                continue;
//            }
//            if(max == null || i > max ){
//                thirdmax = secondmax;
//                secondmax = max;
//                max = i;
//            } else if (secondmax == null || i>secondmax) {
//                thirdmax = secondmax;
//                secondmax = i;
//            } else if (thirdmax == null || i> thirdmax) {
//                thirdmax= i;
//            }
//
//        }
//
//
//        return  thirdmax;
//    }
//    public  static  void main(String[] args){
//        int[] arr = {4, 5, 45, 23, 45, 232, 12, 34, 3, 4, 1};
//
//        findThirdMaxValue ftmv = new findThirdMaxValue();
//         int result = ftmv.thirdvalue(arr);
//        System.out.println(result);
//    }



    static void thirdLargest(int arr[],
                             int arr_size)
    {
    /* There should be
    atleast three elements */
        if (arr_size < 3)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        // Find first
        // largest element
        int first = arr[0];
        for (int i = 1;
             i < arr_size ; i++)
            if (arr[i] > first)
                first = arr[i];

        // Find second
        // largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0;
             i < arr_size ; i++)
            if (arr[i] > second &&
                    arr[i] < first)
                second = arr[i];

        // Find third
        // largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0;
             i < arr_size ; i++)
            if (arr[i] > third &&
                    arr[i] < second)
                third = arr[i];

        System.out.printf("The third Largest " + "element is %d ", third);
    }

    // Driver code
    public static void main(String []args)
    {
        int arr[] = {12, 13, 1, 10, 34, 16};
        int n = arr.length;
        thirdLargest(arr, n);
    }
}
