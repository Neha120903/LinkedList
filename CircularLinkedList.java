package LinkedList;


public class CircularLinkedList {
	Node head;
	public CircularLinkedList() {
		head=null;
	}
	public void insertAtStart(Node newnode) {
		if(head==null) {
			head=newnode;
			head.next=newnode;
			return;
			}
			newnode.next=head.next;
			head.next=newnode;
			int temp=newnode.data;
			newnode.data=head.data;
			head.data=temp;
		}
	public void insertAtEnd(Node newnode) {
		insertAtStart(newnode);
		head=head.next;
	}
	public void deleteAtbegin() {
		if(head==null)
			return;
		if(head.next==head)
			return;
		head.data=head.next.data;
		head.next=head.next.next;
	}
	public void deleteAtEnd() {
		if(head==null)
			return;
		if(head.next==head)
			return;
		Node temp=head;
		while(temp.next.next!=head)
			temp=temp.next;
		temp.next=head;
	}
	public void display() {
	if(head==null)
		return;
	Node temp=head;
	while(temp.next!=head) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	 System.out.println(temp.data);
	}
}
