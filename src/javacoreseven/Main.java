package javacoreseven;

public class Main {

    public static void main(String[] args) {

        Su27 su27 = new Su27(100, 20, 16_000, 3000, "gray");
        Control control = new Control();

        parametersPlane(su27);
        su27.launchEnginePlane();
        su27.takeOffPlane();
        System.out.println();
        controlPlane(control);
        su27.stealthTechnology();
        su27.nuclearStrike();
        su27.turboAcceleration();
        su27.landingPlane();
    }

    public static void parametersPlane(Su27 su27) {
        System.out.println("Length su-27 = " + su27.getLength());
        System.out.println("Width su-27 = " + su27.getWidth());
        System.out.println("Weight su-27 = " + su27.getWeight());
        System.out.println("Max speed su-27 = " + su27.getMaxSpeed());
        System.out.println("Color su-27: " + su27.getColor());
        System.out.println();
    }

    public static void controlPlane(Control control) {
        control.motionUp();
        control.motionLeft();
        control.motionDown();
        control.motionRight();
        System.out.println();
    }

}
