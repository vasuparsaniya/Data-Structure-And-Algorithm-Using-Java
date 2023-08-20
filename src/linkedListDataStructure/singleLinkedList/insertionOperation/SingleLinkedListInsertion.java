package linkedListDataStructure.singleLinkedList.insertionOperation;

public class SingleLinkedListInsertion<T>{
	//---------------If we define class Node in this program then------------------------
	/*below class Node does not need to create repeated
	 * so we create in LinkedList.java 
	 * import linkedListDataStructure.LinkedList.Node; add in every file to use Class Node*/
			
			public Node head;
			public class Node{
				public T data;
				public Node next;
				
				//constructor
				public Node(){
					data=null;
					next=null;
				}
				
				public Node(T d){
					data=d;
					next=null;
				}
			}
			
			//constructor
			public SingleLinkedListInsertion(){
				head = new Node();
			}
			//----------------Method For Single Linked List Insertion Operations--------------
			
			//-------------Print The Element Of LinkedList---------------
			public void printLinkedList() {
				Node currNode = this.head.next;
				System.out.print("Linked List:");
				if(currNode == null) {
					System.out.println("Empty!!");
				}else {
					while(currNode!=null) {
						System.out.print(currNode.data);
						currNode=currNode.next;
						
						if(currNode == null) {
							break;
						}else {
							System.out.print("->");
						}
					}
					System.out.println();
				}
				
			}
			
			//-----------Insertion at Front------------------
		
		public void insertFront(T data) {
			//create a new node with given data
			Node newNode = new Node(data);
			newNode.next = this.head.next;
			
			//Make the newNode as the firstNode
			this.head.next = newNode;
		}
		
		
		
		//--------------Insertion At End----------------------
		public void insertEnd(T data) {
			Node newNode = new Node(data);
			newNode.next = null;
			
			Node temp = this.head;
			
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
		//-------------Insert At Any Position(Key)-------------
		//Case:-1 Key is not present then not insert
		//Case:-2 Key is present then insert After that Key
		//Case:-3 Key is present then insert Before that Key
		//Here Key means data of the Linked List
		
		public void insertAfterKey(T data,T key) {
			Node newNode = new Node(data);
			Node temp=this.head;
			boolean status=false;
			
			while(temp!=null) {
				if(temp.data == key) {
					status=true;
					break;
				}
				temp=temp.next;
			}
			if(status) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Key "+key+" "+"is not present in the list");
			}			
		}
		
		public void insertBeforeKey(T data,T key) {
			Node newNode=new Node(data);
			newNode.next=null;
			Node temp=this.head.next;
			Node prev=this.head;
			boolean status=false;
			
			while(temp!=null) {
				if(temp.data == key) {
					status=true;
					break;
				}
				temp=temp.next;
				prev=prev.next;
			}
			
			if(status) {
				newNode.next=prev.next;
				prev.next=newNode;
			}else {
				System.out.println("Key "+key+" "+"is not present in the list");
			}
		}
		

		public static void main(String[] args) {
			
			SingleLinkedListInsertion<Integer> list=new SingleLinkedListInsertion<Integer>();
			
			list.insertFront(2);
			list.insertFront(4);
//			System.out.println(list);
			list.printLinkedList();
			
			list.insertEnd(6);
			list.printLinkedList();
			
			list.insertAfterKey(5, 4); //I want to add 5 after key=4
			list.insertAfterKey(5, 8); //I want to add 5 after key=4
			list.printLinkedList();
			
			list.insertBeforeKey(1, 2); //I want to add 1 before key=2
			list.insertBeforeKey(1, 10); //I want to add 1 after key=10
			list.printLinkedList();
			list.insertBeforeKey(3, 4); //I want to add 5 after key=4
			list.printLinkedList();
		}


}

//public class SingleLinkedListInsertion {
//
//	public static void main(String[] args) {
//		
//		InsertionOperation<Integer> list=new InsertionOperation<Integer>();
//		
//		list.insertFront(2);
//		list.insertFront(4);
////		System.out.println(list);
//		list.printLinkedList();
//		
//		list.insertEnd(6);
//		list.printLinkedList();
//		
//		list.insertAfterKey(5, 4); //I want to add 5 after key=4
//		list.insertAfterKey(5, 8); //I want to add 5 after key=4
//		list.printLinkedList();
//		
//		list.insertBeforeKey(1, 2); //I want to add 1 before key=2
//		list.insertBeforeKey(1, 10); //I want to add 1 after key=10
//		list.printLinkedList();
//		list.insertBeforeKey(3, 4); //I want to add 5 after key=4
//		list.printLinkedList();
//	}
//}
