package com.example.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//laptop1: is a way of giving name to bean in container
@Component("laptop1")
public class Laptop {

    private int lid;
    private String lbrand;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLbrand() {
        return lbrand;
    }

    public void setLbrand(String lbrand) {
        this.lbrand = lbrand;
    }

    public void compile(){
        System.out.println("compiling...");
    }
}
