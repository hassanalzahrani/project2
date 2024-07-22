public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void reserveCar(Car car) throws Exception;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Reserved Car: " + (reservedCar != null ? reservedCar.getCode() : "None"));
        System.out.println("Trip Cost: " + tripCost);
    }

    public void setReservedCar(Car car) {
        this.reservedCar = car;
    }

    public void setTripCost(double cost) {
        this.tripCost = cost;
    }
}