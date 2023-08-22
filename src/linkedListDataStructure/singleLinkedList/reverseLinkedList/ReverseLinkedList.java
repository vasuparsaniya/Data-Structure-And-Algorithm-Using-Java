package linkedListDataStructure.singleLinkedList.reverseLinkedList;
import linkedListDataStructure.singleLinkedList.insertionOperation.*;

public class ReverseLinkedList<T> extends SingleLinkedListInsertion<T> {

	ReverseLinkedList(){
		super();
	}
	
	//-------------Reverse Linked List--------------------
	public Node remove(Node n) {
		
		Node current = n;
		Node next = n.next;
		Node prev=null;
		
		if(current.next == null) {
			System.out.println("List is Empty!!");
		}else {
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev=current;
				current=next;
			}
			}
		this.head.next=prev;
		return next;
		}
	
	public void reverseLinkedList() {
		Node currNode = this.head.next;
		System.out.println("Reverse List:");
		remove(currNode);
		}
	
	public static void main(String[] args) {
		ReverseLinkedList<Integer> list=new ReverseLinkedList<Integer>();
		list.insertFront(2);
		list.insertFront(4);
		list.insertFront(6);
		list.insertFront(8);
		list.printLinkedList();
		
		list.reverseLinkedList();
		list.printLinkedList();
	}
}