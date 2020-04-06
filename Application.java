package ua.Massive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximumValue = 0;
        int minimumValue = 0;
        int [] massive = new int[10];
        System.out.println("Please write minimum value");
        minimumValue = Integer.parseInt(reader.readLine());
        System.out.println("Please enter 10 number");
        for (int i = 0; i < massive.length; i++){
            massive[i] = Integer.parseInt(reader.readLine());
            if(minimumValue > massive[i]){
                minimumValue = massive[i];
            }
            if(maximumValue < massive[i]){
                maximumValue = massive[i];
            }
        }
        System.out.println("Maximum value " + maximumValue);
        System.out.println("Minimum value " + minimumValue);
    }
}
