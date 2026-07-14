class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numStack = new ArrayDeque<>();
        

        for (int i = 0; i < tokens.length; i++){

            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                int num = Integer.parseInt(tokens[i]);
                numStack.push(num);
            }

            if(tokens[i].equals("+")){

                    int operandOne = numStack.pop();
                    int operandTwo = numStack.pop();

                    int result = operandOne + operandTwo;
                    numStack.push(result);  
            }
            if(tokens[i].equals("-")){

                    int operandOne = numStack.pop();
                    int operandTwo = numStack.pop();

                    int result = operandTwo - operandOne;
                    numStack.push(result);  
            }
            if(tokens[i].equals("*")){

                    int operandOne = numStack.pop();
                    int operandTwo = numStack.pop();

                    int result = operandOne * operandTwo;
                    numStack.push(result);  
            }
            if(tokens[i].equals("/")){

                    int operandOne = numStack.pop();
                    int operandTwo = numStack.pop();

                    int result = operandTwo / operandOne;
                    numStack.push(result);  
            }

        }
        return numStack.pop();



    }
}
