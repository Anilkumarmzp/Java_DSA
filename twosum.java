import java.util.List;
import java.util.ArrayList;

class TwoSum {
    public List<Integer> twoSum(List<Integer> nums, int target) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Avoid duplicate index usage
                if (nums.get(i) + nums.get(j) == target) {
                    List<Integer> result = new ArrayList<>();
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return new ArrayList<>(); // Return an empty list if no solution exists
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 7, 11, 15);
        int target = 9;
        TwoSum ts = new TwoSum();
        List<Integer> result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result);
    }
}
