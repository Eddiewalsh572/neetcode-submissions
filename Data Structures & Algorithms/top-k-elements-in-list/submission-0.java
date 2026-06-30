class Solution {
    public int[] topKFrequent(int[] nums, int k) {


HashMap<Integer, Integer> count = new HashMap<>();
    for (int num : nums){

        count.put(num, count.getOrDefault(num, 0) + 1);
    }


List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
    
    for (int num : count.keySet()){
        int freq = count.get(num);

        buckets[freq].add(num);
    }

int[] results = new int[k];
    int index = 0;
for (int j = buckets.length - 1; j >= 0; j--){
    for (int num : buckets[j]){
        results[index] = num;
    index++;

    if (index == k){
        return results;
    }
    }
}
return results;
}
}
