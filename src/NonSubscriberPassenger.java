class NonSubscriberPassenger extends Passenger {
    private boolean discount_Coupon;

    public NonSubscriberPassenger(String name, String id, boolean hasCoupon) {
        super(name, id);
        this.discount_Coupon = hasCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("cannot reserve car  maximum capacity is zero");
        }
        setReservedCar(car);
        if (discount_Coupon) {
            setTripCost(car.getRoute().getPrice() - (car.getRoute().getPrice()*0.10));
        } else {
            setTripCost(car.getRoute().getPrice());
        }
    }
}