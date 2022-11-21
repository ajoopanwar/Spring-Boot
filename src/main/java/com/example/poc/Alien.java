package com.example.poc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Creates bean only when required.
@Scope(value = "prototype")
public class Alien {

    private int aid;
    private String aname;
    private String atech;

    public Alien() {
        System.out.println("Alien Object Created...");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    public void show(){
        System.out.println("In Alien ....");
    }
}
