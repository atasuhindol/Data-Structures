package CSLL;

import java.util.Stack;

public class CircularLinkedList {
	Node head;

	public void add(Object dataToAdd) {
		Node newNode = new Node(dataToAdd);

		if (head == null) {
			head = newNode;
			head.setLink(head);
		}
		else {
			Node temp = head;

			while (temp.getLink() != head) {
				temp = temp.getLink();
			}

			temp.setLink(newNode);
			newNode.setLink(head);
			head = newNode;
		}
	}

	public void displayBack() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		Node temp = head;

		do {
			System.out.print(temp.getData() + " ");
			temp = temp.getLink();
		} while (temp != head);
		System.out.println();
	}
	
	public void displayForw() {
		Stack<Object> stck = new Stack<Object>();
		if (head == null) {
			System.out.println("List is empty!");
		}
		else {
			Node temp = head;
			do {
				stck.push(temp.getData());
				temp = temp.getLink();
			} while (temp != head);
			while (stck.isEmpty() != true) {
				System.out.print(stck.pop() + " ");
			}
		}
	}

	public Object elementX(int index) {
		Stack<Object> stck = new Stack<Object>();
		if (head == null) {
			return null;
		}
		Node temp = head;
		do {
			stck.push(temp.getData());
			temp = temp.getLink();
		} while (temp != head);
		for (int i = 0; i < index - 1; i++) {
			stck.pop();
		}
		return stck.peek();
	}

	public boolean search(Object obj) {
		if (head == null) {
			return false;
		}

		Node temp = head;

		do {
			if (temp.getData().toString().equals(obj.toString()))
				return true;

			temp = temp.getLink();
		} while (temp != head);

		return false;
	}
	
	public int size() {
		int count = 0;
		if (head == null)
			System.out.println("Linked List is empty");
		else {
			Node temp = head;
			do {
				count++;
				temp = temp.getLink();
			} while (temp != head);
		}
		return count;
	}

	public void delete(Object obj) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		do {
			if (temp.getData().toString().equals(obj.toString())) {
				// FILL THIS GAP
			}
		} while (temp != head);
		System.out.println("This object is NOT exist");
	}

	public Object josephus(int x, int y) {
		int total = 0;
		CircularLinkedList cll = new CircularLinkedList();
		for (int i = 1; i <= x; i++)
			cll.add(i);
		while (cll.size() == 1) {
			total = total + y;
			while (total > x)
				total = total - x;
			cll.delete(total);
		}
		return cll.elementX(0);
	}
	
	public void elementChange(int index, Object data) {
		if (head == null)
			System.out.println("Make a list first");
		else {
			Node temp = head;
			index = size() - index;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getLink();
			}
			temp.setData(data);
		}
	}
	
	public void elementChangeBack(int index, Object data) {
		if (head == null)
			System.out.println("Make a list first");
		else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.getLink();
			}
			temp.setData(data);
		}
	}
	
}