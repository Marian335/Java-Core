package logos.hometask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 - Add a club member\n" +

                " 2 - Add an animal to a club member\n" +

                " 3 - Remove an animal from a club member\n" +

                " 4 - Remove a member from the club\n" +

                " 5 - remove a specific animal from all participants\n" +

                " 6 - display the zoo club\n" +

                " 7 - Exit the program\n");



        int num = 0;

        while (num != 7) {

            System.out.println("Chose number : ");

            num = sc.nextInt();

            switch (num) {

                case 1: {

                    System.out.println("Name: ");

                    String enterPersonName = sc.next();

                    System.out.println("Age: ");

                    int enterPersonAge = sc.nextInt();

                    zooClub.addPerson(enterPersonName, enterPersonAge);

                    System.out.println("Entered successfully");

                    break;

                }

                case 2: {

                    System.out.println("Person name: ");

                    String enterPersonName = sc.next();

                    System.out.println("Enter animal name: ");

                    String enterAnimalName = sc.next();

                    System.out.println("Enter animal type: ");

                    String enterType = sc.next();

                    zooClub.addAnimal(enterPersonName, enterAnimalName, enterType);

                    System.out.println("Entered successfully");

                    break;

                }

                case 3: {

                    System.out.println("Person name: ");

                    String enterPersonName = sc.next();

                    System.out.println("Enter animal name: ");

                    String enterAnimalName = sc.next();

                    System.out.println("Enter animal type: ");

                    String enterType = sc.next();

                    zooClub.removeAnimal(enterPersonName, enterAnimalName, enterType);

                    System.out.println("Removed successfully");

                    break;

                }

                case 4: {

                    System.out.println("Name: ");

                    String enterPersonName = sc.next();

                    zooClub.removePerson(enterPersonName);

                    System.out.println("Removed successfully");

                    break;

                }

                case 5: {

                    System.out.println("Enter animal name: ");

                    String enterAnimalName = sc.next();

                    zooClub.removeAllAnimals(enterAnimalName);

                    System.out.println("Removed successfully");

                    break;

                }

                case 6: {

                    System.out.println(zooClub);

                    break;

                }

            }

        }
    }
}
