class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>(); 
        findSubset(0,finalList,nums, new ArrayList<>());
        return finalList;
    }
    private void findSubset(int ind, List<List<Integer>> finalList, int [] nums, List<Integer>current){
        finalList.add(new ArrayList<>(current));
        for(int i = ind; i<nums.length; i++){
            current.add(nums[i]);
            findSubset(i+1, finalList, nums, current);
            current.remove(current.size()-1);
        }
    }
}