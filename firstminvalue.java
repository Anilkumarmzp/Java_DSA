public class firstminvalue {
    int minnum(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {32,234,5,23,42,4,5342,453,54};
        firstminvalue fmn = new firstminvalue();
        int res = fmn.minnum(arr);
        System.out.println(res);
    }
}
