
public class NodeBasedStack<T> implements UnboundedStackInterface<T> {

	private Node<T> top;
	
	public NodeBasedStack() {
		top=null;
	}
	
	@Override
	public T pop() throws StackEmptyException {
		if(top==null) {
			throw new StackEmptyException("pop attempted on empty stack");
		}
		else {
			T pickedUp=top.getData();
			top=top.getLink();
			return pickedUp;			
		}
	}
	@Override
	public T peek() throws StackEmptyException {
		if(top==null) {
			throw new StackEmptyException("peek attempted on empty stack");
		}
		else {
			return top.getData();
		}
	}
	@Override
	public int size() {
		int total=0;
		if(top==null) {
			return 0;
		}
		else {
			Node<T> currentNode=top;
			while(currentNode != null) {
				total++;
				currentNode=currentNode.getLink();
			}
			return total;
		}
	}
	@Override
	public void push(T item) {
		Node<T> currentNode=new Node<T>(item);
		if(top==null) {
			top= currentNode;
		}
		else {
			currentNode.setLink(top);
			top=currentNode;
		}
	}
	public String toString() {
		 Node<T> currentNode = top;
		 String content="";
		 if(currentNode!=null) {
		 while(currentNode!=null) {
			content= content+currentNode.getData()+"\n";
			currentNode=currentNode.getLink();
		 }
		return content;
		 }
		 else {
			 return "empty";
		 }
	 }
	
	
}