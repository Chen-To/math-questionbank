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
			head = tail = n;
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
		if (n == null || head == null){
			return;
		}
		else if (n == head){
			head = head.getNext();
			if (head != null)
				head.setPrev(null);
		}
		else if (n == tail){
			tail = tail.getPrev();
			if (tail != null)
				tail.setNext(null);
		}
		else{
			n.getPrev().setNext(n.getNext());
			n.getNext().setNext(n.getPrev());
			n.setNext(null);
			n.setPrev(null);
		}
		size--;
		return;
	}
	
	public Node deleteLast(){
		if (tail == null)
			return null;
		Node temp = tail;
		tail = tail.getPrev();
		tail.setNext(null);
		temp.setPrev(null);
		size --;
		return temp;
	}
	
	public Node getIndex(int indexGoal, int curIndex, Node curNode){
		if (indexGoal == curIndex){
			return curNode;
		}
		return getIndex(indexGoal, curIndex+1, curNode.getNext());
	}
	
	public Node getIndexHelper(int indexGoal){
		return getIndex(indexGoal, 0, head);
	}
	
	public void sortAlpha(){
		if (head == null)
			return;
		for (int i = 0; i < size; i ++){
			Node n = head;
			for (int k = 0; k < size-i-1; k ++){
				String strA = ((Problem)(n.getStore())).getName();
				String strB = ((Problem)(n.getNext().getStore())).getName();
				if (strB.compareTo(strA) < 0){
					swapValues(n, n.getNext());
				}
				n = n.getNext();
			}
		}
	}
	
	public void sortNum(){
		if (head == null)
			return;
		
		for (int i = 0; i < size; i ++){
			Node n = head;
			for (int k = 0; k < size-i-1; k ++){
				int a = Integer.parseInt(((Problem)(n.getStore())).getDifficulty());
				int b = Integer.parseInt(((Problem)(n.getNext().getStore())).getDifficulty());
				if (b < a){
					swapValues(n, n.getNext());
				}
				n = n.getNext();
			}
		}
	}
	
	public void swapValues(Node a, Node b){
		Problem temp = (Problem)(a.getStore());
		a.setStore(b.getStore());
		b.setStore(temp);
	}
	
	public Node getTail(){
		return tail;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
}