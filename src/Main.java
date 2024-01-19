import es.ulpgc.kata1.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pepe", LocalDate.of(2002,3,23));
        System.out.println(p.getName() + " tiene "+ p.getAge());
    }
}