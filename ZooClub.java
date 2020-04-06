package logos.hometask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ZooClub {
    private Map<Person, List<Animal>> map = new HashMap<>();



    public void addPerson(String name, int age){

        map.put(new Person(name,age), new ArrayList<>());

    }



    public void addAnimal(String name, String animalName, String type ) {

        map.get(findPerson(name)).add(new Animal(animalName, type));

    }



    public void removeAnimal(String name, String animalName, String type ) {

        map.get(findPerson(name)).remove(new Animal(animalName, type));

    }



    public void removePerson(String name){

        map.remove(findPerson(name));

    }



    public void removeAllAnimals( String animalName ) {

        for (List<Animal> value : map.values()) {

            for (Animal animal : value) {

                if (animal.getAnimalName().equals(animalName)){

                    value.remove(animal);

                }

            }

        }

    }



    private Person findPerson(String name){

        for(Person p : map.keySet()){

            if(p.getName().equals(name)){

                return p;

            }

        }

        return null;

    }



    @Override

    public String toString() {

        return "ZooClub{" +

                "map=" + map +

                '}';

    }
}
