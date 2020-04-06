package logos.hometask;

public class Animal {
    private String type;

    private int age;

    private String name;



    public void voice() {

        System.out.println("I have voice");

    }



    public void walk() {

        System.out.println("I can walk");

    }



    public void eat() {

        System.out.println("I can eat");

    }



    public String getType() {

        return type;

    }



    public void setType(String type) {

        this.type = type;

    }



    public int getAge() {

        return age;

    }



    public void setAge(int age) {

        this.age = age;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public Animal(String type, int age, String name) {

        this.type = type;

        this.age = age;

        this.name = name;

    }



    @Override

    public String toString() {

        return "Animal{" +

                "type='" + type + '\'' +

                ", age=" + age +

                ", name='" + name + '\'' +

                '}';

    }
}
