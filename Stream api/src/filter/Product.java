package filter;

public class Product {
	
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	Product(int id,String name,int price ){
		this.id=id;
		this.name=name;
		this.price=price;	
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
