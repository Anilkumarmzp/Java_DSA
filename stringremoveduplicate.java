public class stringremoveduplicate {
    public static void main(String[] args){
        String input = "school";
         StringBuilder ans = new StringBuilder("");
         int [] arr = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index= input.charAt(i)-97;
            arr[index] +=1;
            if(arr[index] ==1){
                ans.append(input.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
