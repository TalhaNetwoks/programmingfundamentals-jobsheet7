 # JobSheet 7 Week (08)
 ## Name: Muhammad Talha
 ## NIM : 264107020089
 ## CLass: TI-1I

 ---
 ### Objectives
● Students are able to explain the syntax for writing loop programs (for, while, and dowhile).
● Students are able to implement loop flowcharts using the Java programming
language.

---

### 2.1 Experiment 1: Student Grades Case Study in SIAKAD – FOR Loop

In the Academic Information System (SIAKAD), a lecturer enters the grades of the
Programming Fundamentals Practicum course taken by students. The lecturer wants to find
the highest and lowest quiz scores among 10 students in one class. The lecturer must enter
the score of each student, and then determine and display the highest and lowest scores.

#### Java code: 

``` java
import java.util.Scanner;

public class SiakadFor24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare 
        double score, highest= 0 , lowest = 100;

        for (int i = 1 ; i <= 10 ; i++){
            System.out.print("Enter the scote of Student " + i + ": ");
            score = input.nextDouble();
            if (score > highest) {
                highest = score;

            }if ( score < lowest) {
                lowest = score;
            }

        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
    }
}
```

#### Output:

    Enter the scote of Student 1: 87
    Enter the scote of Student 2: 97
    Enter the scote of Student 3: 96
    Enter the scote of Student 4: 79
    Enter the scote of Student 5: 87
    Enter the scote of Student 6: 67
    Enter the scote of Student 7: 86
    Enter the scote of Student 8: 96
    Enter the scote of Student 9: 48
    Enter the scote of Student 10: 97
    Highest score: 97.0
    Lowest score: 48.0

##### Questions: 
1. Identify and indicate each component of the FOR loop in the program code of Experiment
1!
2. Why is the variable highest initialized to 0 and the variable lowest initialized to 100? What
happens if highest is initialized to 100 and lowest is initialized to 0?
3. Explain the function and workflow of the following code snippet!
if (score > highest) {
 highest = score;
}
if (score < lowest) {
 lowest = score;
}
4. Modify the program to count how many students pass and how many students fail, based
on the passing threshold (minimum score of 60). Display the number of students who
pass and fail after displaying the highest and lowest scores!
5. Commit and push the program code to GitHub

#### Answers:
1. for ( initialization ; condition ; update)
 a. initialization: loop variable like the (int i = 1).
 b. condition : the logic tell's to the loop when to keep the changes or running it (i <=10).
 c. update: the part that will change the variable afther each single step of loop (i++).
2. the first valid scote entered will successfully repelce them. if we put the highest = 100 and the lowest = 0 the the highest will remain 100 if no score bits it. while the lowest remain 0 if all scores are grater then 0.
3. The program will store the new highest value if it is grater then the 0 and save to lowest in it less then then 100 in the lowest and highest.
4. The program is been modified by the else if stament to count the pass and fail student count.