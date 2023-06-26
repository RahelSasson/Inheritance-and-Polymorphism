public class CruiseShip extends Ship{

    private int maxPassengers;

    public CruiseShip(String name, int maxPassengers) {
        super(name,"0000");
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Ship name: " + super.getShipName() + "   Maximum Passengers: " + maxPassengers;
    }
}
