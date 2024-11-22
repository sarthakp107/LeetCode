class Solution {
       public int[] findErrorNums(int[] nums) {
        int i =0 ;
        while(i <  nums.length){
            int correctIndex = nums[i] -1 ;
           if(nums[i] != nums[correctIndex]){
            //swap
                swap(nums, i, correctIndex);
           }else{
            i++;
           }
        }

        for(int j = 0 ; j< nums.length; j++){
            //check if the sorted arrays element are at their correct index
            if(nums[j] != j+1){
                // int duplicateNumber = nums[j];
                // int missingNumber = j+1;
                return new int[] {nums[j] , j+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}