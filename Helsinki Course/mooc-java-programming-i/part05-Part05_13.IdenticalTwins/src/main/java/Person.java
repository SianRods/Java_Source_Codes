
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        // Frist Comparing the memory locations
        if (this == compared) {
            return true;

        }
        // CHECKING IF THE OBJECT PASSED IS AN INSTANCE OF THE CLASS PERSON
        else if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;
        // CANNOT DIRECTLY COMPARE THE BIRTHDAYS 
        // IMPORTANT LINE --> this.birthday.equals(comparedPerson.birthday)
        // CAUSE THE TYPE OF IS SIMPLEDATE AND IF WE COMPARE ONLY TO 'comparedPerson'--> false will be returned 
        // WE HAVE TO COMPARE THE VALUE WITH ' comparedPerson.birthday '
        if(this.birthday.equals(comparedPerson.birthday)&&this.height==comparedPerson.height&&this.weight==comparedPerson.weight
        &&this.name.equals(comparedPerson.name)){
            return true;
        }

        else {
            return false ;
        }

    }

}