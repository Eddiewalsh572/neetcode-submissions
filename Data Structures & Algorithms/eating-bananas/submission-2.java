class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
 
        
        int l = 1;
        int r = max;
        int answer = max;
        while (l <= r){
            int totalTime = 0;
            int k = l + ((r - l) / 2);

            for (int i = 0; i < piles.length; i++){

                int timeTakenPerPile = (piles[i] + k - 1) / k;
                
                totalTime += timeTakenPerPile;
            }

            if (totalTime <= h){
                answer = k;
                r = k - 1;               
            }else{
                l = k + 1;  
            }

        }

    return answer;
    }
    
}
