public class avgofpostnum {
    public static void main(String[] args) {
        int[] arr = {-23,32,21,-22,-12, -34,45};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > 0 ){
               sum += arr[i];
               count++;
           }
        }
        if (count > 0){
            double avg = (double) sum/count;
            System.out.println(avg);
        }else {
            System.out.println("Invalid Number");
        }
    }

}
