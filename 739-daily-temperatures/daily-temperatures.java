class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] results = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temp.length; i++){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}