# Java Loops II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

> "In computing, *End Of File* (commonly abbreviated *EOF*) is a condition in a computer operating system where no more data can be read from a data source."
&mdash; <cite>([Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file))</cite>
    
The challenge here is to read $n$ lines of input until you reach *EOF*, then number and print all $n$ lines of content.

**Hint:** Java's *Scanner.hasNext()* method is helpful for this problem.


**Input Format**

Read some unknown $n$ lines of input from *stdin(System.in)* until you reach *EOF*; each line of input contains a non-empty *String*.

**Constraints**

 

**Output Format**

For each line, print the line number, followed by a single space, and then the line content received as input.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T14:29:51.700Z  

```java
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
         for(int k=0;k<q;k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;

            for (int i = 0; i < n; i++) {
                sum += (1 << i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-end-of-file/problem)