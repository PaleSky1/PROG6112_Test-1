package runapplication;

abstract class EstateAgent implements iEstateAgent {
    private final String agentName;
    private final double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        return 0.20 * propertyPrice; // Commission is 20% of the property price
    }
}
