package logos.hometask;

public class Animal {
    private String animalName;

    private String type;



    @Override

    public String toString() {

        return "Animal{" +

                "animalName='" + animalName + '\'' +

                ", type='" + type + '\'' +

                '}';

    }



    public String getAnimalName() {

        return animalName;

    }



    public void setAnimalName(String animalName) {

        this.animalName = animalName;

    }



    public String getType() {

        return type;

    }



    public void setType(String type) {

        this.type = type;

    }



    public Animal(String name, String type) {

        this.animalName = name;

        this.type = type;



    }
}
