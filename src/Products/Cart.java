package Products;

public class Cart {
	private String cartID;

	public String getCartID() {
		return cartID;
	}

	public void setCartID(String cartID) {
		this.cartID = cartID;
	}

	private Product[] listofproducts;

	public Product[] getListofproducts() {
		return listofproducts;
	}

	public void setListofproducts(Product[] listofproducts) {
		this.listofproducts = listofproducts;
	}

	public Boolean checkout() {
		return true;
	}
}
