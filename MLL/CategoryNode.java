package MLL;

public class CategoryNode {
	private Object CategoryName;
	private CategoryNode down;
	private ItemNode right;

	public CategoryNode(Object dataToAdd) {
		CategoryName = dataToAdd;
		down = null;
		right = null;
	}

	public Object getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(Object data) {
		this.CategoryName = data;
	}

	public CategoryNode getDown() {
		return down;
	}

	public void setDown(CategoryNode down) {
		this.down = down;
	}

	public ItemNode getRight() {
		return right;
	}

	public void setRight(ItemNode right) {
		this.right = right;
	}
}