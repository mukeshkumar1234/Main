package product;

public class Product {

	private int proId;
	private String name;
	private int price;
	
	
	public Product(int proId, String name, int price) {
		super();
		this.proId = proId;
		this.name = name;
		this.price = price;
	}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
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


	public static void main(String[] args) {
		Product pr=new Product(1,"mobile",3000);
        System.out.println(pr.getProId()+" "+pr.getName()+" "+pr.getPrice());
	}

}
