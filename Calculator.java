package logos.calculator;

import logos.hometask2.Numerable;

public class Calculator implements Numerable {
    private int a,b;

    public Calculator(int a, int b){

        this.a=a;
        this.b=b;

    }

    @Override
    public void plus() {

        System.out.println("Addition: " + (a+b));

    }

    @Override

    public void minus() {

        System.out.println("Subtraction: " + Math.abs(a-b));

    }

    @Override

    public void multiply() {

        System.out.println( "Мultiplication: " + (a*b));

    }

    @Override

    public void devide() {

        System.out.println("Division: "+ (a/b));

    }

}
