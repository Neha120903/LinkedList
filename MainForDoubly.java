package LinkedList;

public class MainForDoubly {

	public static void main(String[] args) {
		Node n= new Node();
		n.data=10;
		Node n1=new Node();
		n1.data=20;
		Node n2= new Node();
		n2.data=30;
		Node n3=new Node();
		n3.data=40;
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.insertAtStart(n);
		obj.insertAtStart(n1);
		obj.insertAtStart(n2);
		obj.insertAtEnd(n3);
		obj.deleteBegin();
		obj.deleteAtEnd();
		obj.display();
	}

}
