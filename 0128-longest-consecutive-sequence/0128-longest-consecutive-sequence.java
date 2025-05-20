class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int cs = 1;
        int longs = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            else if(nums[i] == nums[i-1] + 1){
                cs++;
            }
            else{
                cs = 1;
            }
            longs = Math.max(longs,cs);
        }
        return longs;
    }
}