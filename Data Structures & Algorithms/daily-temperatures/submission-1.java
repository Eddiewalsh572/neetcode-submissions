class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temps.length];

        for (int i = 0; i < temps.length; i++){
        while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
            int oldIndex = stack.pop();
            answer[oldIndex] = i - oldIndex;
        }
        stack.push(i);
        }
        return answer;
    }
}
