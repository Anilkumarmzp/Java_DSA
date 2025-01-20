public class findsecmin {
    int secminvalue(int[] arr){
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
            }else if(arr[i]< secmin && arr[i] != min){
                secmin = arr[i];
            }
        }
        return secmin;
    }
    public static void main(String[] args){
        int[] arr = {4,53,23,235,42,34,2343,12,34,345,23422,235};
        findsecmin fsm = new findsecmin();
        int res = fsm.secminvalue(arr);
        System.out.println(res);
    }
}
