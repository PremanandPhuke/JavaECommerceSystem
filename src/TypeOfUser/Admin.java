package TypeOfUser;
import Products.Cart;
import Products.Product;

public class Admin extends User {
	private Product[] productslisted;
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product[] getProductslisted() {
		return productslisted;
	}

	public void setProductslisted(Product[] productslisted) {
		this.productslisted = productslisted;
	}

	@Override
	public Boolean verifyUser() {

		return true;
	}
}
