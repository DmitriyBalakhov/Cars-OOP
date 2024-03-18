abstract class Cars implements Availability{

    //Abstract class Cars contains data about vehicle condition and its color.

    private String vehicleCondition;
    private String color;

    //Method displaySlogan is designed to print out brand's slogans.
    public abstract void displaySlogan();

    //Method getVehicleCondition is used for getting vehicle condition status.
    public String getVehicleCondition() {
        return vehicleCondition;
    }

    //Method setVehicleCondition is used to set vehicle condition status. It can be "Used" or "Brand New"
    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    //Method getColor is used to get vehicle condition color.
    public String getColor() {
        return color;
    }

    //Method setColor is used to set vehicle condition color.
    public void setColor(String color) {
        this.color = color;
    }

    class ColorType {
        void metallicTypeIsAvailable () {
            System.out.println("Metallic color type is available for this model");
        };
        void metallicTypeIsNotAvailable () {
            System.out.println("Metallic color type is not available for this model");
        };

    }

}