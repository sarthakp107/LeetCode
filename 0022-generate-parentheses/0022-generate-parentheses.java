class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        bt(0 , 0 , res, stack , n);
        return res;
    }

    public void bt(int open, int close, List<String> res, StringBuilder stack, int n){
        if(open == close && open == n){
            res.add(stack.toString());
            return;
        }

        if(open < n){
            stack.append('(');
            bt(open + 1, close, res, stack , n);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(close < open){
            stack.append(')');
            bt(open, close + 1, res, stack, n);
            stack.deleteCharAt(stack.length() - 1);
        }


    }
}