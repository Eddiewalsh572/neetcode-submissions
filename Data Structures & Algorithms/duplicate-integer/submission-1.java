class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;

        HashSet<Integer> hSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (hSet.contains(nums[i])){
                return true;
            }
            hSet.add(nums[i]);
        }
        return false;
    }
}