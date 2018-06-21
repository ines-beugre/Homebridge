package com.arthur.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;


public class Person {

    @Id
    private String id;
    private String name;
    private String color;
    private String welcomeMsg;
    @Indexed(unique = true)
    private String email;
    private String image;


    //Explicit constructor
    public Person(){
    }

    public Person(String name, String color, String welcomeMsg, String email, String image) {
        this.name = name;
        this.color = color;
        this.welcomeMsg = welcomeMsg;
        this.email = email;
        this.image = image;
    }

    public String getId() {
        if (this.id == null) {
            this.id = Integer.toHexString(this.hashCode());
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
