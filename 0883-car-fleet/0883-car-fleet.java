class Solution {

    /**

        target 
        position[]
        speed[]

        return the number of car fleet
        approach:
            - need time taken by each car
            - create stack
            - push the time taken by the car with the highest position first (we can sort the array)
            - if time taken by a car is less than the time 
                
                1. Create a common array (position, speed ) -> col 2
                        [[10,2], [8,4]]
                2. array sort in descending -> as we first want to know the time taleken by the nearest position 
                        so that we can determine car fleet ... the time taken by other at further position 
                        if its less than the newarest position, then its a car fleet
                3. stack
                    3.1 push the time to the stack
                    if the current element is lesser than the time taken by the first element(nearest) -> car fleet so remove from the stack as we return the size of the stack as  a number of car fleets...

     */
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        
        for(int[] p : pair ){
            stack.push((double)(target - p[0]) / p[1]);
            if(stack.size() >= 2 &&stack.peek() <= stack.get(stack.size() - 2) ){
                stack.pop();
            }
        }
        return stack.size();

    }
}