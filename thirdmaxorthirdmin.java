public class thirdmaxorthirdmin {
   public static void thirdmaxnum(int[] arr, int sizearr){
        if(sizearr<3){
            System.out.println(" Invalid number");

        }
        int max = arr[0];
        int secmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for (int i = 0; i < sizearr; i++) {
            if (arr[i] > max || arr[i] > secmax || arr[i] > thirdmax){
                thirdmax = arr[i];
            }
        }
         System.out.println("Third minimum number "+ thirdmax);
    }
    static int thirdminnum(int arr[], int sizearrr){
        if(sizearrr<3){
            System.out.println("Invalid num");
        }
        int min = arr[0];
        int secmin = Integer.MAX_VALUE;
        int thirdmin = Integer.MAX_VALUE;
        for (int i = 0; i < sizearrr; i++) {
            if(arr[i]< min || arr[i] < secmin || arr[i] < thirdmin){
                thirdmin = arr[i];
            }
        }
        System.out.println("Third maximum number "+thirdmin);

        return min;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,23,3423,2,234,234,23335,343,54};
        int n = arr.length;
        thirdmaxnum(arr, n);
         thirdminnum(arr,n);

    }
}
