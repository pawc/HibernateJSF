package model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Klasa {

    private int id;    
    private String name;
    private String city;
    private String email;
    
    public Klasa(){
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Klasa(String name, String city, String email){
        this.name=name;
        this.city=city;
        this.email=email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
	   
    public int getId(){
            return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
            this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }
          
}
