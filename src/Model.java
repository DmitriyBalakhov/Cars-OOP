public class Model {

    Model(){
       // System.out.println("This is a model constructor.");
    }

    public String model;

    /**
     * This is constructor with 1 params
     * @param model - model name of {@link Cars}
     */

    Model(String model) {
        this.model = model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

}
