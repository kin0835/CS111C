import java.util.Arrays;

public class NoDupsDePrioritizeArrayQueue<T> extends ArrayQueue<T> 
	implements NoDupsDePrioritizeQueueInterface<T> {


	public NoDupsDePrioritizeArrayQueue() {
		super();
	} 
	public NoDupsDePrioritizeArrayQueue(int initialCapacity) {
		super(initialCapacity);
	} 
	@Override
	public void enqueue(T newEntry) {
		super.enqueue(newEntry);
	} 
	
	public void moveToBack(T entry) {
		// YOUR CODE HERE
	}

	public void display() {
		System.out.print("Display: \nFRONT :" );
		for(int i = 0; i <= backIndex; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println("BACK");

	}
}
