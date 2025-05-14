class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int i = 1 ; i <= nums.length ; i++){
            bucket[i] = new ArrayList<>();
        }

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        /**
        [5,5,6,6,6,7,8]
         */

        /**
        5 - 2
        6 - 3
        7 - 1
        8 - 1
         */

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        //loop start from the last, 
        for(int i = bucket.length - 1; i > 0 && index <= k ; i--){
            for(int n : bucket[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}