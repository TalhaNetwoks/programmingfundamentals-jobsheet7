import java.util.Scanner;
public class cinemaTicket24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // cinema ticket price calculation using do while loop
        int tickets;
        int ticketPrice = 50000;
        int totalTickets = 0;
        double totalRevenue = 0;
        String choice = "yes";
        // using do while loop to calculate total tickets and revenue
        do {
            System.out.print("Enter the number of tickets sold (type -1 to exit): ");
            int ticketsSold = input.nextInt();
            if (ticketsSold == -1) {
                System.out.println("Exiting the program.");
                break;
            }
            if (ticketsSold <0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }
            double price;
            if (ticketsSold > 10){
            price = ticketsSold * ticketPrice * 0.85;  
            }else if (ticketsSold > 4){
                price = ticketsSold * ticketPrice * 0.90;
            }else{
                price = ticketsSold * ticketPrice;
            }
             totalTickets += ticketsSold;
             totalRevenue += price;

            System.out.println("Total price for " + ticketsSold + " tickets: Rp " + price);
            System.out.print("Do you want transaction (yes / No) : ");
            String choice1 = input.next();
            choice = choice1;

        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("total tickets sold: " + totalTickets);
        System.out.println("total revenue: Rp " + totalRevenue);
        
    
}
}
