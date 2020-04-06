package logos.hometask1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer array[] = new Integer[10];
        for(int i=0; i<array.length; i++){
            array[i]= random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new ComparatorI());
        System.out.println(Arrays.toString(array));


    }
}
