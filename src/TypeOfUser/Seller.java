package TypeOfUser;
import Products.Cart;
import Products.Product;

public class Seller extends User {
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private Product[] productslisted;

	@Override
	public Boolean verifyUser() {

		return true;
	}

	public Product[] getProductslisted() {
		return productslisted;
	}

	public void setProductslisted(Product[] productslisted) {
		this.productslisted = productslisted;
	}

}
