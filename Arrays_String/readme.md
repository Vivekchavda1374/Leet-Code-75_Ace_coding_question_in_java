# LeetCode Solutions

This repository contains solutions to various LeetCode problems implemented in Java. Below is a summary of each problem and its respective Java file.

## Problem Summaries

### 1. Can Place Flowers

**File:** `CanPlaceFlowers.java`

**Description:**
Given a flowerbed (an array where `flowers[i]` is 0 if the flowerbed plot is empty or 1 if it contains a flower), determine if you can place a new flower in it without violating the no-adjacent-flowers rule.

**Example:**

- Input: `flowerbed = [1,0,0,0,1]`, `n = 1`
- Output: `true`

### 2. Greatest Common Divisor of Strings

**File:** `GreatestCommonDivisorOfStrings.java`

**Description:**
Given two strings `str1` and `str2`, find the greatest common divisor (GCD) of the two strings. The GCD of strings is the largest string that can divide both `str1` and `str2`.

**Example:**

- Input: `str1 = "ABCABC"`, `str2 = "ABC"`
- Output: `"ABC"`

### 3. Increasing Triplet Subsequence

**File:** `IncreasingTripletSubsequence.java`

**Description:**
Given an integer array `nums`, return `true` if there exists a triple `(i, j, k)` such that `i < j < k` and `nums[i] < nums[j] < nums[k]`.

**Example:**

- Input: `nums = [1,2,3,4,5]`
- Output: `true`

### 4. Kids With the Greatest Number of Candies

**File:** `KidsWithTheGreatestNumberOfCandies.java`

**Description:**
Given an array `candies` where `candies[i]` represents the number of candies the `i`-th kid has and an integer `extraCandies`, determine if each kid can have the greatest number of candies after receiving the extra candies.

**Example:**

- Input: `candies = [2,3,5,1,3]`, `extraCandies = 3`
- Output: `[true,true,true,false,true]`

### 5. Merge Strings Alternately

**File:** `MergeStringsAlternately.java`

**Description:**
Given two strings `word1` and `word2`, merge them in alternating characters. If one string is longer than the other, append the additional characters to the end of the merged string.

**Example:**

- Input: `word1 = "abc"`, `word2 = "pqr"`
- Output: `"apbqcr"`

### 6. Product of Array Except Self

**File:** `ProductOfArrayExceptSelf.java`

**Description:**
Given an integer array `nums`, return an array `answer` where `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

**Example:**

- Input: `nums = [1,2,3,4]`
- Output: `[24,12,8,6]`

### 7. Reverse Vowels of a String

**File:** `ReverseVowelsOfAString.java`

**Description:**
Given a string `s`, reverse only the vowels of the string and return it.

**Example:**

- Input: `s = "hello"`
- Output: `"holle"`

### 8. Reverse Words in a String

**File:** `ReverseWordsInAString.java`

**Description:**
Given a string `s`, reverse the words in the string while preserving whitespace and initial word order.

**Example:**

- Input: `"the sky is blue"`
- Output: `"blue is sky the"`

### 9. String Compression

**File:** `StringCompression.java`

**Description:**
Given an array of characters `chars`, compress it using the following algorithm: each sequence of consecutive repeating characters is replaced by the character followed by its count. The compressed array should replace the original array and return its length.

**Example:**

- Input: `chars = ['a','a','b','b','c','c','c']`
- Output: `6` (compressed array: `['a','2','b','2','c','3']`)

## Usage

To run any of these solutions, compile the corresponding Java file and run it using a Java runtime. Make sure to include any necessary test cases to validate the solutions.

```bash
javac <FileName>.java
java <FileName>
