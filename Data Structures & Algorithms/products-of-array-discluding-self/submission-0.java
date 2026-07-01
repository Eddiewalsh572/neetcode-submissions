class Solution {
    public int[] productExceptSelf(int[] nums) {

    
    int[] answer = new int[nums.length];   

for (int i = 0; i < nums.length; i++){
int productNum = 1;
    for (int j = 0; j < nums.length; j++){

        if(j != i){
            productNum *= nums[j];
        }
    }
    answer[i] = productNum;
}
return answer;
    }
}  
