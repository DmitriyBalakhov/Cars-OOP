public class Condition {

    Condition(){
        System.out.println("This is a condition constructor.");
    }

    public String condition;

    /**
     * This is constructor with 1 params
     * @param condition - condition of {@link Cars}
     */

    Condition(String condition) {
        this.condition = condition;
    }

    public void setCondition(String newCondition) {
        condition = newCondition;
    }

    public String getCondition() {
        return condition;
    }

}
