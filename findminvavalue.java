public class findminvavalue {
    public int findminvalue(int[] arr){
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void  main(String[] args){
        int[] arr = {5,9,3,15,1,3,2};
        findminvavalue fmv = new findminvavalue();
        System.out.println(fmv.findminvalue(arr));
    }
}
