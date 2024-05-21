package events;

import java.util.Scanner;

import heroes.Persona;

public class Event {
    protected Scanner getAnswer = new Scanner(System.in);
    protected String description;
    protected Persona character;

    public Event(String Description) {
        this.description = Description;
        showDescription();
    }

    public void showDescription(){
        System.out.println(this.description);
    }


    public Event(Persona character){
        this.description = "Event";
        showDescription();
    }
}
