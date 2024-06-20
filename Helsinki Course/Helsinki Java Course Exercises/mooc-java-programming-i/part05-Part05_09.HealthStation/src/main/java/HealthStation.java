
public class HealthStation {
    // Creating new Person object variable for counting the number of  wighings performed 
    private Person countPerson = new Person(null, 0, 0, 0);

    public int weigh(Person person) {
    countPerson.setHeight(countPerson.getHeight()+1);
      return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int weighings(){
        return countPerson.getHeight();
    }

}
