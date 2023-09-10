package TypeOfUser;
import Products.Cart;

public class Customer extends User {
	private Cart cart;

	@Override
	public Boolean verifyUser() {
		// TODO Auto-generated method stub
		return true;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getuserID() {
		return userID;
	}

	public void setuserID(String userID) {
		this.userID = userID;
	}

}
