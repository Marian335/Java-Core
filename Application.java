package ua.home.tasks;

public class Application {
    public static void main(String [] args){
          
	Robot coffeRobot = new CoffeRobot();

        Robot robotDancer = new DancerRobot();

        Robot robotCooker = new CookerRobot();

        Robot array[] = new Robot[3];

        array[0]= coffeRobot;

        array[1]= robotDancer;

        array[2]= robotCooker;

        for(int i=0; i<=2; i++ ){

            array[i].work();

            }

    }
}
