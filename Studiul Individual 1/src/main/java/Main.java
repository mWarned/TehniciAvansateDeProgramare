import entity.Persoane;
import entity.implimentation.impPersoane;
import org.hibernate.event.internal.DefaultPersistOnFlushEventListener;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persoane> p = new impPersoane().outputPeopleInAgeRange(10, 25);
        for (Persoane x:
             p) {
            System.out.println(x);
        }

    }
}
