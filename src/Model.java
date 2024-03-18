public class Model extends Brand {
    private static int numOfVehicles = 0;
    private final String modelName;
    private int year;
    private int price;


    public Model(String modelName, int year, int price, String warranty) {
        super(warranty);
        this.modelName = modelName ;
        this.year = year;
        this.price = price;
        numOfVehicles++;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getNumOfVehicles() {
        return numOfVehicles;
    }
    public void displaySlogan() {
        // {System.out.println("WestCoast Motors - always the best choice");}
    }
}