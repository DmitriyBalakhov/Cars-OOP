//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("*******");
        System.out.println("Welcome to our dealership!");

        Slogan dealershipSlogan = new Slogan();
        dealershipSlogan.mySlogan("WestCoast Motors - always the best choice");

        System.out.println("Please take a look at our available cars");
        System.out.println(" ");

        // My home task requirements checklist :
        // abstract(class AND method) DONE in public abstract class Cars, abstract void displaySlogan
        // final(variable AND class) DONE in private final String modelName, public final class Slogan
        // Add overridden and overloaded (methods OR constructors) DONE in class Lexus/Toyota(@Override) and in class Slogan(Overload)
        // Use super (with constructors OR methods OR variables) DONE in class Model

        Brand toyota = new Brand("");
        Brand lexus = new Brand("");
        Brand westCoastMotorsBrand = new Brand("");
        Toyota toyotaSlogan = new Toyota();
        Lexus lexusSlogan = new Lexus();

        toyota.setBrandName("Toyota");
        toyota.setBodyType("SUV");

        lexus.setBrandName("Lexus");
        lexus.setBodyType("Sedan");

        Model model001 = new Model("RAV4",2020, 28000, "1 year or 20 000km");
        model001.setVehicleCondition("Used");
        model001.setColor("Grey");

        Model model002 = new Model("ES300",2024, 65000,"3 years or 100 000km");
        model002.setVehicleCondition("Brand New");
        model002.setColor("Black");


        System.out.println("Brand : " + toyota.getBrandName());
        toyotaSlogan.displaySlogan();
        System.out.println("Body Type: " + toyota.getBodyType());
        System.out.println("Model Name: " + model001.getModelName());
        System.out.println("Year: " + model001.getYear());
        System.out.println("Color: " + model001.getColor());
        System.out.println("Condition: " + model001.getVehicleCondition());
        System.out.println("Warranty: " + model001.getWarranty());
        System.out.println("Price: " + model001.getPrice());

        System.out.println("*******");

        System.out.println("Brand : " + lexus.getBrandName());
        lexusSlogan.displaySlogan();
        System.out.println("Body Type: " + lexus.getBodyType());
        System.out.println("Model Name: " + model002.getModelName());
        System.out.println("Year: " + model002.getYear());
        System.out.println("Color: " + model002.getColor());
        System.out.println("Condition: " + model002.getVehicleCondition());
        System.out.println("Warranty: " + model002.getWarranty());
        System.out.println("Price: " + model002.getPrice());

        System.out.println("*******");

        System.out.println("Total number of vehicles: " + Model.getNumOfVehicles());
        westCoastMotorsBrand.displaySlogan();
        System.out.println("Thanks for visiting");

    }
}




