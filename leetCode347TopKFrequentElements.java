import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(
                        (a, b) -> a.getValue() - b.getValue()
                );

        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            
        }
        
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {

            minHeap.add(entry);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}

class TopKFrequentElements {
    public static void main(String[] args) {
        LeetCode347 lc = new LeetCode347();
        int[] nums = {4,4,4,4, 2,2,2, 7,7, 9, 9, 9, 9, 9};
        int k = 2;
        int[] result=lc.topKFrequent(nums, k);
        for (int i : result) {
            System.out.println(i);
        }
    }
}