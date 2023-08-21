package linkedListDataStructure.singleLinkedList.deletionOperation;
import linkedListDataStructure.singleLinkedList.insertionOperation.*;


public class SingleLinkedListDeletion<T> extends SingleLinkedListInsertion<T>{ 
//	Node head;
	
//	public class Node{
//		T data;
//		Node next;
//		
//		public Node(){
//			data=null;
//			next=null;
//		}
//		
//		public Node(T d){
//			data=d;
//			next=null;
//		}
//	}
//	
	public SingleLinkedListDeletion(){
		super();
//		head=new Node();
	}
	
	//-----------------Methods for deletion operation---------------

	//-------------Deletion At Front-----------------
	
	public T deletionFront() {
		T x=null;
	
		Node temp=this.head.next;
		if(temp!=null) {
			x=temp.data;
			head.next=temp.next;
			System.out.println("Element "+x+" "+"deleted at front!");
		}else {
			System.out.println("List is Empty!So deletion at front is failed..");
		}
		return x;
	}
	
	//----------Deletion At End-------------------
	public T  deletionEnd() {
		T x=null;
		Node currNode=this.head.next;
		Node prev=null;
		
		if(currNode == null) {
			System.out.println("List is Empty! So deletion at end is failed..");
		}else if(currNode.next == null){
			x=currNode.data;
			System.out.println("Element "+x+" "+"deleted at end!");
			head.next=null;
		}else {
			while(currNode.next!=null) {
				prev=currNode;
				currNode=currNode.next;
			}
			x=currNode.data;
			System.out.println("Element "+x+" "+"deleted at end!");
			
		    /*If list only have one element and 
		     * we perform deletionEnd() then we saw NullPointerException 
		     * so we handle it using if condition*/
			
			prev.next=null;   
		}
		return x;
	}
	
	//---------------Deletion At Any(Key is Given)-------------
	//Case:-1 If key is not present then nothing will be deleted
	//Case:-2 If key is present then delete After that key
	//Case:-3 If key is present then delete Before that key
	
	public void deleteAfterKey(T key) {
		Node currNode=this.head.next;
		Node temp=currNode.next;
		
		if(this.head.next == null) {
			System.out.println("List is Empty!! So deletion after key is failed..");
		}else {
			while(currNode != null) {
				if(currNode.data == key) {
					if(temp == null) {
						System.out.println("Key found at the end of the list.So deletion after that key is not posible");
						break;
					}else {
						currNode.next=temp.next;
						temp.next=null;
						System.out.println("Element is deleted successfully after key "+key+" "+"and deleted element is "+" "+currNode.data);
						break;
					}
				}else {
					if(temp == null) {
						System.out.println("Key is not found");
						break;
					}
					temp=temp.next;
					currNode=currNode.next;
				}
				
			}
		}
	}
	
	
	//----------------------------------
	public static void main(String[] args) {

		SingleLinkedListDeletion<Integer> list=new SingleLinkedListDeletion<>();
//		
		list.insertFront(2);
		list.insertFront(4);

		list.printLinkedList();
		
		list.insertEnd(6);
		list.printLinkedList();

//		list.deletionFront();
//		list.printLinkedList();
//		list.deletionFront();
//		list.printLinkedList();
//		list.deletionFront();
//		list.printLinkedList();
//		list.deletionFront();
//		list.printLinkedList();
//		list.deletionEnd();
//		list.printLinkedList();
		
		list.deleteAfterKey(6);
		list.printLinkedList();
	}
}
