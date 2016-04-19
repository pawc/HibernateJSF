/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author pawc
 */

@ManagedBean
@SessionScoped
public class Data {
    
    private Klasa k;
    private HibernateUtil helper;
    private Session session;
    private String name;
        
    public String getName(){
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        k = (Klasa) session.get(Klasa.class, 1);
        this.name = k.getName();
        
        return name;
    }
}
