package org.accenture.day10.model;

public class Greeting {
    private Integer id;
    private String greeting;

    public Greeting(){
    }

    public Greeting(Integer id, String greeting){
        this.id = id;
        this.greeting = greeting;
    }
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
