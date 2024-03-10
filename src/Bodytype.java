public class Bodytype {
    Bodytype(){
    //    System.out.println("This is a bodytype constructor");
    }

    public String bodytype;

    /**
     * This is constructor with 1 params
     * @param bodytype - bodytype of {@link Cars}
     */

    Bodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public void setBodytype(String newbodytype) {
        bodytype = newbodytype;
    }

    public String getBodytype() {
        return bodytype;
    }

}
