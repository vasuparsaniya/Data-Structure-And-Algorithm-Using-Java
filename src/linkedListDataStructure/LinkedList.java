package linkedListDataStructure;

public class LinkedList<T> {
	
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
	
	//constructor
	LinkedList(){
		head = new Node();
	}
	
	//Method to maintain the collection to be defined
}

class JLinkedList{
	public static void main(String[] args) {
		
	}
}
