package logos.hometask;

import java.util.Objects;

public class Human implements Comparable{
    private String name;

    private int age;



    public Human(String name, int age) {

        this.name = name;

        this.age = age;

    }



    public int getAge() {

        return age;

    }



    @Override

    public int compareTo(Object o) {

        return this.age - ((Human) o).getAge();

    }



    @Override

    public String toString() {

        return "Human{" +

                "name='" + name + '\'' +

                ", age=" + age +

                '}';

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return age == human.age &&

                Objects.equals(name, human.name);

    }



    @Override

    public int hashCode() {

        return Objects.hash(name, age);

    }
}
