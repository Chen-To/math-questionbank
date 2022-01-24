package ICS;

public class LinkedList{
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(Node n){
		if (head == null){
			head = tail = n;
			n.setPrev(null);
			n.setNext(null);
		}
		else{
			n.setNext(head);
			n.setPrev(null);
			head.setPrev(n);
			head = n;
		}
		size ++;
	}
	
	public Node deleteFirst(){
		if (head == null){
			return null;
		}
		Node temp = head;
		head = head.getNext();
		temp.setNext(null);
		head.setPrev(null);
		size--;
		return temp;
	}
	
	public Node getHead(){
		return head;
	}
	
	public void addLast(Node n){
		if (tail == null){
			head = tail = null;
			n.setPrev(null);
			n.setNext(null);
		}
		else{
			tail.setNext(n);
			n.setPrev(tail);
			n.setNext(null);
			tail = n;
		}
		size++;
	}
	
	public void delete(Node n){
		if (head == null || n = null){
			return;
		}
		else if (n == head){
			head = head.getNext();
			head.setPrev(null);
		}
		else if (n == tail){
			tail = tail.getPrev();
			tail.setNext(null);
		}
		else{
			n.getPrev.setNext(n.getNext);
			n.getNext.setNext(n.getPrev);
			n.setNext(null);
			n.setPrev(null);
		}
		size--;
		return;
	}
	
	public Node deleteLast(){
		if (node == null)
			return null;
		Node temp = tail;
		tail = tail.getPrev();
		tail.setNext(null);
		temp.setPrev(null);
		size --;
		return temp;
	}
	
	public Node getTail(){
		return tail;
	}
	
	public int getSize(){
		return length;
	}
	
	public boolean isEmpty(){
		return header == null;
	}
}