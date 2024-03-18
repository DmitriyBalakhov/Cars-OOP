public class Brand extends Cars {
    private String brandName;
    private String bodyType;
    private String warranty;

    public Brand(String warranty) {
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }


    public void displaySlogan() {
        // {System.out.println("WestCoast Motors - always the best choice");}
    }

}