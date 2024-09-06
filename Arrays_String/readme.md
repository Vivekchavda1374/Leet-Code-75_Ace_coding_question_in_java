# Arrays and String questions:
## Merge Alternately - Solution Explanation
## Problem
We are given two strings, `word1` and `word2`. The task is to merge them by alternating characters from each string, starting with the first character of `word1`. If one string is longer than the other, the remaining characters of the longer string should be appended at the end of the merged string.

For example:
- Input: `word1 = "abc", word2 = "pqr"`
- Output: `"apbqcr"`

## Code

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sv = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        
        // Loop runs until all characters from both strings are processed
        while(i < n1 || i < n2) {
            if(i < n1) {
                // Append the character from word1 if within bounds
                sv.append(word1.charAt(i));
            }
            if(i < n2) {
                // Append the character from word2 if within bounds
                sv.append(word2.charAt(i));
            }
            i++;
        }
        // Return the merged string
        return sv.toString();
    }
}
