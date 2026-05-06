# SRPN Calculator

## About

This project implements a command-line **Saturated Reverse Polish Notation (SRPN) Calculator** in Java. It was built to explore stack-based computation, integer boundary handling, and operator parsing — all core concepts in low-level systems and compiler design.

**Reverse Polish Notation (RPN)** is a mathematical notation in which operators follow their operands. For example, instead of writing `3 + 4`, you write `3 4 +`. This eliminates the need for parentheses and maps naturally to stack-based execution.

**Saturation** means that rather than overflowing or wrapping around when a result exceeds the integer range, the value is clamped to `Integer.MAX_VALUE` (2,147,483,647) or `Integer.MIN_VALUE` (-2,147,483,648). This mirrors the behaviour of saturating arithmetic found in embedded systems and digital signal processing.

The calculator reads commands from standard input line by line, pushes integers onto a stack, and applies operators as they are encountered. It handles underflow, division by zero, and overflow gracefully with clear error messages.

---

## key Features

- **Stack-based evaluation** using Java's `Stack<Integer>`
- **Arithmetic operators**: `+`, `-`, `*`, `/`, `%`
- **Saturation arithmetic** — clamps results at `Integer.MAX_VALUE` / `Integer.MIN_VALUE` instead of overflowing
- **Stack inspection**: `=` peeks at the top of the stack; `d` prints the full stack
- **Error handling**: stack underflow detection and divide-by-zero protection
- **Continuous input loop** — runs until EOF (`Ctrl+D`)

---

## Usage

### Compile

```bash
javac Main.java SRPN.java
```

### Run

```bash
java Main
```

Enter integers and operators one per line. Use `=` to print the top of the stack, `d` to print the full stack, and `Ctrl+D` to exit.

### Example

```
10
2
+
=
```
Output: `12`

```
2147483647
1
+
=
```
Output: `2147483647` *(saturated — does not overflow)*

---

## Operators

| Input | Operation              |
|-------|------------------------|
| `+`   | Addition               |
| `-`   | Subtraction            |
| `*`   | Multiplication         |
| `/`   | Division               |
| `%`   | Modulo                 |
| `=`   | Print top of stack     |
| `d`   | Print full stack       |

---

## Project Structure

```
SRPN-Calculator/
├── Main.java        # Entry point — reads stdin and delegates to SRPN
├── SRPN.java        # Core calculator logic and stack management
├── TestCases.txt    # Manual test cases covering basic ops, chaining, and saturation
└── README.md
```

---

