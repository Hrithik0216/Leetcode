import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }
    private void backtrack(int [] nums, List<List<Integer>> result, List<Integer> tempList ){
        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }
       
        for(int number: nums){
            //To Skip if we get the same number
            if(tempList.contains(number)){
            continue;
            }
            tempList.add(number);

            backtrack(nums, result, tempList);

            tempList.remove(tempList.size()-1);
        }
    }
}