# Closest Carrot

Given a grid and a starting position, return the minimum number of moves required to reach a carrot.

The grid contains:

- `O` — open space
- `X` — wall
- `C` — carrot

You may move:

- Up
- Down
- Left
- Right

You may not move through walls.

If no carrot can be reached, return `-1`.

## Method Signature

```java
public static int closestCarrot(
    List<List<String>> grid,
    int startRow,
    int startCol
)
```

`List` refers to `java.util.List`. Return an `int`.

## Input Contract

- The grid is non-null, non-empty, and rectangular, with non-empty rows.
- Every cell is exactly `O`, `X`, or `C`; rows and cells are non-null.
- Coordinates are zero-based and the starting position is within the grid.
- The starting cell is open space or a carrot, never a wall.
- Each move to an adjacent cell costs one move. Diagonal moves are not allowed.
- Starting on a carrot returns `0`.
- There may be zero, one, or multiple carrots. Return the distance to the nearest reachable carrot.
- The number of cells fits within an `int`.
- Do not modify the input grid; it may be immutable.

You may assume inputs satisfy this contract; invalid-input handling is not required.

## Examples

### Reachable carrot

```text
O O C
O X O
O O O
```

Start: `(2, 0)`. Expected result: `4`.

### Unreachable carrot

```text
O X C
O X O
```

Start: `(0, 0)`. Expected result: `-1`.

### Starting on a carrot

```text
C O
```

Start: `(0, 0)`. Expected result: `0`.
