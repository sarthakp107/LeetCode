class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix= new int[n];

        //prefix
        prefix[0] = 1;
        for(int i = 1 ; i < nums.length; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        postfix[n-1] = 1;
        for(int i = n-2; i >=0; i--){
            postfix[i] = nums[i+1] * postfix[i+1];
        }

        int[] res = new int[n];
        for(int i = 0 ; i < n; i++){
            res[i] = postfix[i] * prefix[i];
        }
        return res;
    }
}