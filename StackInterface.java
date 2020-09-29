
public interface StackInterface<T> {

	public void push(T item) throws StackFullException;
	
	public T pop() throws StackEmptyException;
	 
	public T peek() throws StackEmptyException;
	
	public int size();
}
