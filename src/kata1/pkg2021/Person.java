package kata1.pkg2021;

import java.time.LocalDate;
import java.time.Period;

public class Person {
        private final String name;
        private final LocalDate birth;
        private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
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
    
    private long milliSecondsToYear(long milles){
        return milles/MILISECONDS_PER_YEAR;
    }
    
}
