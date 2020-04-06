package logos.hometask2;

import logos.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator myCalculator=new Calculator(20,8);

        myCalculator.plus();

        myCalculator.minus();

        myCalculator.multiply();

        myCalculator.devide();
    }
}
