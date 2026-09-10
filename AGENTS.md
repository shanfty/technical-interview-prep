# Repository Instructions

## Purpose

This repository contains runnable technical interview practice problems.

The repository is designed so that an AI coding agent can turn a provided
interview question into a local exercise without solving the problem for the user.

The repository supports:

- Algorithms and data structures
- React problems
- API/backend problems
- SQL problems
- Multiple programming languages

## Core Rules

When creating a new interview problem:

1. Preserve the distinction between:
   - problem description
   - metadata
   - starter code
   - tests
   - completed solution
2. Create the problem statement separately from the implementation.
3. Generate runnable tests.
4. Do not implement the solution unless explicitly requested.
5. Do not include hints that reveal the intended algorithm unless requested.
6. Prefer minimal starter code.
7. Make the exercise runnable with one command.
8. Inspect existing problems before creating a new structure or convention
9. Reuse existing build and test infrastructure when possible.
10. Follow existing repository conventions before introducing new patterns.

## Problem Structure

Every exercise must contain a problem description.

Example:

problems/algorithms/closest-carrot/problem.md

Language implementations should be stored separately from the problem description.

Example:

problems/algorithms/closest-carrot/
├── problem.md
├── java/
├── python/
└── typescript/

## Java Algorithm Problems

Use:

- Java 21
- JUnit 5
- Gradle

The implementation file should contain only the required method/class structure and minimal placeholder code.

Example:

```java
public class Solution {

    public static int closestCarrot(...) {
        // TODO
        return -1;
    }
}
```

## Canonical Exercise and Shared Build

- Use `problems/algorithms/closest-carrot/` as the canonical Java example.
- Keep `problem.md` and `metadata.yaml` at the problem root, with language files in their own directories.
- Use the root Gradle build and wrapper; do not create a Gradle project per algorithm exercise.
- Java source files live directly in `problems/<category>/<problem>/java/`.
- Use a unique package: `interview.prep.<category>.<problem-slug-with-hyphens-removed>`.
  Check for package collisions before adding a problem.
- Name the starter `Solution.java` and the JUnit test `SolutionTest.java`.
  The shared build treats `*Test.java` as test sources and other Java files as main sources.
- Keep JUnit-only helpers inside the test class so they are not compiled as main sources.
- State input assumptions and expected behavior explicitly. Cover examples, normal cases,
  edge cases, and boundaries without embedding a reference solution in the tests.
- Verify with `./gradlew testClasses` and a focused `./gradlew test --tests "<package>.SolutionTest"`.
  On Windows PowerShell use `.\gradlew.bat`.
- An unsolved starter must compile and tests must execute. Expected behavioral assertion
  failures are acceptable; do not implement a solution, weaken tests, or disable tests to make them pass.
- A focused test run still compiles all Java exercises in the shared source sets.

## Metadata

Use plain YAML, without Markdown fences. Required fields are `title`, `type`,
`difficulty`, `data_structures`, `algorithms`, `concepts`, `patterns`, `languages`, and `status`.
Use `easy`, `medium`, or `hard` for difficulty and `unsolved`, `in-progress`, or `solved`
for status. Use YAML lists for classification fields and languages, with lowercase
kebab-case labels; use `[]` where no labels apply. Java algorithm exercises use
`type: algorithm` and include `java` in languages. Choose an appropriate type for
future categories rather than moving problems into concept-specific directories.

Classification metadata may name algorithms; do not repeat solution-revealing hints
in the problem description or starter. Preserve the user's supplied question and
examples; document any necessary input assumptions. Never mark an exercise solved
merely because its scaffolding is complete.
