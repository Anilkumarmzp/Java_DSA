// find  the minimum value
public class mimvalue {
    public int  findminimun(int[] arr){
//       if(arr == null || arr.length==0){
//           throw  new IllegalArgumentException("Invalid input");
//       }
        int min = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
//            System.out.print(arr[i ] + ' ');
        }
        return min;
    }
    public  static  void  main(String[] args){
        int arr[] ={5,9,3,15,1,2};
        mimvalue mn = new mimvalue();
//        mn.findminimun(arr);
        System.out.println(mn.findminimun(arr));
    }
}
