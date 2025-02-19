import java.util.*;

public class Backtracking{
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        System.out.println("Subsets summing to " + target + ":");
        findSubsets(nums, 0, new ArrayList<>(), target);
    }

    static void findSubsets(int[] nums, int index, List<Integer> current, int target) {
        if (target == 0) {
            System.out.println(current);
            return;
        }
        if (index >= nums.length || target < 0) return; 

        current.add(nums[index]);
        findSubsets(nums, index + 1, current, target - nums[index]);
        
        current.remove(current.size() - 1);
        findSubsets(nums, index + 1, current, target);
    }
}
