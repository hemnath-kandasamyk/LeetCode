# 2094. Finding 3-Digit Even Numbers

## Problem

Given an integer array `digits`, return all unique three-digit even numbers that can be formed using the digits.

Each digit may only be used once in each number.

The returned array must be sorted in ascending order.

---

## Example

Input:

digits = [2,1,3,0]

Output:

[102,120,130,132,210,230,302,310,312,320]

---

## Approach 1: Backtracking

### Idea

Generate all possible 3-digit numbers using DFS.

Track:

- Used digits
- Current number
- Length

Store valid numbers in a HashSet.

### Complexity

Time: O(nP3)

Space: O(n)

### Pros

- Generic
- Works for k-digit variations

### Cons

- Generates duplicate paths
- Requires HashSet
- More complex

---

## Approach 2: Frequency Checking

### Idea

There are only:

450

possible 3-digit even numbers.

Iterate from:

100 → 998

step by 2

For every candidate:

1. Count digit frequency
2. Compare with available digits
3. If valid, add to answer

### Complexity

Time: O(450 × 10)

Space: O(1)

### Pros

- Simple
- Fast
- No recursion

### Cons

- Specific to this problem constraint

---

## Comparison

| Metric | Backtracking | Frequency Check |
|----------|----------|----------|
| Simplicity | Medium | High |
| Speed | Good | Excellent |
| Memory | Medium | Low |
| Interview Value | High | Very High |
| Recommended Submission | ❌ | ✅ |

---

## Key Learning

When the search space is very small, validating all possible answers is often simpler than generating all answers.
