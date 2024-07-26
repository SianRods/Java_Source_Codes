import java.util.ArrayList;
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();

    }

    public void add(Person person) {

        this.persons.add(person);
    }

    public boolean isEmpty() {
        boolean isRoomEmpty = false;

        if (this.persons.isEmpty()) {

            isRoomEmpty = true;
        }

        return isRoomEmpty;

    }

    public ArrayList<Person> getPersons() {

        return this.persons;

    }

    public Person shortest() {

        if (persons.isEmpty()) {

            return null;
        }
        Person shortestPerson = this.persons.get(0);

        for (Person e : persons) {
            if (e.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = e;
            }

        }

        return shortestPerson;

    }

    public Person take() {
        if (this.persons.isEmpty()) {

            return null;
        }

        Person shortestPerson = shortest();

        this.persons.remove(shortestPerson);

        return shortestPerson;

    }

}