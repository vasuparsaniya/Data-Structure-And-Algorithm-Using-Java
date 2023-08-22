package linkedListDataStructure.doubleLinkedList.insertionOperation;


public class DoubleLinkedListInsertion<T> {
	
	public Node head;
	
	public class Node{
		T data;
		Node next;
		Node prev; 
		
		Node(){
			data=null;
			next=null;
			prev=null;
		}
		
		Node(T d){
			data=d;
			next=null;
			prev=null;
		}
	}
	
	DoubleLinkedListInsertion(){
		head = new Node();
	}
	
	//-------------------------Insertion operation in the doubly linked list------------------
	
	//-------------Print The Element Of LinkedList---------------
	public void printLinkedList() {
		Node currNode = this.head.next;
		System.out.print("Linked List:");
		if(currNode == null) { 
			System.out.println("Empty!!");
		}else {
			while(currNode !=null) {
				System.out.print(currNode.data);
				currNode=currNode.next;
				
				if(currNode == null) {
					break;
				}else {
					System.out.print("<->");
				}
			}
			System.out.println();
		}
		
	}
	
	//-------------Print The Element Of LinkedList In Prev(At the End to Front)---------------
		public void printLinkedListInPrev() {
			Node temp = this.head.next;
			
			while(temp.next != null) {
				temp=temp.next;
			}
			
			System.out.print("Linked List from Previous Order:");
			if(this.head.next == null) { 
				System.out.println("Empty!!");
			}else {
				while(temp != this.head ) {
					System.out.print(temp.data);
					temp=temp.prev;
					
					if(temp == this.head) {
						break;
					}else {
						System.out.print("<->");
					}
				}
				System.out.println();
			}
			
		}
	
	/*In the doubly linked list for set the link, we use prev or next only in the left side of -> or <- 
	 * In the right only name of the node*/
	
	//----------Insert at Front-----------------
	
	public void insertAtFront(T data) {
		Node newNode = new Node(data);
		Node temp = this.head.next;
		
		if(this.head.next == null) {   //It check that list is empty then insert
			this.head.next = newNode;
			newNode.prev = this.head;  
			newNode.next=null;
			System.out.println("Initially list is Empty!! So Insertion successfully done..");
		}
		else {
			newNode.next=temp;
			temp.prev=newNode;
			this.head.next=newNode;
			newNode.prev=this.head;
			System.out.println("Insertion at Front successfully..");
		}
	}
	
	//----------------Insertion at End--------------------
	public void insertAtEnd(T data) {
		Node newNode = new Node(data);
		Node currNode=this.head.next;
		
		if(currNode == null) {
			this.head.next=newNode;
			newNode.prev=this.head;
			System.out.println("Initially list is empty!!So insertion is done..");
		}else {
				while(currNode.next != null) {
					currNode=currNode.next;
				}
				currNode.next=newNode;
				newNode.prev=currNode;
				System.out.println("Insertion at End is successfully done..");
		}
	}

	public static void main(String[] args) {
		DoubleLinkedListInsertion<Integer> list=new DoubleLinkedListInsertion<Integer>();
		list.insertAtFront(2);
		list.printLinkedList();
		list.insertAtFront(4);
		list.printLinkedList();
		
		list.insertAtEnd(6);
		list.printLinkedList();
		list.printLinkedListInPrev();
	}
}
