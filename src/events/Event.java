package events;

public class Event {
    protected String description;

    public void showDescription(){
        System.out.println(this.description);
    }
    public Event(String description){
        this.description = description;
        showDescription();
    }
    public Event(){
        this.description = "Event";
        showDescription();
    }
}
