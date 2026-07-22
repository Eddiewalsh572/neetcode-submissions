class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int ROWS = matrix.length;
            int COLS = matrix[0].length;
            int left = 0;
            int right = ROWS - 1;    
            
          while (left <= right){  

            int mid = (left + right) / 2;

            if(target > matrix[mid][COLS - 1]){
                left = mid + 1;
            }else if (target < matrix[mid][0]){
                right = mid - 1;
            }else{
                break;
            }
          }

          if (!(left <= right)){
            return false;
          }

          int l = 0; int r = COLS - 1;
          int mid = (left + right) / 2;
          
          while (l <= r){
            int m = (l + r) / 2;

            if(target < matrix[mid][m]){
                r = m - 1;
            }else if(target > matrix[mid][m]){
                l = m + 1;
            }else{
                return true;
            }

          }
          return false;
    }
}
        
