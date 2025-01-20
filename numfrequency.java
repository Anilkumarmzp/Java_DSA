public class numfrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,1,2,4,6,4,7,3,7,4,8,48,48,1,9,4,9,0,4};
        int [] visitedarr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i] == arr[j]){
                    count ++;
                    visitedarr[j] = visited;
                }
            }
            if(visitedarr[i] != visited){
                visitedarr[i] = count;
            }
        }
        for (int i = 0; i < visitedarr.length ; i++) {
            if(visitedarr[i] != visited){
                System.out.println(" "+ arr[i] + " " +visitedarr[i]);
            }
        }
    }
}
