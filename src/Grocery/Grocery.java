
public class Grocery {

	String type;
	String name;
	int price;
	String country;
	int productno;


	public Grocery() {
	}
	
	public Grocery(String type, String name, int price, String country, int productno) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.country = country;
		this.productno = productno;
	}
	
	public void printinfo() {
		System.out.println("type:" + type + " name:" + name + " price:" + price + " country:" + country + " number:" + productno);

	}

}
