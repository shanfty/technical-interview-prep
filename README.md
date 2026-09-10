# Technical Interview Prep

A personal technical interview preparation repository designed to turn interview questions into runnable local exercises with the help of an AI coding agent.

Instead of solving problems entirely in a browser, this repository provides a consistent local development environment where problems can be written, tested, reviewed, and revisited using familiar development tools.

## Goals

This repository is designed to:

* Practice technical interview problems locally in VS Code.
* Keep problem descriptions separate from implementations.
* Automatically generate starter code and unit tests from problem descriptions.
* Support AI-assisted problem setup without revealing the solution.
* Organize problems by algorithms, data structures, patterns, and difficulty.
* Track completed and unsolved problems.
* Support multiple programming languages over time.
* Expand beyond algorithms into frontend, backend/API, and SQL interview exercises.

## AI-Assisted Workflow

To add an exercise, paste its statement (a title is optional) or send a problem link
from LeetCode or another site to the coding agent while working in this repository.
For example:

```text
Add this problem:
<paste the problem statement here>
```

```text
Add this problem: <problem URL>
```

In an ongoing exercise-creation conversation, the statement or URL alone is enough.
The agent infers a missing title, chooses metadata and a directory name, and creates
the problem description, compiling starter, and tests. Algorithm exercises default
to Java 21. Specify another language when wanted.

For links, the agent reads the problem statement and records its source. If the page
is inaccessible or requires login, it will ask you to paste the statement. It asks
about missing details only when they affect correctness and protects existing work
when a problem is already present. Inferred difficulty is marked in metadata.

The agent verifies compilation and test execution, provides the run command, and
leaves the problem unsolved. It does not consult editorials or generate a solution
to validate the tests.

The repository is designed to work with AI coding agents.

When given an interview problem, the agent can:

1. Analyze the problem.
2. Determine the appropriate category and concepts.
3. Create the problem directory.
4. Create a clean problem description.
5. Generate starter code.
6. Generate unit tests.
7. Verify that the starter project compiles and the tests can run.
8. Leave the actual implementation for the user to complete.

The agent should **not solve the problem unless explicitly requested**.

After completing a solution, the agent can also be used to review:

* Correctness
* Time complexity
* Space complexity
* Code quality
* Alternative approaches
* Interview-style follow-up questions

Repository-wide agent behavior and conventions are defined in [`AGENTS.md`](./AGENTS.md).

## Repository Structure

```text
technical-interview-prep/
├── README.md
├── AGENTS.md
├── problems/
│   ├── algorithms/
│   ├── react/
│   ├── api/
│   └── sql/
└── ...
```

Each problem is stored independently.

For example:

```text
problems/
└── algorithms/
    └── closest-carrot/
        ├── problem.md
        ├── metadata.yaml
        └── java/
            └── src/
                ├── main/java/interview/prep/algorithms/closestcarrot/Solution.java
                └── test/java/interview/prep/algorithms/closestcarrot/SolutionTest.java
```

### `problem.md`

Contains the interview question, requirements, constraints, examples, and expected function signature.

### `metadata.yaml`

Contains information used to classify and organize the problem.

For example:

```yaml
title: Closest Carrot
type: algorithm
difficulty: medium

data_structures:
  - queue

algorithms:
  - breadth-first-search

concepts:
  - graph
  - grid

patterns:
  - shortest-path-unweighted

languages:
  - java

status: unsolved
```

A problem can belong to multiple concepts without needing to exist in multiple directories.

### `Solution.java`

Contains the starter implementation and is where the solution is written.

The AI agent should generate only the required structure:

```java
public class Solution {

    public static int closestCarrot(...) {
        // TODO
        return -1;
    }
}
```

### `SolutionTest.java`

Contains JUnit tests for the problem.

Tests should cover provided examples as well as relevant normal cases, edge cases, and boundary conditions.

## Problem Organization

Algorithm problems are classified using metadata rather than being separated into rigid directories.

Problems may be categorized by data structures such as:

* Arrays
* Hash Maps
* Hash Sets
* Linked Lists
* Stacks
* Queues
* Trees
* Graphs
* Heaps
* Tries

Problems may also be categorized by algorithms and patterns such as:

