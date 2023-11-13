import entity.Persoane;
import entity.implimentation.*;
import org.hibernate.event.internal.DefaultPersistOnFlushEventListener;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Persoane> findAll = new impPersoane().outputPeopleInAgeRange(10, 25);
//        for (Persoane x:
//                findAll) {
//            System.out.println(x);
//        }

//        System.out.println("\n");

//        List<Persoane> p = new impPersoane().outputPeopleInAgeRange(10, 25);
//        for (Persoane x:
//             p) {
//            System.out.println(x);
//        }
//
//        System.out.println("\n");

//        String rataDivortului = new impPersoane().divorcePercentage();
//        System.out.println(rataDivortului);

//        List<Persoane> over18 = new impPersoane().peopleOver18('f');
//        for (Persoane x:
//             over18) {
//            System.out.println(x);
//        }
//
//        System.out.println("\n");

//        List<Persoane> marriedUnder20 = new impPersoane().marriedUnder20();
//        for (Persoane x:
//                marriedUnder20) {
//            System.out.println(x);
//        }
//
//        System.out.println("\n");

        long anonCount = new impPolls().countAnonymous();

        System.out.println(anonCount);

    }
}
