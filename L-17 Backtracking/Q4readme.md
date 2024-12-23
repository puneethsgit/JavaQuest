```markdown
# Knight's Movement in Chess

In chess, the Knight moves in an "L" shape, which is quite different from other pieces. Specifically, the knight moves:

- Two squares in one direction (either horizontally or vertically).
- One square in a perpendicular direction (either vertically or horizontally).

This results in up to 8 possible moves for a knight from any given position, depending on whether the move stays within the bounds of the board.

## Example of Knight's Movement

For example, if the knight is at position (3, 3) on a chessboard, the possible moves are:

- **(1, 2), (1, 4)** — two squares vertically up or down, one square horizontally left or right.
- **(2, 1), (2, 5)** — two squares horizontally left or right, one square vertically up or down.
- **(4, 1), (4, 5)** — same as above, but moving two squares down instead of up.
- **(5, 2), (5, 4)** — same as above, but moving two squares right instead of left.

### Diagram

```
Initial position: (3, 3)

Possible moves:
(1, 2), (1, 4) — two squares vertically up or down, one square horizontally left or right.
(2, 1), (2, 5) — two squares horizontally left or right, one square vertically up or down.
(4, 1), (4, 5) — same as above, but moving two squares down instead of up.
(5, 2), (5, 4) — same as above, but moving two squares right instead of left.

Here’s the chessboard with these positions marked:
 
      (1, 1)  (1, 2)  (1, 3)  (1, 4)  (1, 5)  (1, 6)  (1, 7)  (1, 8)
      (2, 1)  (2, 2)  (2, 3)  (2, 4)  (2, 5)  (2, 6)  (2, 7)  (2, 8)
      (3, 1)  (3, 2)  (3, 3)  (3, 4)  (3, 5)  (3, 6)  (3, 7)  (3, 8)
      (4, 1)  (4, 2)  (4, 3)  (4, 4)  (4, 5)  (4, 6)  (4, 7)  (4, 8)
      (5, 1)  (5, 2)  (5, 3)  (5, 4)  (5, 5)  (5, 6)  (5, 7)  (5, 8)
      (6, 1)  (6, 2)  (6, 3)  (6, 4)  (6, 5)  (6, 6)  (6, 7)  (6, 8)
      (7, 1)  (7, 2)  (7, 3)  (7, 4)  (7, 5)  (7, 6)  (7, 7)  (7, 8)
      (8, 1)  (8, 2)  (8, 3)  (8, 4)  (8, 5)  (8, 6)  (8, 7)  (8, 8)

Starting at (3, 3), the knight can move to:
(1, 2), (1, 4), (2, 1), (2, 5), (4, 1), (4, 5), (5, 2), (5, 4)


## Refactored Code Explanation

### 1. rowMoves and colMoves Arrays

```java
private static final int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
private static final int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};
```

These two arrays represent the possible moves a knight can make. Each element in `rowMoves` corresponds to a row change, and each element in `colMoves` corresponds to a column change.

For example:

- The first move is `(-2, 1)`, which means the knight moves two rows up and one column to the right.
- The second move `(-1, 2)` means the knight moves one row up and two columns to the right, and so on for all 8 moves.

### Mapping of the Moves:

1. **Move 1**: (-2, 1) → Move 2 squares up and 1 square right.
2. **Move 2**: (-1, 2) → Move 1 square up and 2 squares right.
3. **Move 3**: (1, 2) → Move 1 square down and 2 squares right.
4. **Move 4**: (2, 1) → Move 2 squares down and 1 square right.
5. **Move 5**: (2, -1) → Move 2 squares down and 1 square left.
6. **Move 6**: (1, -2) → Move 1 square down and 2 squares left.
7. **Move 7**: (-1, -2) → Move 1 square up and 2 squares left.
8. **Move 8**: (-2, -1) → Move 2 squares up and 1 square left.

### Example:

If the knight starts at position **(3, 3)**, we calculate the new positions by adding the respective `rowMoves` and `colMoves` values to **(3, 3)**:

- **Move 1**: (3 + (-2), 3 + 1) = (1, 4)
- **Move 2**: (3 + (-1), 3 + 2) = (2, 5)
- **Move 3**: (3 + 1, 3 + 2) = (4, 5)
- **Move 4**: (3 + 2, 3 + 1) = (5, 4)
- **Move 5**: (3 + 2, 3 + (-1)) = (5, 2)
- **Move 6**: (3 + 1, 3 + (-2)) = (4, 1)
- **Move 7**: (3 + (-1), 3 + (-2)) = (2, 1)
- **Move 8**: (3 + (-2), 3 + (-1)) = (1, 2)

### Visualizing the Code:

The `rowMoves` and `colMoves` arrays give us a way to programmatically calculate the knight's possible moves from any given position on the board. By iterating over these arrays, we can explore all possible knight moves and find the path that visits every square on the board exactly once in the Knight's Tour problem.

This approach ensures that the knight can make all 8 moves, provided the move stays within the bounds of the board.
```

This `README.md` provides a detailed explanation of the knight's movement, the corresponding code, and the visual representation of the moves.