public class Model extends Brand {

    /* Public class Model is a subclass of class Brand
    and contains data about model name, year of production, it's price,
    and counts total amount of car which is presented in dealership catalog.
    */

    private final String modelName;
    private int year;
    private int price;
    private static int numOfVehicles = 0;

    public Model(String modelName, int year, int price, String warranty) {
        super(warranty);
        this.modelName = modelName;
        this.year = year;
        this.price = price;
        numOfVehicles++;
    }

    //Method getPrice is used for getting vehicle's price.
    public int getPrice() {
        return price;
    }

    //Method setPrice is used for setting price for a vehicle.
    public void setPrice(int price) {
        this.price = price;
    }

    //Method getModelName is used for getting vehicle's model name.
    public String getModelName() {
        return modelName;
    }

    //Method getYear is used for getting vehicle's year of production.
    public int getYear() {
        return year;
    }

    //Method setYear is used for setting vehicle's year of production.
    public void setYear(int year) {
        this.year = year;
    }

    //Method getNumOfVehicles is used for getting the amount of vehicle's that presented in dealership catalog.
    public static int getNumOfVehicles() {
        return numOfVehicles;
    }

    //Method displaySlogan is designed to print out brand's slogans with is used by other classes.
    public void displaySlogan() {

    }

}

