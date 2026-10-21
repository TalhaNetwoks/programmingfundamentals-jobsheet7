import java.util.Scanner;

public class SiakadFor24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare 
        double score, highest= 00 , lowest = 100;
        int passCount = 0;
        int failCount = 0;


        for (int i = 1 ; i <= 10 ; i++){
            System.out.print("Enter the scote of Student " + i + ": ");
            score = input.nextDouble();
            if (score > highest) {
                highest = score;

            }if ( score < lowest) {
                lowest = score;
            } // conditaion for the pass and fail student 
             else if (score >= 60){
                passCount ++;
            }else {
                failCount ++;
            }

        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        // pass and fail student disply 
        System.out.println("The number of student who pass : " + passCount);
        System.out.println("The number of student who fail : " + failCount);
        
    }
}