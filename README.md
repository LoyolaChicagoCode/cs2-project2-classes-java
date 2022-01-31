# Loyola COMP 271 Lab 1: classes

## Group activity

In this lab, based on chapter 8 of the BJP text, we are going to explore class and object structures in Java.

# Design space

## All members

- access: public vs private (vs anything else?)

## Variables

- modifiability: final vs nonfinal
- scope: field (class/instance var) vs method argument vs local variable (can be nested)

## Methods

- kind: static vs instance vs constructor
- effect: observer vs mutator

# Your job

1. Create a suitable Java project and add `Lab1.java` as a source file.
1. Run the program and record the output; for example, cut and paste it into a new file `output.txt` in your project.
1. In a new file `Answers.md` in your project, classify each variable *(including all method arguments)* and method according to the possible characteristics given above (under design space). (Consider using a table/spreadsheet for this task.)
1. Also in `Answers.md`, answer the following questions 
    - What is the difference between objects `loyola`, `granville`, and `thorndale`?
    - Why is `main` able to access `lat`, `lon`, etc., even though those are private?
    - Why is `main` able to access `city` and `fare` without going through an instance?
    - What is happening when we modify `granville.fare` and then print `loyola.fare`?
    - What is happening on lines 21-26 (in the second `Station` constructor)?
    - What is happening in `relocate`?
    - Why can't we print the result of `reportStatus`?
    - Can you think of a better way to print a station's info than printing each instance variable separately?
1. Export your project as a zip file and submit it (individually) as an attachment in Sakai.