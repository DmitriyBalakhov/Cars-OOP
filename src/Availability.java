public interface Availability  {

    String AVAILABILITY = "Availability";


    void displaySlogan();

    default void isAvailable() {
        System.out.println("Availability : Available in store");
    }

    default void isAvailableForOrder() {
        System.out.println("Availability : Order online");
    }

    static void isNotAvailable() {
        System.out.println("Availability : Currently out of stock");
    }

}
