package model;


	import javax.persistence.Column;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name = "PRODUCT")
	public class Product {
	
		
            @Id
            
			private int productid;
			private String productname;
			private String productprice;
			private int Quantity;
			public int getProductid() {
				return productid;
			}
			public void setProductid(int productid) {
				this.productid = productid;
			}
			public String getProductname() {
				return productname;
			}
			public void setProductname(String productname) {
				this.productname = productname;
			}
			
			public String getProductprice() {
				return productprice;
			}
			public void setProductprice(String productprice) {
				this.productprice = productprice;
			}
			public int getQuantity() {
				return Quantity;
			}
			public void setQuantity(int quantity) {
				Quantity = quantity;
			}
			

}
