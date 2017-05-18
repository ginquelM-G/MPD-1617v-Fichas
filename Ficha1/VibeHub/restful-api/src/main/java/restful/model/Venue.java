package restful.model;

/**
 * Created by Moreira on 21-04-2017.
 */
public class Venue {

    private String name;
    private Iterable<Event> events;


    public String getName() {
        return name;
    }

    public Iterable<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
