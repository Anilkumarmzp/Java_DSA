public class duplicatestring {
    public static void main(String[] args) {
        String input = "school";
        StringBuilder ans = new StringBuilder("");
        int[] arr = new  int[26];
        for (int i = 0; i < arr.length; i++) {
            int idx = input.charAt(i)-97;
            arr[idx] += 2;
            if(arr[idx] == 2){
                ans.append(input.charAt(i));
            }
            System.out.println(ans);
        }

    }
}
