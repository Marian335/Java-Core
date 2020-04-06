package logos.hometask;

public class Main {
    public static void main(String[] args) {
        Methods method = new Methods();

        try {
            method.plus(-3,-5);
        } catch (IllegalArgumentException t) {
            System.out.println("IllegalArgumentException");
        }

        try {
            method.minus(0,0);
        } catch (IllegalAccessException t) {
            System.out.println("IllegalAccessException");
        }

        try {
            method.multiplication(0,9);
        } catch (ArithmeticException t) {
            System.out.println("ArithmeticException");
        }

        try {
            method.division(9,0 );
        } catch (ArithmeticException t) {
            System.out.println("ArithmeticException");
        }

    }
}
