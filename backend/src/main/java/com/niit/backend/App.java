package com.niit.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.ProductDao;
import Dao.UserDao;
import model.Product;
import model.User;
import service.UserService;
import service.UserServiceImpl;
public class App

{
	
	@Autowired
	static UserServiceImpl ob;
	
	
	
	
    public UserServiceImpl getOb() {
		return ob;
	}




	public void setOb(UserServiceImpl ob) {
		App.ob = ob;
	}




	public static void main( String[] args )
    {
      @SuppressWarnings("resource")
	AnnotationConfigApplicationContext appobj =new AnnotationConfigApplicationContext();
      //System.out.println("aaa");
      appobj.scan("configration");
      appobj.refresh();
      UserDao ud=(UserDao)appobj.getBean("udao");
      @SuppressWarnings("unused")
	ProductDao pd=(ProductDao)appobj.getBean("pdao");
      
    User ob1=new User();
    User ob2=new User();
    User ob3=new User();
    
    Product pd1=new Product();
    pd1.setProductname("bed");
   
    pd1.setProductid(1);
    
    pd1.setProductprice("3000");
    pd1.setQuantity(1);
   
    
    //System.out.println("bein");
    
    ob1.setUsername("gayu");
    ob1.setEmail("gayu@gmail.com");
    
    ob1.setContact(982653536);
    
    ob1.setPassword("abcdefgh");
    
    
    ob2.setUsername("mohan");
    ob2.setEmail("mohan@gmail.com");
    ob2.setContact(3626322);
    ob2.setPassword("abcklshsacasaskdefgh");
    ob3.setUsername("lalitha");
    ob3.setEmail("lalitha@gmail.com");
    ob3.setContact(362632);
    ob3.setPassword("abcjsh");
    
    
    
     ud.save(ob1);
     //ud.update(ob1);
     ud.save(ob2);
     ud.save(ob3);
     //ud.delete(ob1);
    
    pd.save(pd1);
    //pd.update(pd1);
    //pd.delete(pd1);

	
}
}
