# AGENTS.md

## Cursor Cloud specific instructions

This repo (`java-ai-test`) is a single standalone Java source file (`Main.java`) with **no build tool**
(no Maven/Gradle) and no dependencies. A JDK (Java 21, includes `javac`) is preinstalled, so nothing
is installed by the environment update script.

### Commands
- Compile: `javac Main.java` (produces `Main.class`, which is untracked — clean it up before committing).
- Run: `java Main` (prints `123`).

### Notes
- `.github/workflows/main.yml` is a Cursor automated code-review workflow that runs on pull requests; it is unrelated to building/running the code and requires the `CURSOR_API_KEY` GitHub secret.
- There is no test suite; verification is compiling and running `Main.java`.
