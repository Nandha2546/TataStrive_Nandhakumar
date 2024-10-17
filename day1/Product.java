package day1;

class Product {
	private String name;
    private double price;
    private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void printProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }

 public static void main(String [] args) {
	 Product product=new Product();
	 product.setName("book");
	 product.setPrice(200);
	 product.setQuantity(10);
	 product.printProductDetails();
	 
	 
 }
	

}
