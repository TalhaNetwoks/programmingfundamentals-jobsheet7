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
5. Code has been comited.

---

### 2.2 Experiment 2: Student Grades Case Study in SIAKAD – WHILE Loop
A lecturer wants to enter the scores of several students into SIAKAD in order to determine
their letter grades. The program must prompt the lecturer to enter the score of each student.
If the lecturer enters an invalid score (negative or greater than 100), the program must ignore
the input and ask the lecturer to re-enter it. Valid scores are then classified into letter grades:
A (80 < score ≤ 100), B+ (73 < score ≤ 80), B (65 < score ≤ 73), C+ (60 < score ≤ 65), C (50 <
score ≤ 60), D (39 < score ≤ 50), and E (score ≤ 39).
Based on this case study, write a program using the Java programming language.

#### Java programming COde:
 ``` java
import java.util.Scanner;
public class SiakadWhile24 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        // using Dowhile loop //#endregion

        int score, StudentCount, i = 0;

        System.out.print("Enter the number of Students : ");
        double studentCount = input.nextDouble();

       while (i < studentCount) {
        i++;
        System.out.println("Enter the score for the Student : " + (i+1) + ": ");
        score =input.nextInt();
         if (score < 0 || score > 100 )
         {
            System.out.print("Invalid score, Please enter a valid score!");

         }
         if (score > 80 && score <=100 ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is A");
            System.out.println("Well Done, keep the good work");
         }else if (score > 73 && score <= 80  ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is B+");
         }else if (score > 65 && score <=73 ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is B");
       } else if (score > 60 && score <=65 ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is C+");
       }else if (score > 50 && score <= 60 ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is C");
        }
        else if (score > 39 && score <= 50 ){
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is D");
        }else {
            System.out.println(" The Grade of the Student: "+ (i+1)+ " is E");
        }
       }

    }
}
```
#### Output:

    Enter the number of Students : 3
    Enter the score for the Student : 2: 
    34
    The Grade of the Student: 2 is E
    Enter the score for the Student : 3: 
    98
    The Grade of the Student: 3 is A
    Enter the score for the Student : 4: 
    98
    The Grade of the Student: 4 is A


#### 2.2.3 Questions
1. In the following code snippet, determine the meaning and purpose of the following
syntax:
if (score < 0 || score > 100) {
 System.out.println("Invalid score. Please enter a valid score!");
 continue;
}
a. score < 0 || score > 100
b. continue
2. Why is the i++ statement written at the end of the WHILE loop? What happens if it is
written at the beginning of the WHILE loop?
3. If the number of students entered is 19, how many times will the WHILE loop run?
4. Modify the program so that, if a student receives grade A, the program displays an
additional message “Well done, keep up the good work!”
5. Commit and push the program code to GitHub.

#### Answers:
1. the if condition is to pass the score through the OR logical oporator. if the score is greter then 0 and less then 100 then the condation is valid so it will go for the farther process.
2. At the end: It ensures the current student is processed before moving to the next one.
 At the beginning: It would skip the first student (index 0) and cause the loop to count incorrectly.
3. obusly it will 19 times.
4. The code has been updated.
5. Push the code to the github. DOne.

---

#### 2.3 Experiment 3: Café Transaction Case Study – DO-WHILE Loop

At a café, a cashier wants to process the transactions of several customers. A customer
may buy more than one item (coffee at Rp 12,000, tea at Rp 7,000, and bread at Rp 20,000),
and the cashier will continue to enter the purchase quantities for each customer. If a
customer decides to cancel the transaction (by entering “cancel”), the cashier stops entering
transactions and the program terminates.

##### Program:
``` java
import java.util.Scanner;
public class CafeDoWhile24 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int coffee , bread , tea;
        String customerName;
        int totalPrice;
        int coffeePrice = 12000, teaPrice = 7000 , breadPrice = 20000;

        do {
            System.out.println("Enter customer name (type 'cancel' to exit) : ");
            customerName = input.nextLine();
            if (customerName.equalsIgnoreCase("cancel")){
                System.out.println("Transaction canceled .");
                break;
            }
            System.out.println("Coffee quantity :");
            coffee = input.nextInt();
            System.out.println("Tea Quantity: ");
            tea = input.nextInt();
            System.out.println("Bread Quantinty");
            bread = input.nextInt();
             totalPrice = (coffee*coffeePrice) + (tea*teaPrice) + (bread*breadPrice);

             System.out.println("TOtal amount to pay : Rp " + totalPrice);
             input.nextLine();
        } while (true);
        System.out.println("All transactions Completed.");
        

        }


    }
```

##### Output:
    Enter customer name (type 'cancel' to exit) : 
    Muhammad Talha
    Coffee quantity :
    1
    Tea Quantity: 
    1
    Bread Quantinty
    2
    TOtal amount to pay : Rp 59000
    Enter customer name (type 'cancel' to exit) : 
    cancel
    Transaction canceled .
    All transactions Completed.

#### Questions:
1. In this DO-WHILE loop, if the first customer name entered is “cancel”, how many times is
the loop executed?
2. State the stopping condition used in this DO-WHILE loop!
3. What is the function of using the value true in the DO-WHILE condition?
4. Why does this DO-WHILE loop still run even though it has no initialization and update
components?

##### Answers:
1. in DO While loop if the input in the first stage is cancel so the program will stop no longer then it.only reuns for one time bcs the checking the conditon at least one time.
2. The stoping condition for the program is if the costumer inter the cancel so the proram will stop.
3. It creates the inifte loop so the number of customer is unknown so the loop will only stop on break.
4. this is not like a FOR loop that need condition DO-WHILE loop only needs a condition and relies on break to stop.

----