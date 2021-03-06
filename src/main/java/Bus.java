import java.util.ArrayList;


public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengerList;


    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengerList.size();
    }

    public void addPassenger(Person person){
        if (this.passengerCount() < this.capacity){
            this.passengerList.add(person);
        }
    }

    public Person removePassenger(){
        return this.passengerList.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePerson();
        this.passengerList.add(person);
    }


}
