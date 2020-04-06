package logos.hometask;

public class Application {
    public static void main(String[] args) {
        PlaneControl control = new PlaneControl();
        SU27 plane = new SU27(60,15,232, control,512, "space-gray");
        System.out.println(plane.toString());
        plane.startEngine();
        plane.takeOff();
        plane.moveUp();
        plane.moveRight();
        plane.moveDown();
        plane.moveLeft();
        plane.technology();
        plane.strike();
        plane.turbo();
        plane.landing();
    }

}
