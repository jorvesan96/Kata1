package kata1.pkg2021;

import java.util.Date;

public class Person {
        private final String name;
        private final Date birth;
    public Person(String name, Date birth) {
        this.birth=birth; 
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()-birth.getTime())/3153600000L);
    }
    
}
