public enum CountryOfManufactore {

    JAPAN("Toyota Lexus"),
    GERMANY("Mercedes BMW ");

    private final String brands;

    public String getBrands() {
        return brands;
    }

    CountryOfManufactore(String brands) {
        this.brands = brands;
    }


}
