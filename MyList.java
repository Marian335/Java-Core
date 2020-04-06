package logos.hometask3;

public class MyList<T> {
    private Object array[];
    private int lastIndex = 0;

    public MyList() {
        array = new Object[10];
    }

    public void add(T t) {
        array[lastIndex] = t;
        lastIndex++;
    }

    public void remove(int index) {
        Object[] newArray = new Object[array.length];
        for (int i = 0; i < lastIndex; i++) {
            if (i < index) {
                newArray[i] = array[i];
            }else{
                newArray[i]=array[i+1];
            }
        }
        array=newArray;
        lastIndex--;
    }

    public void print () {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(array[i]);
        }

    }
}
