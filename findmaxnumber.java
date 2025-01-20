public class findmaxnumber {
    public  int maxnum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max){
               max = arr[i];
           }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {3,5,2,4,23,32,12,35,25,32};
        findmaxnumber fmn = new findmaxnumber();
        int res = fmn.maxnum(arr);
        System.out.println(res);
    }
}
