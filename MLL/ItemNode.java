package MLL;

public class ItemNode {
	private Object ItemName;
	private ItemNode next;

	public ItemNode(Object dataToAdd) {
		ItemName = dataToAdd;
		next = null;
	}

	public Object getItemName() {
		return ItemName;
	}

	public void setItemName(Object data) {
		this.ItemName = data;
	}

	public ItemNode getNext() {
		return next;
	}

	public void setNext(ItemNode next) {
		this.next = next;
	}
}