class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){

            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
                stack.push(chars[i]);
            }else if   (chars[i] == ')' || chars[i] == '}' || chars[i] == ']'){

                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(chars[i] == ')' && top != '('){
                    return false;
                }
                if(chars[i] == '}' && top != '{'){
                    return false;
                }
                if(chars[i] == ']' && top != '['){
                    return false;
                }
  
            }
                
                   
                }
                return stack.isEmpty();
            }
}
        


