import javax.print.attribute.standard.MediaSize;

public class findfourthMaxValue {
    static  void fourthmaxvalue(int[] arr , int arr_size){
        if(arr_size<4){
            System.out.println(" Invalid Number");
            return;
        }
        int first = arr[0];
        for (int i = 1; i <arr_size ; i++) {
            if(arr[i]> first){
                first = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
        int third= Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if(arr[i]> third && arr[i]< second){
                third  = arr[i];
            }
        }
        int fourth = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if(arr[i]> fourth && arr[i]< third){
                fourth = arr[i];
            }
        }
        System.out.println(fourth);
    }
    public  static void main(String[] args){
        int arr[] = {4,5,45,23,232,87,12,34,3,4,1};
        int result = arr.length;
        fourthmaxvalue(arr,result);

    }
}
