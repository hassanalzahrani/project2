class Route {
    private String startPickup_Address;
    private String destination_Address;
    private double price;

    public Route(String startPickupAddress, String destinationAddress, double price) {
        this.startPickup_Address = startPickupAddress;
        this.destination_Address = destinationAddress;
        this.price = price;
    }

    public String getStartPickup_Address() {
        return startPickup_Address;
    }

    public String getDestination_Address() {
        return destination_Address;
    }

    public double getPrice() {
        return price;
    }
}