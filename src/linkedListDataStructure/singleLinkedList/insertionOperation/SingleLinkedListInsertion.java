package linkedListDataStructure.singleLinkedList.insertionOperation;

public class SingleLinkedListInsertion<T> {
	
	//---------------If we define class Node in this program then------------------------
	/*below class Node does not need to create repeated
	 * so we create in LinkedList.java 
	 * import linkedListDataStructure.LinkedList.Node; add in every file to use Class Node*/
			
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
			//----------------Method For Single Linked List Insertion Operations--------------
			
			//-----------Insertion at Front------------------
		
		public void insertFront(T data) {
			//create a new node with given data
			Node newNode = new Node(data);
			newNode.next = this.head.next;
			
			//Make the newNode as the firstNode
			this.head.next = newNode;
		}
}

class SingleLinkedListInsertionOperation{
	public static void main(String[] args) {
		
		SingleLinkedListInsertion<Integer> list=new SingleLinkedListInsertion<Integer>();
		
		list.insertFront(2);
		System.out.println(list);
	}
}
