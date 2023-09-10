package Products;

public class Category {
	String CategoryName;
	Category[] subcategories;

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public Category[] getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(Category[] subcategories) {
		this.subcategories = subcategories;
	}

}
