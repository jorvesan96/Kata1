
package kata1.pkg2021;

import java.time.LocalDate;
import java.time.Period;



public class Kata12021 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1949,9,24);
        Person person = new Person("Blas", birthday);
        System.out.println(person.getName()+" tiene "+person.getAge().getYears()+ " años.");
    }
    
}
