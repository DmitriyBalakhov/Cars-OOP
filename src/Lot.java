public class Lot {

    Lot(){
        // System.out.println("This is lot constructor.");
    }

    public String lot;
    public static int numberOfCars = 0;

    /**
     * This is constructor with 1 params
     * @param lot - lot {@link Cars}
     */

    Lot(String lot) {
        this.lot = lot;
        numberOfCars++;
    }

    public void setLot(String newLot) {
        lot = newLot;
    }

    public String getLot() {
        return lot;
    }
    protected static int getNumberOfCars() {
        return numberOfCars;
    }

}
