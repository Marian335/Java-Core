package logos.hometask;

import java.util.Random;
public class PlaneControl {
    Random random = new Random();

    public final void moveUp(){
        System.out.println("logos.hometask.Plane move up by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveDown(){
        System.out.println("logos.hometask.Plane move down by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveLeft(){
        System.out.println("logos.hometask.Plane move left by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveRight(){
        System.out.println("logos.hometask.Plane move right by "+(random.nextInt(100)+1)+" meters");
    }
}
