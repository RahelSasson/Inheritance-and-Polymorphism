public class CargoShip extends Ship{
    private int tonnsCargoCapacity;

    public CargoShip(String name, int tonnsCargoCapacity){
        super(name,"0000");
        this.tonnsCargoCapacity = tonnsCargoCapacity;
    }

    public int getTonnsCargoCapacity() {
        return tonnsCargoCapacity;
    }

    @Override
    public String toString() {
        return "Ship name: " + super.getShipName() + "   Cargo Capacity in tonnage : " + tonnsCargoCapacity;

    }
}
