class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Integer> hms = new HashMap<>();
        HashMap <Character, Integer> hmt = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            hms.put(cs , 1 + hms.getOrDefault(cs,0));
            hmt.put(ct , 1 + hmt.getOrDefault(ct,0));
        }

        return hms.equals(hmt);
    }
}