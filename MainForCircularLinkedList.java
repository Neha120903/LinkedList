package LinkedList;

public class MainForCircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n= new Node();
		n.data=10;
		Node n1=new Node();
		n1.data=20;
		Node n2=new Node();
		n2.data=30;
		Node n3=new Node();
		n3.data=40;
		Node n4=new Node();
		n4.data=50;
		CircularLinkedList obj= new CircularLinkedList();
		obj.insertAtStart(n1);
		obj.insertAtStart(n);
		obj.insertAtEnd(n2);
		obj.insertAtEnd(n4);
		obj.insertAtStart(n3);
		obj.deleteAtbegin();
		obj.deleteAtEnd();
		obj.display();
	}

}
