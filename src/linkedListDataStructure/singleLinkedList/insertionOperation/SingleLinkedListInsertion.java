package linkedListDataStructure.singleLinkedList.insertionOperation;

public class SingleLinkedListInsertion<T> {
	
	//Creating a Linked List Structure
	Node head;
	
	class Node{
		T data;
		Node next;
		
		//constructor
		Node(){
			data=null;
			next=null;
		}
		
		Node(T d){
			data=d;
			next=null;
		}
	}
	
	SingleLinkedListInsertion(){
		head = new Node();
	}

	public static void main(String[] args) {
		
	}
}