* Breadth-First Search
* Depth-First Search
* Binary Search
* Two Pointers
* Sliding Window
* Recursion
* Backtracking
* Dynamic Programming
* Prefix Sum
* Topological Sort
* Union Find
* Monotonic Stack

This allows a single problem to belong to multiple relevant categories.

## Languages

Initial development focuses on:

**Java**

Planned language support may include:

* Python
* TypeScript
* JavaScript

The same problem can eventually contain implementations in multiple languages.

```text
closest-carrot/
├── problem.md
├── metadata.yaml
├── java/
├── python/
└── typescript/
```

## Beyond Algorithms

The repository is intended to eventually support several types of technical interview exercises.

### Algorithms & Data Structures

Traditional coding interview problems covering data structures, algorithms, and common problem-solving patterns.

### React

Frontend exercises involving components, state management, API interactions, user behavior, and testing.

### APIs

Backend exercises involving REST APIs, validation, data modeling, authentication, and service design.

### SQL

Database exercises containing schemas, seed data, queries, and expected results.

## Development Environment

### Running Java exercises

Install JDK 21 and open the repository root in VS Code. Use the committed Gradle
Wrapper (pinned to 9.7.1); a separate Gradle installation is not required. The first
run needs network access to download Gradle and the JUnit dependencies.

From PowerShell at the repository root:

```powershell
# Compile all starters and tests without running the tests
.\gradlew.bat testClasses

# Run Closest Carrot
.\gradlew.bat test --tests "interview.prep.algorithms.closestcarrot.SolutionTest"

# Run all Java exercise tests
.\gradlew.bat test
```

On macOS/Linux, use `./gradlew` instead of `.\gradlew.bat`.
The HTML test report is generated at `build/reports/tests/test/index.html`.

Unsolved starters intentionally fail behavioral tests. A successful setup means
the starter and tests compile, tests are discovered and executed, and failures are
assertion failures caused by the placeholder. Do not disable tests or generate a
solution just to obtain a passing build.

### Shared Java conventions

The root build discovers each `problems/<category>/<problem>/java/` directory.
Inside it, `src/main/java` contains implementations and `src/test/java` contains
tests and test helpers. Every problem has a unique package
`interview.prep.<category>.<problem-slug-with-hyphens-removed>`; check for collisions.
For Closest Carrot this is `interview.prep.algorithms.closestcarrot`.
This permits each problem to retain the filenames `Solution.java` and `SolutionTest.java`.

Below each source root, directories must match the declared package. Closest Carrot's
files therefore live under `interview/prep/algorithms/closestcarrot/`. This layout
lets Java editors resolve packages and distinguish test dependencies correctly.
Each exercise remains self-contained; there are no per-exercise Gradle projects.

After source-root changes, run **Java: Clean Java Language Server Workspace** from
VS Code's Command Palette and accept the reload to reimport the Gradle project.
Open the repository root and use the Red Hat Java tooling for this workspace.

All Java exercises share source sets, dependencies, and the Java 21 toolchain.
Selecting one test class still compiles all Java exercises, so keep every starter
compilable. Python, TypeScript, React, API, and SQL tooling can be added when needed;
the current build only configures Java.

### Adding an exercise

Use Closest Carrot as the canonical example. Create the statement and metadata,
then a minimal compiling starter and comprehensive tests in the language directory.
Preserve supplied examples and document input assumptions. Never generate the
completed solution unless explicitly requested.

Metadata is plain YAML, without Markdown fences. Required fields are `title`,
`type`, `difficulty`, `data_structures`, `algorithms`, `concepts`, `patterns`,
`languages`, and `status`. Classification fields and languages are lists of
lowercase kebab-case labels; use `[]` when empty. Difficulty is `easy`, `medium`,
or `hard`; status is `unsolved`, `in-progress`, or `solved`. Algorithm exercises
use `type: algorithm`. Algorithm labels belong in metadata; the statement and
starter should not reveal the intended approach.

The primary development environment is Visual Studio Code.

Java exercises use:

* Java
* JUnit 5
* Gradle

Additional tooling will be added as support for other problem types and languages is introduced.

## Project Status

This project is currently under active development.

The initial focus is establishing a reliable Java algorithm workflow:

**Problem → Agent Setup → Starter Code → Unit Tests → Implementation → Test → Review**

Once that workflow is established, the repository will expand to additional languages and interview formats.
