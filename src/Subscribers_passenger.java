class SubscriberPassenger extends Passenger {
    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("cannot reserve car  maximum capacity is zero");
        }
        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.50);
    }
}