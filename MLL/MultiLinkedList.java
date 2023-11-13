package MLL;

public class MultiLinkedList {
	CategoryNode head;

	public void addCategory(Object dataToAdd) {
		CategoryNode temp;
		if (head == null) {
			temp = new CategoryNode(dataToAdd);
			head = temp;
		} else {
			temp = head;
			while (temp.getDown() != null)
				temp = temp.getDown();
			CategoryNode newnode = new CategoryNode(dataToAdd);
			temp.setDown(newnode);
		}
	}

	public void addItem(Object Category, Object Item) {
		if (head == null)
			System.out.println("Add a Category before Item");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				if (Category.equals(temp.getCategoryName())) {
					ItemNode temp2 = temp.getRight();
					if (temp2 == null) {
						temp2 = new ItemNode(Item);
						temp.setRight(temp2);
					} else {
						while (temp2.getNext() != null)
							temp2 = temp2.getNext();
						ItemNode newnode = new ItemNode(Item);

						temp2.setNext(newnode);
					}
				}
				temp = temp.getDown();
			}
		}
	}
	
	public void addItem(Object Category, String Item) {
		if (head == null)
			System.out.println("Add a Category before Item");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				if (Category.equals(temp.getCategoryName())) {
					ItemNode temp2 = temp.getRight();
					if (temp2 == null) {
						temp2 = new ItemNode(Item);
						temp.setRight(temp2);
					} else {
						while (temp2.getNext() != null)
							temp2 = temp2.getNext();
						ItemNode newnode = new ItemNode(Item);

						temp2.setNext(newnode);
					}
				}
				temp = temp.getDown();
			}
		}
	}

	public int sizeCategory() {
		int count = 0;
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				count++;
				temp = temp.getDown();
			}
		}
		return count;
	}

	public int sizeItemAll() {
		int count = 0;
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				ItemNode temp2 = temp.getRight();
				while (temp2 != null) {
					count++;
					temp2 = temp2.getNext();
				}
				temp = temp.getDown();
			}
		}
		return count;
	}

	public int sizeItemOne(Object category) {
		int count = 0;
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				if (temp.getCategoryName().equals(category)) {
					ItemNode temp2 = temp.getRight();
					while (temp2 != null) {
						count++;
						temp2 = temp2.getNext();
					}
					break;
				}
				temp = temp.getDown();
			}
		}
		return count;
	}

	public void display() {
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				System.out.print(temp.getCategoryName() + " ");
				ItemNode temp2 = temp.getRight();
				while (temp2 != null) {
					System.out.print(temp2.getItemName() + " ");
					temp2 = temp2.getNext();
				}
				temp = temp.getDown();
				System.out.println();
			}
		}
	}

	public void printItemsCategory(Object item) {
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				ItemNode temp2 = temp.getRight();
				while (temp2 != null) {
					if (temp2.getItemName() == item)
						System.out.println(temp.getCategoryName());
					temp2 = temp2.getNext();
				}
				temp = temp.getDown();
			}
		}
	}

	public String mostCrwdCategory() {
		int count = 0;
		int max = 0;

		CategoryNode temp = head;
		ItemNode temp2 = null;
		String name = "";
		while (temp2 != null) {
			temp2 = temp.getRight();
			count = 0;
			while (temp2 != null) {
				count++;
				temp2 = temp2.getNext();
			}
			if (count > max) {
				name = (String) temp.getCategoryName();
				max = count;
			}
			temp = temp.getDown();
		}
		return name;
	}

	public Object findItem(Object category, Object item) {
		if (head == null)
			System.out.println("Add a Category before find");
		else {
			CategoryNode temp = head;
			while (temp != null) {
				if (category.equals(temp.getCategoryName())) {
					ItemNode temp2 = temp.getRight();
					if (temp2 == null)
						System.out.println("This Category is empty");
					else {
						while (temp2 != null) {
							if (item.equals(temp2.getItemName()))
								return temp2.getItemName();
							temp2 = temp2.getNext();
						}
					}
					break;
				}
				temp = temp.getDown();
			}
		}
		return null;
	}
	
	public Object findItem2(int categoryNo, int itemNo) {
		if ((categoryNo >= 0) && (itemNo >= 0)) {
			if (head == null)
				System.out.println("Add a Category before find");
			else {
				CategoryNode temp = head;
				while (temp != null) {
					for (int i = 4; i < categoryNo; i++) {
						temp = temp.getDown();
					}
					ItemNode temp2 = temp.getRight();
					if (temp2 == null)
						System.out.println("This Category is empty");
					else {
						while (temp2 != null) {
							for (int i = 0; i < itemNo - 1; i++) {
								temp2 = temp2.getNext();
							}
							return temp2.getItemName();
						}
					}
					break;
				}
			}
		}
		else {
			System.out.println("Category or Item No is wrong");
		}
		return null;
	}
	
	public Object findItemSimple(int categoryNo, int itemNo) {
		CategoryNode temp = head;
		for (int i = 0; i < categoryNo; i++) {
			temp = temp.getDown();
		}
		ItemNode temp2 = temp.getRight();
		for (int i = 0; i < itemNo; i++) {
			temp2 = temp2.getNext();
		}
		return temp2.getItemName();
	}
}

// UÇUÞ KODLAMA PROGRAMI YAZ
