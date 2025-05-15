class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //count the frequency and put it in the hashmap
        /**
        hashmap:
        Number | Frequency
        1           3
        2           2
        3           1

        now i have to sort this in descending order and find the first k element
        this will take logn time complexity

        to do this in O(n) i can use bucket sort

           hashmap:
        Number | Frequency
        1           3
        2           2
        3           1

        then store it in the bucket array in that index 
        bucket[1] = 3
        bucket[2] = 2
        bucket[3] = 1
         */

         HashMap<Integer, Integer> map = new HashMap<>();

         for(int num: nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
         }

         //a bucket can store multiple elements
         //bucket[i] = 3,2
         List<Integer>[] bucket = new ArrayList[nums.length + 1];
         for(int i = 0; i <= nums.length; i++){
            bucket[i] = new ArrayList<>();
         }

         for(Map.Entry<Integer, Integer> m : map.entrySet()){
            bucket[m.getValue()].add(m.getKey());
         }

         //loop from end -> as wee need most frequent element
         //till index < k

         int[] res = new int[k];
         int index = 0;
         for(int i = bucket.length - 1; i >= 0 && index < k ; i--){
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