# Fizz Buzz

Write a method, `fizzBuzz`, that takes a number `n` and returns a list containing
the numbers from `1` through `n`, with these replacements:

- Numbers divisible by 3 become `"fizz"`.
- Numbers divisible by 5 become `"buzz"`.
- Numbers divisible by both 3 and 5 become `"fizzbuzz"`.

Keep the elements in their original numeric order. Each number contributes exactly
one element. Replacement strings are lowercase.

## Java Method Signature

```java
public static List<Object> fizzBuzz(int n)
```

`List` refers to `java.util.List`.

## Input and Output Contract

The following assumptions complete the supplied statement for this local exercise:

- `n` is a non-negative integer, small enough for the result to fit in memory.
- `n = 0` returns an empty list.
- Unreplaced numbers are Java `Integer` values, not strings. Replacement elements
  are `String` values, so the Java return type is `List<Object>`.
- Negative-input handling is not required.
- Return the list rather than printing it. List mutability is not specified.

## Examples

These examples illustrate the supplied rules:

```text
fizzBuzz(0) -> []
fizzBuzz(2) -> [1, 2]
fizzBuzz(5) -> [1, 2, "fizz", 4, "buzz"]
fizzBuzz(16) -> [1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz",
                 11, "fizz", 13, 14, "fizzbuzz", 16]
```

## Run the Tests

From the repository root in PowerShell:

```powershell
.\gradlew.bat test --tests "interview.prep.algorithms.fizzbuzz.SolutionTest"
```
