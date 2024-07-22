public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Address 1", "Address 2", 100.0);
        Route route2 = new Route("Address 3", "Address 4", 100.0);
        Car car1 = new Car("Toyota", route1, 9);
        Car car2 = new Car("mazda", route2, 0);



        Passenger[] passengers = {
                new SubscriberPassenger(" HASSAN Subscriber_Passenger", "H122"),
                new NonSubscriberPassenger("ALI Non-Subscriber_Passenger", "A223", true)
        };



        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof SubscriberPassenger) {
                    passenger.reserveCar(car1);
                } else {
                    passenger.reserveCar(car2);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            passenger.displayInfo();
            System.out.println("===================");
        }
    }
}