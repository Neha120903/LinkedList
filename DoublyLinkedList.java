package LinkedList;

public class DoublyLinkedList {
Node head;
public DoublyLinkedList() {
		head=null;
	}
	public void insertAtStart(Node newnode) {
		if(head==null) {
			head=newnode;
			return;
		}
		head.prev=newnode;
		newnode.next=head;
		head=newnode;
	}
	public void insertAtEnd(Node newnode) {
		Node temp=head;
		while(temp.next!=null) 
			temp=temp.next;
		temp.next=newnode;
		newnode.prev=temp;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void deleteBegin() {
		if(head==null)
			System.out.print("List is empty");
		Node temp=head;
		head=temp.next;
		head.prev=null;
	}
	public void deleteAtEnd() {
		Node curr=head;
		while(curr.next.next!=null) 
			curr=curr.next;
		curr.next=null;
	}

}
