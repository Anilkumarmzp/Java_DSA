public class findmissingnumber {
    public int MissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int num : arr){
            sum -= num;
        }
        return sum;
    }
    public static  void main(String[] args){
        int[] arr = {2,4,1,8,6,3,7};
        findmissingnumber fmn = new findmissingnumber();
        System.out.println(fmn.MissingNumber(arr));
    }
}

