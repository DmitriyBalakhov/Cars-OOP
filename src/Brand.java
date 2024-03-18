public class Brand extends Cars {

    /* Public class Brands is a subclass of class Cars
    and contains data about vehicle brand name, body type and its warranty policy.
    */

    private String brandName;
    private String bodyType;
    private final String warranty;

    public Brand(String warranty) {
        this.warranty = warranty;
    }

    //Method getBrandName is used for getting brand name of a vehicle.
    public String getBrandName() {
        return brandName;
    }

    //Method getBrandName is used for setting brand name for a vehicle.
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    //Method getWarranty is used for getting warranty policy of a vehicle.
    public String getWarranty() {
        return warranty;
    }

    //Method getWarranty is used for getting warranty policy of a vehicle.
    public String getBodyType() {
        return bodyType;
    }

    //Method setBodyType is used for setting body type for a vehicle.
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    //Method displaySlogan is designed to print out brand's slogans.
    public void displaySlogan() {

    }

}