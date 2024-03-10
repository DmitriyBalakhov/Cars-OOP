//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our dealership!");
        System.out.println("Please take a look of our available cars");
        System.out.println(" ");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cars lexus = new Cars("Lexus ");
        Lot lexusLot01 = new Lot("LXS01 ");
        System.out.println("Current model lot is: " + lexusLot01.getLot());
        Model lexusModel = new Model();
        lexusModel.setModel("RX300 ");
        Bodytype lexusBodytype = new Bodytype();
        lexusBodytype.setBodytype("SUV");
        Condition newCondition = new Condition("Brand new ");
        System.out.println(newCondition.getCondition() + lexus.getBrandName() + lexusModel.getModel() + lexusBodytype.getBodytype());
        lexus.setColor("blue");
        System.out.println("Color of model is " + lexus.getColor());
        lexus.setPrice(65000);
        System.out.println("Price - " + lexus.getPrice());
        System.out.println(" ");

        Cars mercedes = new Cars("Mercedes ");
        Lot mercedesLot01 = new Lot("MRS01 ");
        System.out.println("Current model lot is: " + mercedesLot01.getLot());
        Model mercedesModel = new Model();
        mercedesModel.setModel("E class ");
        Bodytype mercedesBodytype = new Bodytype();
        mercedesBodytype.setBodytype("SUV");
        System.out.println(newCondition.getCondition() + mercedes.getBrandName() + mercedesModel.getModel() + mercedesBodytype.getBodytype());
        mercedes.setColor("Silver");
        System.out.println("Color of model is " + mercedes.getColor());
        mercedes.setPrice(90000);
        System.out.println("Price - " + mercedes.getPrice());
        System.out.println(" ");

        Cars bmw = new Cars("BMW ");
        Lot bmwLot01 = new Lot("BMW01 ");
        System.out.println("Current model lot is: " + bmwLot01.getLot());
        Model bmwModel = new Model();
        bmwModel.setModel("M5 ");
        Bodytype bmwBodytype = new Bodytype();
        bmwBodytype.setBodytype("sedan");
        Condition usedCondition = new Condition("Used ");
        System.out.println(usedCondition.getCondition() + bmw.getBrandName() + bmwModel.getModel() + bmwBodytype.getBodytype());
        bmw.setColor("black");
        bmw.setPrice(49900);
        System.out.println("Color of model is " + bmw.getColor());
        System.out.println("Price of the day - " + bmw.getPrice());
        System.out.println(" ");

        Lot bmwLot02 = new Lot("BMW02 ");
        System.out.println("Current model lot is: " + bmwLot02.getLot());
        bmwModel.setModel("X6 ");
        bmwBodytype.setBodytype("SUV");
        System.out.println(usedCondition.getCondition() + bmw.getBrandName() + bmwModel.getModel() + bmwBodytype.getBodytype());
        bmw.setColor("Grey");
        bmw.setPrice(57000);
        System.out.println("Color of model is " + bmw.getColor());
        System.out.println("Price of the day - " + bmw.getPrice());
        System.out.println(" ");


        Cars honda = new Cars("Honda ");
        Lot hondaLot01 = new Lot("HND01 ");
        System.out.println("Current model lot is: " + hondaLot01.getLot());
        Model hondaModel = new Model();
        hondaModel.setModel("Civic Type R ");
        System.out.println(usedCondition.getCondition() + honda.getBrandName()+ hondaModel.getModel());
        honda.setColor("red");
        honda.setPrice(29900);
        System.out.println("Color of model is " + honda.getColor());
        System.out.println("Price of the day - " + honda.getPrice());
        System.out.println(" ");

        System.out.println("Total cars available in store : " + Lot.getNumberOfCars());

        Cars.ColorType metallic = mercedes.new ColorType();
        metallic.printName();


        //Cars.NestedStatic nestedStatic = new Cars.NestedStatic( );
        // nestedStatic.printStatic();
        honda.localClassExample();
        bmw.performAction();

    }
}