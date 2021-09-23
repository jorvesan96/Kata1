package kata1.pkg2021;

import java.time.LocalDate;
import java.time.Period;

public class Person {
        private final String name;
        private final LocalDate birth;
    public Person(String name, LocalDate birth) {
        this.birth=birth; 
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }
    
    public Period getAge(){
        LocalDate today=LocalDate.now();
        return  Period.between(birth, today);
    }
    
}
