package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.List;
import java.util.ArrayList;
import model.Klasa;

@ManagedBean
@SessionScoped
public class Data {
    
    private Klasa k;
    private HibernateUtil helper;
    private Session session;
    private String name;
	private List<Klasa> results;
        
    public String getName(){
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        k = (Klasa) session.get(Klasa.class, 1);
        this.name = k.getName();
        
        return name;
    }

	public List getResults(){
		session = helper.getSessionFactory().openSession();
		String hql = "select k from Klasa k";
		Query query = session.createQuery(hql);
		results = query.list();
		return results;
	}
    
    public void addName(String name, String city, String email){
        k = new Klasa(name, city, email);
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(k);
        session.getTransaction().commit();
        session.close();
    }
}
