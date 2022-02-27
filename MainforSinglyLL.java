package LinkedList;

public class MainforSinglyLL {
public static void main(String[]args) {
	Node n1=new Node();
	Node n2=new Node();
	Node n3=new Node();
	Node n4=new Node();
	Node n5=new Node();
	n1.data=10;
	n2.data=20;
	n3.data=30;
	n4.data=40;
	n5.data=50;
	SinglyLinkedList obj= new SinglyLinkedList();
	obj.insertAtStart(n1);
	obj.insertAtStart(n2);
	obj.insertAtEnd(n5);
	obj.insertAtEnd(n4);
	obj.insertAtStart(n3);
	obj.deleteAtStart();
	obj.deleteAtEnd();
	obj.display();
}
}
