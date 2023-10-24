package utils;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
		return price * quantity;
	}
	
	//Atualiza o atributo quantity para mais...
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	//Atualiza o atributo quantity para menos...
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product data: " 
					+ name 
				    + ", $ " 
					+ String.format("%.2f", price) 
					+ ", " 
					+ quantity 
					+ " units, Total: $ "
				    + String.format("%.2f", totalValueStock()); 
				    
	}

}
