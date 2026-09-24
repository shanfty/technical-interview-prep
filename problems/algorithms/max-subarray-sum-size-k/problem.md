# Max Subarray Sum Size K

Write a method that takes a list of numbers and a size `k`. Return the maximum
sum among all contiguous subarrays containing exactly `k` elements.

## Method Signature

```java
public static int maxSubarraySumSizeK(List<Integer> nums, int k)
```

`List` refers to `java.util.List`.

## Input Contract

- The list is non-null and non-empty, and contains non-null integers.
- Assume `1 <= k <= nums.size()`.
- Numbers may be positive, negative, or zero.
- Assume all contiguous subarray sums fit in a Java `int`.
- The list may be immutable, as in the example.
- Invalid-input handling is not required.

A subarray consists of consecutive elements in their original order. Return
the sum, not the subarray. If several subarrays share the maximum sum, return
that sum.

## Example

```java
maxSubarraySumSizeK(List.of(4, 2, 1, -9, 8, 4, 3), 3); // -> 15
```

`[8, 4, 3]` is the subarray of size 3 with the maximal sum.

## Run Tests

From the repository root in PowerShell:

```powershell
.\gradlew.bat test --tests "interview.prep.algorithms.maxsubarraysumsizek.SolutionTest"
```
