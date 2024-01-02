import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the input array to handle duplicates
        backtrack(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            tempList.add(nums[i]);
            used[i] = true;

            backtrack(nums, result, tempList, used);

            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}
