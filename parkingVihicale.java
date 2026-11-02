import java.util.Scanner;
public class parkingVihicale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        String vehicleType;
        int hoursParked;
        int totalFee = 0;

        System.out.println("\tWelcome to the Parking Fee Calculator!");
        
        do { 
            System.out.print("\tVehicle type (car = 1/ motorcycle = 2) or (exit = 0) : ");
            vehicleType = scanner.nextLine().toLowerCase();

            if (vehicleType.equals("0")) {
                break;
            }

            System.out.print("\tEnter the number of hours parked : ");
            hoursParked = scanner.nextInt();
            scanner.nextLine(); 

            if (vehicleType.equals("1")) {
                totalFee += hoursParked * 3000;
            } else if (vehicleType.equals("2")) {
                totalFee += hoursParked * 2000;
            } else {
                System.out.println("\tInvalid vehicle type. Please enter 1 for car or 2 for motorcycle.");
            }


        } while (!vehicleType.equals("0"));
        System.out.println("\tTotal parking fee: Rp " + totalFee);

    }
}
