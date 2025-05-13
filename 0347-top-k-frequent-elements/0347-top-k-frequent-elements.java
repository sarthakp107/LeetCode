class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //get the count of each elements in nums
        for(int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> countList = new ArrayList<>(map.entrySet());

        //Sort by value
        countList.sort((a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i = 0 ; i< k; i++){
            result[i] = countList.get(i).getKey();
        }
        return result;
    }
}