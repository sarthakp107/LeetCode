class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast  = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
           if(fast == 1){
            return true;
           }
           if(slow == fast){
            return false;
           }

        }while(slow != fast);

        //no cycle detected;
        return true;
        
    }

    public int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;  
        }
        return ans;
    }
}