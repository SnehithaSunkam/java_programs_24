//2.Develop a Java application to generate Electricity bill. Create a class with the following  members:  Consumer  no.,  consumer  name,  previous  month  reading, current month reading, and type of EB connection (i.e. domestic or commercial). Compute the bill amount using the user defined tariff.
import java.util.Scanner;

public class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int prevReading;
    private int currReading;
    private String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, int prevReading, int currReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevReading = prevReading;
        this.currReading = currReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        int unitsConsumed = currReading - prevReading;
        double billAmount = 0;

        // Calculate bill based on connection type and units consumed
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.5;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1.5 + (unitsConsumed - 100) * 2.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1.5 + 100 * 2.5 + (unitsConsumed - 200) * 4;
            } else {
                billAmount = 100 * 1.5 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2.5;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 2.5 + (unitsConsumed - 100) * 4.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 2.5 + 100 * 4.5 + (unitsConsumed - 200) * 6;
            } else {
                billAmount = 100 * 2.5 + 100 * 4.5 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }

        return billAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter Consumer No.: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        int prevReading = scanner.nextInt();
        System.out.print("Enter Current Month Reading: ");
        int currReading = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, prevReading, currReading, connectionType);

        // Calculate and display the bill amount
        double totalBill = bill.calculateBill();
        System.out.println("\nElectricity Bill");
        System.out.println("------------------");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevReading);
        System.out.println("Current Month Reading: " + currReading);
        System.out.println("Units Consumed: " + (currReading - prevReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: $" + totalBill);
    }
}
