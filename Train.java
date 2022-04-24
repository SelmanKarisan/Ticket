public class Train extends Transit {

    public Train(double price, String travelTime, String destination, String initialLocation, double coefficentOfPrice,
            int maxSeatCapacity) throws Exception {
        super(price, travelTime, destination, initialLocation, coefficentOfPrice, maxSeatCapacity);
        super.generateSeats(maxSeatCapacity);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        setPrice(getPrice()*getCoefficentOfPrice()*getTravelTimeValue());

    }

    @Override
    public void createSeat() {
    
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
