class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            //when to swap?
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i  , correctIndex);
            }
            else{
                i++; 
            }
        }

        for(int index = 0; index < nums.length ;index++){
            //case 013
            if(nums[index] != index){
                return index;
            }
            //case where N is missing
        }
            return nums.length;
    }

     public void swap(int[] nums , int first , int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
     }
}