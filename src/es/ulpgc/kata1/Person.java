package es.ulpgc.kata1  ;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public int getAge(){
        return (int) (Period.between(birthdate, LocalDate.now()).getYears());
    }

    public String getName() {
        return name;
    }
}
