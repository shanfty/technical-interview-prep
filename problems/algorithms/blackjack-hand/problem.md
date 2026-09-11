# Blackjack Hand

Given an array of cards written as strings, return whether the hand's total is
above, below, or exactly 21, followed by the highest card's string name.

## Java Method Signature

```java
public static String blackjackHand(String[] cards)
```

## Card Values and Ranking

- `two` through `ten` have their corresponding numeric values.
- `jack`, `queen`, and `king` each count as 10. Their ranking is
  `ten < jack < queen < king`.
- An `ace` counts as 11 unless the total exceeds 21, in which case it may count
  as 1. With multiple aces, use as many values of 11 as possible while keeping
  the total at most 21. If that is impossible, all aces count as 1.
- Rank cards by their assigned values, using the ranking above to break ties
  among cards worth 10. An ace counted as 11 ranks highest; an ace counted as 1
  ranks below `two`. If any ace remains worth 11, the highest card is `ace`.

## Input and Output Contract

The following input assumptions complete the supplied statement for this exercise:

- The array is non-null and non-empty, with non-null elements.
- Each element is exactly one of these lowercase strings: `two`, `three`, `four`,
  `five`, `six`, `seven`, `eight`, `nine`, `ten`, `jack`, `queen`, `king`, `ace`.
- Repeated cards are allowed; no deck-size restriction is imposed.
- The array length is at most `Integer.MAX_VALUE / 11`.
- Invalid-input handling is not required.

Return one lowercase string with exactly one space between the classification
and the highest card:

- `below <card>` when the total is less than 21.
- `blackjack <card>` when the total equals 21, regardless of the number of cards.
- `above <card>` when the total is greater than 21.

## Examples

The supplied example:

```text
["ten", "two", "ace"] -> "below ten"
```

The ace counts as 1, giving a total of 13. The highest card is `ten`.

Additional examples:

```text
["ace", "king"] -> "blackjack ace"
["jack", "queen"] -> "below queen"
["king", "queen", "two"] -> "above king"
["ace", "ace", "nine"] -> "blackjack ace"
```

## Run the Tests

From the repository root in PowerShell:

```powershell
.\gradlew.bat test --tests "interview.prep.algorithms.blackjackhand.SolutionTest"
```
