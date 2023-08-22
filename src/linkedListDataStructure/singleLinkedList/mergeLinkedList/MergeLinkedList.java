package linkedListDataStructure.singleLinkedList.mergeLinkedList;
import linkedListDataStructure.singleLinkedList.insertionOperation.*;

public class MergeLinkedList<T> extends SingleLinkedListInsertion<T> {
	
	//Structure of Node will be  use from import package insertionOperation
	
	//constructor
	MergeLinkedList(){
		super();       //super class (SingleLinkedListInsertion) default constructor call here
	}
	
	//---------------------Merge Two linked list At End-----------------------
	/*-->In this method we merge two linked list.
	 * -->second linked list is merge with first one at the End of first linked list.*/
	
	public void mergeLinkedListAtEnd(MergeLinkedList<T> l2) {
		Node l1Node = this.head;
		Node l2Node = l2.head;
		
		if(l1Node.next == null || l2Node.next == null) {
			System.out.println("List is Empty!!So merge linked list at End is not posible");
		}else {
			while(l1Node.next != null) {
				l1Node=l1Node.next;
			}
			l1Node.next=l2Node.next;
			l2Node.next=null; //second linked list head make free from memory
			System.out.println("Linked List Merged Successfully At Front!!");
			}
		}
	
	//---------------------Merge Two linked list At Front-----------------------
		/*-->In this method we merge two linked list.
		 * -->second linked list is merge with first one at the Front of first linked list.*/
	
	public void mergeLinkedListAtFront(MergeLinkedList<T> l2) {
		Node l1Node=this.head;
		Node l2Node=l2.head;
		
		if(l1Node.next == null || l2Node.next == null) {
			System.out.println("List is Empty!!So merge linked list at Front is not posible");
		}else {
			while(l2Node.next != null) {
				l2Node=l2Node.next;
			}
			l2Node.next=l1Node.next;
			l1Node.next=l2.head.next;  
			l2.head=null;    //second linked list head make free from memory 
			System.out.println("Linked List Merged Successfully At Front!!");
			}
		}
	
	//------------------Merge linked list at given key-------------------------
	/*-->In this we have one key
	 * -->That key is search in the first list 
	 * -->If that key is found then merge second list After or Before that key*/
	
	//Merge After that key
	/*-->First check that linked list is empty or not
	 * -->If key is present then
	 * -->If key is present at Front of the first list then First sent link of last node of second list with first node of first list
	 * -->then head of first node is set with first node of second list
	 * -->If key is present at End of the first list then set then link of last node of the first list with first lnode of second list
	 * -->If key is present any other place of the fist list then 
	 * -->First set the link of last node of the second list with after key present in the first list
	 * -->Then set the link of key present node in the fist list with the first node in the second list
	 * -->Make head free from memory of the second list
	 * -->If key is not present then print message.*/
	
	public void mergeAterKey(MergeLinkedList<T> l2, T key) {
		Node l1Node = this.head;
		Node l2Node= l2.head;
		
		if(l1Node.next == null || l2Node.next == null) {
			System.out.println("List is Empty!!So merge linked list at key is not posible..");
		}else {
			while(l2Node.next != null) {
				l2Node=l2Node.next;
			}
			while(l1Node != null) {	
				if(l1Node.data == key) {
						l2Node.next=l1Node.next;
						l1Node.next=l2.head.next;
						l2.head.next=null;
						System.out.println("Linked List merge Successfully After Key");
						break;
				}else {
					l1Node=l1Node.next;
					
					if(l1Node.next == null && l1Node.data != key) {   //check that l1Node is present at end still key is not found
						System.out.println("Key is not found!!");
						break;
					}
//					if(l1Node.next == null && l1Node.data == key) {   //check that key is present at end or not
//						l1Node.next=l2.head.next;
//						l2.head.next=null;  //free the head of second list
//						System.out.println("Linked List merge successfully!!Key is present at the end of first list");
//						break;
//					}
				}
			}
		}
	}
	
	//Merge Before that key
		/*-->First check that linked list is empty or not
		 * -->If key is present then
		 * -->If key is present at Front of the first list then First sent link of last node of second list with first node of first list
		 * -->then head of first node is set with first node of second list
		 * -->If key is present at End of the first list 
		 * -->We take two node l1Node and l1NodePrev 
		 * -->First set the link of last node of second list with l1Node
		 * -->then set the link of l1NodePrex->next with first node of the second list
		 * -->If key is present other place then first set the link of the last node of the second list with l1Node
		 * -->and l1NodePrev->next set with the first node of the second list 
		 * -->Make head free from memory of the second list
		 * -->If key is not present then print message.*/
	
	public void mergeBeforeKey(MergeLinkedList<T> l2, T key) {
		Node l1Node = this.head;
		Node l1NodePrev = null;
		Node l2Node = l2.head;
		
		if(l1Node.next == null || l2Node.next == null) {
			System.out.println("List is Empty!!Linked List Merge Before key is not posible..");
		}else {
			while(l2Node.next != null) {
				l2Node=l2Node.next;
			}
			
			while(l1Node != null) {
				if(l1Node.data == key) {
					l2Node.next=l1Node;
					l1NodePrev.next=l2.head.next;
					l2.head.next=null;
					System.out.println("Link List Merge Successfully..");
					break;
				}else {
					
					l1NodePrev = l1Node;
					l1Node=l1Node.next;
					
					if(l1Node.next == null && l1Node.data != key) {  //here we check that last node still does not have key 
						System.out.println("Key is not Found");
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MergeLinkedList<Integer> list1=new MergeLinkedList<Integer>();
		MergeLinkedList<Integer> list2=new MergeLinkedList<Integer>();
		
		list1.insertFront(2);
		list1.insertFront(4);
		list1.insertFront(6);
		list1.insertFront(8);
		list1.printLinkedList();
		
		list2.insertFront(1);
		list2.insertFront(3);
		list2.insertFront(5);
		list2.insertFront(7);
		list2.printLinkedList();
		
//		list1.mergeLinkedListAtEnd(list2);
//		list1.printLinkedList();
		
//		list1.mergeLinkedListAtFront(list2);
//		list1.printLinkedList();
		
//		list1.mergeAterKey(list2,2);
//		list1.printLinkedList();
		
		list1.mergeBeforeKey(list2,2);
		list1.printLinkedList();
	}
}