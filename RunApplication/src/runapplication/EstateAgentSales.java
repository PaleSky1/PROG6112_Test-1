package runapplication;

class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("\nESTATE AGENT REPORT");
        System.out.println("**************************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }
}
