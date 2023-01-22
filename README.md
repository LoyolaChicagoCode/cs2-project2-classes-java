# Loyola COMP 271 Project 2: classes

## Group activity

In this lab, based on chapter 8 of the BJP text, we are going to explore class and object structures in Java.

## Design space

### All members

- access: public vs private (vs anything else?)

### Variables

- modifiability: final vs nonfinal
- scope: field (class/instance var) vs method argument vs local variable (can be nested)

### Methods

- kind: static vs instance vs constructor
- effect: observer vs mutator

## Your job

1. Start with the given Java project.
1. Make the changes required to get the code to compile based on our discussion in class.
1. Run the program and record the output; for example, cut and paste it into a new file `output.txt` in your project. It should look more or less like this:
    ```
    Chicago/Loyola (RED line) located at 42.0005321,-87.6654555
    Chicago/Granville (RED line) located at 41.9946956,-87.6648976
    Chicago/Thorndale (RED line) located at 41.9937068,-87.6627518
    
    Loyola
    2.75
    
    Chicago/Wilson (RED line) located at 41.9946956,-87.6648976
    
    Wilson station is OPEN
    distance from loop: 0.11857532043861277 degrees
    new distance from loop: 0.1153956854354595 degrees
    Berwyn
    
    Wilson
    Chicago
    2.75
    ```
  1. In a new file `Answers.md` in your project, classify each variable *(including all method arguments)* and method according to the possible characteristics given above (under design space). (Consider using a table/spreadsheet for this task.)
1. Also in `Answers.md`, answer the following questions 
    - What is the difference between objects `loyola`, `granville`, and `thorndale`?
    - Why is `main` unable to access `lat`, `lon`, etc?
    - Why is `main` able to access `city` and `fare` without going through an instance?
    - What is happening when we modify `granville.fare` and then print `loyola.fare`? Can you think of a better way to provide this capability?
    - What is happening on lines 21-26 (in the second `Station` constructor)?
    - What is happening in `relocate`?
    - Why can't we print the result of `reportStatus`?
    - Can you think of a better way to print a station's info than printing each instance variable separately?

## Grading (total 5 points)

- 1 submission via Replit
- 1 program compiles and runs
- 1 correct output
- 2 meaningful answers to questions
