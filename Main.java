package logos.hometask3;

public class Main {
    public static void main(String[] args) {
        MyList<String> people = new MyList<>();
        people.add("Ivan");
        people.add("Petro");
        people.add("Olena");
        people.add("Pavlo");
        System.out.println("before removal");
        people.print();
        people.remove(1);
        System.out.println("after removal");
        people.print();
    }
}
