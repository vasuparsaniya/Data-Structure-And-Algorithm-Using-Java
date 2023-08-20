package linkedListDataStructure.singleLinkedList.insertionOperation;
import linkedListDataStructure.LinkedList;  // Import the LinkedList class

import linkedListDataStructure.LinkedList.Node;

public class SingleLinkedListInsertionTemp<T> {
	
	//--------------------------------------------------------------------

		//---------------If we define class Node in this program then------------------------
		
		/*below class Node does not need to create repeated
		 * so we create in LinkedList.java 
		 * import linkedListDataStructure.LinkedList.Node; add in every file to use Class Node*/
		
//		Node head;
//		class Node{
//			T data;
//			Node next;
//			
//			//constructor
//			Node(){
//				data=null;
//				next=null;
//			}
//			
//			Node(T d){
//				data=d;
//				next=null;
//			}
//		}
		
//		SingleLinkedListInsertion(LinkedList<T> linkedList){
//			head = linkedList.new Node();
//		}
		
//--------------------------------------------------------------------

	//Creating a Linked List Structure
	LinkedList<T> linkedList;
	LinkedList<T>.Node head;  // Use LinkedList<T>.Node instead of just Node
		
	SingleLinkedListInsertionTemp(LinkedList<T> linkedList){
		head = linkedList.new Node();
	}
	
	//----------------Method For Single Linked List Insertion Operations--------------
	
	//-----------Insertion at Front------------------
	
	public void insertFront(T data) {
		//create a new node with given data
		Node newNode = linkedList.new Node(data);
		newNode.next = this.head.next;
		
		//Make the newNode as the firstNode
		this.head.next = newNode;
	}
}

class SingleLinkedListOperations{
	public static void main(String[] args) {

		LinkedList<Integer> linkList = new LinkedList<Integer>();
		SingleLinkedListInsertionTemp<Integer> list=new SingleLinkedListInsertionTemp<Integer>(linkList);
		
		list.insertFront(1);
		System.out.println("hello");
	}
}