package logos.hometask;

public class Methods {

    private int a;
    private int b;

    public int plus(int a ,int b){
        if(a<0&&b<0){
            throw new IllegalArgumentException();
        }
        return a+b;
    }

    public int multiplication(int a, int b){
        if(a==0&&b!=0){
            throw new ArithmeticException();
        }
        return a*b;
    }

    public int minus(int a, int b) throws IllegalAccessException {
        if(a==0&&b==0){
            throw new IllegalAccessException();
        }
        return a-b;
    }

    public int division(int a, int b){
        if(a!=0&&b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
