package model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Klasa {

	private int id;    
    private String name;
    
    public Klasa(){
        
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
