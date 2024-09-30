import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrenceCount = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : arr) {
            occurrenceCount.put(num, occurrenceCount.getOrDefault(num, 0) + 1);
        }
        
        // Check if occurrence counts are unique
        HashSet<Integer> uniqueCounts = new HashSet<>(occurrenceCount.values());
        
        return occurrenceCount.size() == uniqueCounts.size();
    }
}
