//abstract class Car {

/**
 * This is class {@Car}
 * {@Author} Dmitriy
 * Created by Dmitriy.Balakhov
 * Date 07.03.2024
 */
  class Cars {
    private final String brand;
    public String color;
    private int price;


    Cars(String brand) {
        this.brand = brand;
        //numberOfCars++;
    }

    /**
     * This is constructor with 3 params
     *
     * @param brand - name of {@link Cars}
     * @param price - weight of {@link Cars}
     * @param color - color of {@link Cars}
     */
    Cars(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;

    }

    public String getBrandName() {
        return brand;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public int getPrice() {
        return price;
    }



    class ColorType {
        void printName() {
            System.out.println("Metallic type of color is available for: " + brand);
        }
    }
    static class NestedStatic {
        void printStatic() {
            System.out.println("Static nested class in Cars");
        }
    }

    public void localClassExample() {
        class Local {
            void printMessage() {
                System.out.println("Additional warranty comes with: " + brand);
            }
        }
        Local local = new Local();
        local.printMessage();
    }

    interface Behavior {
        void action();
    }

    void performAction() {
        Behavior behavior = new Behavior() {
            @Override
            public void action() {
                System.out.println(brand + "wroooms. Thanks for visiting");
            }
        };
        behavior.action();
    }
}