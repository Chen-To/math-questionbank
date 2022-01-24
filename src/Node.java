package ICS;

public class Node{
	
	private Node next;
	private Node previous;
	private Object store;
	
	public Node(Object obj){
		store = obj;
		next = null;
		previous = null;
	}
	
	public Node(Object obj, Node next, Node previous){
		store = obj;
		this.next = next;
		this.previous = previous;
	}
	
	public void setStore(Object obj){
		store = obj;
	}
	
	public Object getStore(){
		return store;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setPrev(Node previous){
		this.previous = previous;
	}
	
	public Node setPrev(){
		return previous;
	}
	
}