class Solution {
    public boolean isPalindrome(String s) {
       
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        char[] letter = s.toCharArray();

        int front = 0;
        int back = s.length() - 1;

        while(front < back){

            if(letter[front] != letter[back]){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
