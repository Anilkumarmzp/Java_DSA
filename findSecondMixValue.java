public class findSecondMixValue {
    public  int SecondMaxValue(int arr[] ){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]> secondmax && arr[i] !=max){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
    public  static  void main(String[] args){
        int[] arr = { 13,34, 2, 34, 33, 1};
        findSecondMixValue fsmv = new findSecondMixValue();
        System.out.println(fsmv.SecondMaxValue(arr));

    }

}
