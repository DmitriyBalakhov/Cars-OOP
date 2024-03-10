//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our dealership!");
        System.out.println("Please take a look of our available cars");
        System.out.println(" ");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cars suv = new Cars("Lexus ");
        Model suvModel = new Model();
        suvModel.setModel("RX300 SUV");
        Condition newCondition = new Condition("Brand new ");
        System.out.println(newCondition.getCondition() + suv.getBrandName() + suvModel.getModel());
        SUV Lexus = new SUV();
        suv.setColor("blue");
        System.out.println("Color of model is " + suv.getColor());
        suv.setPrice(65000);
        System.out.println("Price - " + suv.getPrice());
        System.out.println(" ");

        Cars sedan = new Cars("BMW ");
        Model sedanModel = new Model();
        sedanModel.setModel("M5 Sedan");
        Condition usedCondition = new Condition("Used ");
        System.out.println(usedCondition.getCondition() + sedan.getBrandName() + sedanModel.getModel());
        Sedan BMW = new Sedan();
        sedan.setColor("black");
        sedan.setPrice(49900);
        System.out.println("Color of model is " + sedan.getColor());
        System.out.println("Price of the day - " + sedan.getPrice());
        System.out.println(" ");

        Cars hatchback = new Cars("Honda ");
        Model hatchbackModel = new Model();
        hatchbackModel.setModel("Civic Type R hatchback");
        System.out.println(usedCondition.getCondition() + hatchback.getBrandName()+ hatchbackModel.getModel());
        Hatchback TypeR = new Hatchback();
        hatchback.setColor("red");
        hatchback.setPrice(29900);
        System.out.println("Color of model is " + hatchback.getColor());
        System.out.println("Price of the day - " + hatchback.getPrice());
        System.out.println(" ");

        System.out.println("Total cars available in store : " + Cars.getNumberOfCars());

        //Cars.ColorType metallic = sedan.new ColorType();
        Cars.ColorType metallic = sedan.new ColorType();
        metallic.printName();




        //Cars.NestedStatic nestedStatic = new Cars.NestedStatic( );
        // nestedStatic.printStatic();
        //suv.localClassExample();
        sedan.performAction();

    }
}