class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int count = 0;
        int maxf = 0;

         for(int i = 0; i< s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault( s.charAt(i),0) + 1);
            maxf = Math.max(maxf, hm.get(s.charAt(i))); //instead of rescanning the whole hm we globally store max

 //window count = r - l
            // wc - maxf <= k -> valid else l++
            while((i - l + 1) - maxf > k){
                //update
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l++;
            }
            count = Math.max(count, (i - l) + 1 );
              }
        return count;
    }
}