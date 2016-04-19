package model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Klasa {
    
    private String name;
    
    public Klasa(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
          
}
