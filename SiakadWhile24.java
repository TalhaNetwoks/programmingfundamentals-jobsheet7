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

