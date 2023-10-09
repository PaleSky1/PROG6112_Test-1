package runapplication;

import java.util.Scanner;

public class RunApplication {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the current estate agent name: ");
            String agentName = scanner.nextLine();
            
            System.out.print("Enter the property price: ");
            double propertyPrice = scanner.nextDouble();
            
            // Instantiate EstateAgentSales with user input
            EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);
            
            // Print property report
            agent.printPropertyReport();
        }
    }
}
