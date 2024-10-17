package day9;

public class Product {
	private int productId;
	private String productName;
	protected double price;
	
	public Product() {
		
	}
	
	public Product(int productId,String productName,double price) {
		this.price=price;
		this.productId=productId;
		this.productName=productName;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId=productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
	

}
