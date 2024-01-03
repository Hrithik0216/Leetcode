class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> temp, int [] nums, boolean[] used){
        if(temp.size()==nums.length && !result.contains(temp)){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
            used[i] =true;
            temp.add(nums[i]);
            
            backtrack(result, temp, nums, used);

            used[i]=false;
            temp.remove(temp.size()-1); 
        }
        }
        
    } 
}