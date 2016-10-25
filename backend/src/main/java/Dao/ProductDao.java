package Dao;

import java.util.List;

import model.Product;

public interface ProductDao 

{
	
	void save(Product p);
	
	
	void update(Product p);
	void delete(int Productid);
	public List<Product> list1();
	public void getproductbyid(int productid);

}
