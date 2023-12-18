# Brain Games CLI Utility

## Tests and linter status
[![Java CI](https://github.com/dariakoval/java-project-61/actions/workflows/generate.yml/badge.svg)](https://github.com/dariakoval/java-project-61/actions/workflows/generate.yml)     [![Maintainability](https://api.codeclimate.com/v1/badges/fe97f0be1e7c92a35a7b/maintainability)](https://codeclimate.com/github/dariakoval/java-project-61/maintainability)

## Description
This application contains five mini games:
* **"Parity check"**
* **"Calculator"**
* **"Greatest common divisor"**
* **"Arithmetic Progression"**
* **"Is it a prime number?"**

## How to play
To run the game, the user needs to execute the command `make run-dist` from the root directory app/. Then the user needs to enter the game number and their name. After the welcome message the user will be able to read the rules of the selected game.
Each game has three rounds. The user must give the correct answer to three questions in a row. After a successful game, the terminal displays a message with congratulations and the game ends. If the user enters an incorrect answer, the game ends.

*To see more about gameplay go to asciinemas.*

## Asciinema for game: Even
[![asciicast](https://asciinema.org/a/pZJSL3Mqo0bTXy4coLLZs1J39.svg)](https://asciinema.org/a/pZJSL3Mqo0bTXy4coLLZs1J39)

## Asciinema for game: Calc
[![asciicast](https://asciinema.org/a/57o2RjgaZQJFLYAbd0K9jGybS.svg)](https://asciinema.org/a/57o2RjgaZQJFLYAbd0K9jGybS)

## Asciinema for game: GCD
[![asciicast](https://asciinema.org/a/P71M54GJozfX31u94kvUWWwKy.svg)](https://asciinema.org/a/P71M54GJozfX31u94kvUWWwKy)

## Asciinema for game: Progression
[![asciicast](https://asciinema.org/a/MT8Avfx7gptnlCSg5UYapV9Ln.svg)](https://asciinema.org/a/MT8Avfx7gptnlCSg5UYapV9Ln)

## Asciinema for game: Prime
[![asciicast](https://asciinema.org/a/NHiG6NwTQzhuaSVYTbaVjxCay.svg)](https://asciinema.org/a/NHiG6NwTQzhuaSVYTbaVjxCay)

## Requirements
* JDK 17
* Gradle 7.4
* GNU Make

## Technology stack
Java, Gradle, GNU Make, Checkstyle, Code Climate.

## Setup
```bash
make setup
```

## Build
```bash
make build
```

## Run
```bash
cd app
make run-dist
```
