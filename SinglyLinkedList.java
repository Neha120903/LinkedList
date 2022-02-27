package LinkedList;

public class SinglyLinkedList {
Node head;
	public SinglyLinkedList(){
		head=null;
	}
	public void insertAtStart(Node newnode) {
		newnode.next=head;
		head=newnode;
	}
	public void insertAtEnd(Node newnode) {
		if(head==null)
			head=newnode;
		else {
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=newnode;
		}
	}
	public  void deleteAtStart() {
		if(head==null)
			System.out.print("Linked list is empty");
		Node temp=head;
		head=temp.next;
	}
	public void deleteAtEnd() {
		if(head==null)
			System.out.print("Linked list is empty");
		Node curr=head;
		while(curr.next.next!=null) 
			curr=curr.next;
		curr.next=null;
		}
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}


