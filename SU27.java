package logos.hometask;

import logos.hometask.*;

public class SU27 extends Plane implements StelceTechnology, TurboBoost, Strike {
    private int maxSpeed;

    private String color;

    public SU27(int length, int width, int weight, PlaneControl control, int maxSpeed, String color){
        super(length, width, weight, control);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }



    @Override

    public String toString(){
        return "logos.hometask.SU27{width: " + super.getWidth() +
                ", length: " + super.getLength() +
                ", weight: " + super.getWeight() +
                ", maxspeed: " + maxSpeed +
                ", color: " + color +
                "}";
    }
    @Override
    public void technology(){
        System.out.println("Stelce mode time: "+(random.nextInt(10)+1)+" minute");
    }

    @Override
    public void turbo(){
        System.out.println("Boost speed is " + (maxSpeed+random.nextInt(81) + 20));
    }

    @Override
    public void strike(){
        System.out.println("Throwing nuclear bombs: "+(random.nextInt(10)+1));
    }
}
