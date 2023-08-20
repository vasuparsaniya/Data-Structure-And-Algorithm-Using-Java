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
	
//	public Node head;
//	
//	public class Node{
//		public T data;
//		public Node next;
//		
//		//constructor
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
	
	//constructor
	LinkedList(){
		head = new Node();
	}
	
	//Method to maintain the collection to be defined
	
	//---------------------------------
	public static void main(String[] args) {
		//call all the method create in class	
		}
}