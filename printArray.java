public class printArray {
    public static void reverse(int[] num, int s, int e){
        while(s < e){
            int temp = num[s];
            num[s] = num[e];
            num[e] = temp;
            s++;
            e--;

        }
    }
    public static void  arrUtil(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
//        int n=arr.length;
//        System.out.println();
    }
    public static void main(String[] args){
//        printArray printarr = new printArray();
//        printarr.arrUtil(new int[] {5,3,2,1,9,10});
        int [] num = {2,11,5,10, 7,8};
        printArray.arrUtil(num);
        reverse(num, 0, num.length-1);
        arrUtil(num);

    }


}
