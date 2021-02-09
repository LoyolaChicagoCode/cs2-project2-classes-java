# Loyola COMP 271 Lab 1: Classes

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
    - What is the difference between `inst1`, `inst2`, and `inst3`?
    - Why is `main` able to access `var3` and `var4` even though those are private?
    - Why is `main` able to access `var1` and `var2` without going through an instance?
    - What is happening when we modify `inst2.var2` and then print `inst1.var2`?
    - What is happening on line 12 (in the second `Lab1` constructor)?
    - What is happening in `method3`?
    - Why can't we print the result of `method4`?
1. Export your project as a zip file and submit it (individually) as an attachment in Sakai.