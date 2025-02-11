class twosum {
    public int[] twoSumadd(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }


throw new IllegalArgumentException("no solution found");
    }

public static void main(String[] args) {
    twosum newobj = new twosum();
    int[] arr = newobj.twoSumadd(new int[]{2, 7, 11, 15}, 9);
    System.out.println(arr[0] + " " + arr[1]);
}
}