//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("*******");
        System.out.println("Welcome to our dealership!");
        Slogan dealershipSlogan = new Slogan();
        dealershipSlogan.brandSlogan("WestCoast Motors - always the best choice");

        // Home task requirements checklist :
        // Use all exception keywords
        // Create a new exception


        System.out.println("Our automobiles are presented by best European brands from " + CountryOfManufactore.JAPAN + " and " + CountryOfManufactore.GERMANY);
        System.out.println("We are official partners of " + CountryOfManufactore.JAPAN.getBrands() + CountryOfManufactore.GERMANY.getBrands());
        System.out.println("Please take a look at our available cars");
        System.out.println(" ");

        Brand toyota = new Brand("");
        Brand lexus = new Brand("");
        Brand mercedes = new Brand("");
        Brand bmw = new Brand("");

        Brand westCoastMotorsBrand = new Brand("");

        toyota.setBrandName("Toyota");
        lexus.setBrandName("Lexus");
        mercedes.setBrandName("Mercedes");
        bmw.setBrandName("BMW");

        Model model001 = new Model("RAV4",2020, 28000, "1 year");
        model001.setBodyType("SUV");
        model001.setVehicleCondition("Used");
        model001.setColor("Grey");

        Model model002 = new Model("ES300",2024, 65000,"3 years");
        model002.setBodyType("Sedan");
        model002.setVehicleCondition("Brand New");
        model002.setColor("Black");

        Model model003 = new Model("S Class",2024, 100000,"3 years");
        model003.setBodyType("Sedan");
        model003.setVehicleCondition("Brand New");
        model003.setColor("Black");

        Model model004 = new Model("M4",2023, 80000,"3 years");
        model004.setBodyType("Coupe");
        model004.setVehicleCondition("Brand New");
        model004.setColor("Red");

        Cars.ColorType metallic1 = model001.new ColorType();
        Cars.ColorType metallic2 = model002.new ColorType();
        Cars.ColorType metallic3 = model003.new ColorType();
        Cars.ColorType metallic4 = model004.new ColorType();

        //Toyota RAV4 2020 SUV
        System.out.println("Brand : " + toyota.getBrandName());
        Slogan toyotaSlogan = new Slogan();
        toyotaSlogan.brandSlogan("Always A Better Way");
        System.out.println("Body Type: " + model001.getBodyType());
        System.out.println("Model Name: " + model001.getModelName());
        System.out.println("Year: " + model001.getYear());
        System.out.println("Color: " + model001.getColor());
        metallic1.metallicTypeIsNotAvailable();
        System.out.println("Condition: " + model001.getVehicleCondition());
        System.out.println("Warranty: " + model001.getWarranty());
        System.out.println("Price: " + model001.getPrice());
        model001.isAvailable(); // Interface Availability, method isAvailable()


        System.out.println("*******");
        //Lexus ES300 2024 Sedan
        System.out.println("Brand : " + lexus.getBrandName());
        Slogan lexusSlogan = new Slogan();
        lexusSlogan.brandSlogan("The Pursuit of Perfection");
        System.out.println("Body Type: " + model002.getBodyType());
        System.out.println("Model Name: " + model002.getModelName());
        System.out.println("Year: " + model002.getYear());
        System.out.println("Color: " + model002.getColor());
        metallic2.metallicTypeIsAvailable();
        System.out.println("Condition: " + model002.getVehicleCondition());
        System.out.println("Warranty: " + model002.getWarranty());
        System.out.println("Price: " + model002.getPrice());
        model002.isAvailableForOrder(); // Interface Availability, method isAvailableForOrder()

        System.out.println("*******");
        //Mercedes S Class 2024 Sedan
        System.out.println("Brand : " + mercedes.getBrandName());
        Slogan mercedesSlogan = new Slogan();
        mercedesSlogan.brandSlogan("The best or nothing");
        System.out.println("Body Type: " + model003.getBodyType());
        System.out.println("Model Name: " + model003.getModelName());
        System.out.println("Year: " + model003.getYear());
        System.out.println("Color: " + model003.getColor());
        metallic3.metallicTypeIsNotAvailable();
        System.out.println("Condition: " + model003.getVehicleCondition());
        System.out.println("Warranty: " + model003.getWarranty());
        System.out.println("Price: " + model003.getPrice());
        Availability.isNotAvailable(); // Interface Availability, method isNotAvailable()

        System.out.println("*******");
        //BMW M5 2023 Coupe
        System.out.println("Brand : " + bmw.getBrandName());
        Slogan bmwSlogan = new Slogan();
        bmwSlogan.brandSlogan("Sheer Driving Pleasure");
        System.out.println("Body Type: " + model004.getBodyType());
        System.out.println("Model Name: " + model004.getModelName());
        System.out.println("Year: " + model004.getYear());
        System.out.println("Color: " + model004.getColor());
        metallic4.metallicTypeIsNotAvailable();
        System.out.println("Condition: " + model004.getVehicleCondition());
        System.out.println("Warranty: " + model004.getWarranty());
        System.out.println("Price: " + model004.getPrice());
        model004.isAvailable(); // Interface Availability, method isAvailable()

        System.out.println("*******");

        System.out.println("Total number of vehicles: " + Model.getNumOfVehicles());
        westCoastMotorsBrand.displaySlogan();
        System.out.println("Thanks for visiting");

    }
}




