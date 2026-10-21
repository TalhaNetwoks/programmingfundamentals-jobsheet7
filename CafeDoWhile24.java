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
