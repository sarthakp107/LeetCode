class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();    
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        //basic push operation
        stack.push(val);
        // if min stack is empty, push the val to min stack aswell
        if( minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int out = stack.pop();
            if(out == minStack.peek()){
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */