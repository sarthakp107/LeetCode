class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
            [-3, 3, 4, -3, 1, 2]
            sort
           looking -> [-3, -3, 1,2,3,4]
                    #check for the first element > 0
                    #check for duplicate (skip)
            i1 + i2 + i3 = 0
            1st element to i1,
            then for i2 and i3 use the 2sum approach
        */
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            //greater than 0
            if(nums[i] > 0) break;
            //check for dup
            if( i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;

            while( l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                }
            }
 }
        return res;

    }
}