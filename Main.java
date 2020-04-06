package logos.hometask;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<Object> unsortedHumans = new HashSet<>();
        unsortedHumans.add(new Human("Ivan", 45));
        unsortedHumans.add(new Human("Pavlo", 21));
        unsortedHumans.add(new Human("Olga", 31));
        unsortedHumans.add(new Human("Petro", 50));
        System.out.println("Before sorting" + unsortedHumans);
        SortedSet<Object> human = new TreeSet<>(unsortedHumans);
        System.out.println("After sorting" + human);


    }
}